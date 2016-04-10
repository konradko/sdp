package sml

/*
 * Instruction for flow control
 */
case class BnzInstruction(fields: Array[String]) extends Instruction(fields(0), "bnz") {
  val label = fields(0)
  val register = fields(2).toInt
  val gotoLabel = fields(3)

  override def execute(m: Machine) =
    if (m.regs(register) != 0) {
      m.execute(m.labels.get(gotoLabel), m.labels.get(label) + 1)
    }

  override def toString(): String = {
    super.toString + " if register " + register + " value is not 0 go to label " + gotoLabel + "\n"
  }
}
