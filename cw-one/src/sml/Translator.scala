package sml

import java.lang.ClassNotFoundException

/*
 * The translator of a <b>S</b><b>M</b>al<b>L</b> program.
 */
class Translator(fileName: String) {

  // word + line is the part of the current line that's not yet processed
  // word has no whitespace
  // If word and line are not empty, line begins with whitespace

  /**
    * translate the small program in the file into lab (the labels) and prog (the program)
    */
  def readAndTranslate(m: Machine): Machine = {
    val labels = m.labels
    var program = m.prog
    import scala.io.Source
    val lines = Source.fromFile(fileName).getLines
    for (line <- lines) {
      val fields = line.split(" ")
      if (fields.length > 0) {
        labels.add(fields(0))
        val opcode = fields(1)

        // each instruction class needs to be defined as "sml.<Opcode>Instruction",
        // this is to allow the SML language to be extended without having to modify this code
        try {
          val instructionClassName = "sml." + opcode.capitalize + "Instruction"
          val instructionObject = Class.forName(instructionClassName).getConstructor(classOf[Array[String]]).newInstance(fields)
          program = program :+ instructionObject.asInstanceOf[Instruction]
        } catch {
         case ex: ClassNotFoundException => {
            println(s"Unknown instruction " + opcode)
         }
        }
    }
  }
    new Machine(labels, program)
  }
}

object Translator {
  def apply(file: String) =
    new Translator(file)
}
