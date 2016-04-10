package sml

/*
 * Instruction for printing out register value
 */
case class OutInstruction(fields: Array[String]) extends Instruction(fields(0), "out") {

  val register = fields(2).toInt

  override def execute(m: Machine) =
    println(m.regs(register))

  override def toString(): String = {
    super.toString + " print register " + register + " value\n"
  }
}
