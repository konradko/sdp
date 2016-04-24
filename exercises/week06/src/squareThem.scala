import atomic.AtomicTest._

object TestSquare extends App {
  squareThem(2) is 4
  squareThem(2, 4) is 20
  squareThem(1, 2, 4) is 21

  def squareThem(nums:Int*) : Int = nums.map(x => x*x).sum
}