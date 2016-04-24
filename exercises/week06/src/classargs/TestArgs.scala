package classargs

import atomic.AtomicTest._

object TestArgs extends App {
  val family1 = new Family("Mum", "Dad", "Sally", "Dick")
  family1.familySize() is 4
  val family2 = new Family("Dad", "Mom", "Harry")
  family2.familySize() is 3
  val family3 = new FlexibleFamily("Mum", "Dad", "Sally", "Dick")
  family3.familySize() is 4
  val family4 = new FlexibleFamily("Dad", "Mom", "Harry")
  family4.familySize() is 3
}

class Family(members:String*) {
  def familySize() : Int = members.length
}


class FlexibleFamily(mother: String, father: String, children: String*) {
  def familySize() : Int = 2 + children.length
}

