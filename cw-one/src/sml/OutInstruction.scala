package sml

/**
  * This class ....
  *
  * @author someone
  */
case class OutInstruction(label: String, opcode: String, register: Int) extends Instruction(label, opcode) {

  override def execute(m: Machine) =
    println(m.regs(register))

  override def toString(): String = {
    super.toString + " print register " + register + " value\n"
  }
}

object OutInstruction {
  def apply(label: String, register: Int) =
    new OutInstruction(label, "out", register)
}
