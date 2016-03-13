// 1. Create a method getSquare that takes an Int argument and returns its square. Print your answer. Test using the following code.
def getSquare(x: Int): Int = { return x * x }
val a = getSquare(3)
assert(a == 9)
val b = getSquare(6)
assert(b == 36)
val c = getSquare(5)
assert(c == 25)
// 2. Create a method isArg1GreaterThanArg2 that takes two Double arguments. Return true if the first argument is greater than the second. Return false otherwise. Print your answer. Satisfy the following:
def isArg1GreaterThanArg2(x: Double, y: Double): Boolean = { return x > y }
val t1 = isArg1GreaterThanArg2(4.1, 4.12)
assert(t1 == false, "isArg1GreaterThanArg2(4.1, 4.12) returned true")
val t2 = isArg1GreaterThanArg2(2.1, 1.2)
assert(t2 == true, "isArg1GreaterThanArg2(2.1, 1.2) returned false")
// 3. Create a method manyTimesString that takes a String and an Int as arguments and returns the String duplicated that many times. Print your answer. Satisfy the following:
def manyTimesString(str: String, x: Int): String = { return str * x }
val m1 = manyTimesString("abc", 3)
assert("abcabcabc" == m1, "Invalid string returned")
val m2 = manyTimesString("123", 2)
assert("123123" == m2, "Invalid string returned")
