// 1. Create a value identifier and store (and print) the value 17.
val value = 17
println(value)
// 2. Using the value you just stored (17), try to change it to 20. What happened?
// Answer: // This will cause "error: reassignment to val", as 'value' is immutable
value = 20
// 3. Store (and print) the value ABC1234.
val str = "ABC1234"
// 4. Using the value you just stored (ABC1234), try to change it to DEF1234. What happened?
// Answer: "error: reassignment to val", as 'str' is immutable
str = "DEF1234"
// 5. Store the value 15.56. Print it.
val float = 15.56
println(float)
