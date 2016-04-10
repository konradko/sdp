package sml

/*
 * Instruction for subtraction
 */
class SubInstruction(fields: Array[String]) extends Instruction(fields(0), "sub") {
  val result = fields(2).toInt
  val op1 = fields(3).toInt
  val op2 = fields(4).toInt

  override def execute(m: Machine) {
    val value1 = m.regs(op1)
    val value2 = m.regs(op2)
    m.regs(result) = value1 - value2
  }

  override def toString(): String = {
    super.toString + " " + op1 + " - " + op2 + " to " + result + "\n"
  }
}
