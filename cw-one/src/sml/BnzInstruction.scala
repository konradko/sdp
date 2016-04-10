package sml

/**
  * This class ....
  *
  * @author someone
  */
case class BnzInstruction(label: String, opcode: String, register: Int, gotoLabel: String) extends Instruction(label, opcode) {

  override def execute(m: Machine) =
    if (m.regs(register) != 0) {
      m.execute(m.labels.get(gotoLabel), m.labels.get(label) + 1)
    }

  override def toString(): String = {
    super.toString + " if register " + register + " value is not 0 go to label " + gotoLabel + "\n"
  }
}

object BnzInstruction {
  def apply(label: String, register: Int, gotoLabel: String) =
    new BnzInstruction(label, "bnz", register, gotoLabel)
}
