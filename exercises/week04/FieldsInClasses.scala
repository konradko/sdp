// Given the following code:
class Cup {
    var percentFull = 0
    val max = 100
    def add(increase:Int):Int = {
        percentFull += increase
        if(percentFull > max) {
            percentFull = max
        }
        percentFull // Return this value
      }
}
// 1. What happens in Cups add method if increase is a negative value? Is any additional code necessary to satisfy the following tests:
// Answer: No
val cup = new Cup
assert(cup.add(45) = == 5))
assert(cup.add(-15) == 30)
assert(cup.add(-50) == -20)

// 2. Add code to handle negative values to ensure that the total never goes below 0. Satisfy the following tests:
class Cup {
    var percentFull = 0
    val max = 100
    def add(increase: Int): Int = {
        if ((percentFull + increase ) <= 0) {
            percentFull = 0
        } else {
            percentFull += increase
            if(percentFull > max) {
              percentFull = max
            }
        }
        percentFull
      }
}
val cup = new Cup
assert(cup.add(45)  == 45)
assert(cup.add(-55) ==  0)
assert(cup.add(10)  == 10)
assert(cup.add(-9) ==  1)
assert(cup.add(-2) ==  0)

// 3. Can you set percentFull from outside the class? Try it, like this:
cup.percentFull = 56
assert(cup.percentFull == 56)

// 4. Write methods that allow you to both set and get the value of percentFull. Satisfy the following:
class Cup {
    var percentFull = 0
    val max = 100

    def add(increase:Int):Int = {
        if ((percentFull + increase ) <= 0) {
            percentFull = 0
        } else {
            percentFull += increase
            if(percentFull > max) {
              percentFull = max
            }
        }
        percentFull
    }

    def set(pf: Int) {
        percentFull = pf
    }

    def get(): Int = {
        percentFull
    }

}
val cup = new Cup
cup.set(56)
assert(cup.get() == 56)
