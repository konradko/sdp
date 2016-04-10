package sml

/*
 * Instruction for assigning value to register
 */
case class LinInstruction(fields: Array[String]) extends Instruction(fields(0), "lin") {

  val register = fields(2).toInt
  val value = fields(3).toInt

  override def execute(m: Machine) =
    m.regs(register) = value

  override def toString(): String = {
    super.toString + " register " + register + " value is " + value + "\n"
  }
}
