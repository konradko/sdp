// 1. Create a Range object and print the step value. Create a second Range object with a step value of 2 and then print the step value. What’s different?
val x = Range(1,2,3)
x.step
// res3: Int = 3
val y = Range(1,2,2)
y.step
// res4: Int = 2
// 2. Create a String object s1 (as a var) initialised to "Sally". Create a second String object s2 (as a var) initialised to "Sally". Use s1.equals(s2) to determine if the two Strings are equivalent. If they are, print s1 and s2 are equal, otherwise print s1 and s2 are not equal.
var s1 = "Sally"
var s2 = "Sally"
if (s1.equals(s2)) { print("s1 and s2 are equal")} else { print("s1 and s2 are not equal")}
