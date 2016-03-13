// 1. Use the REPL to create several Vectors, each populated by a different type of data.
val v1 = Vector(1, 2, 3)
val v2 = Vector("a", "b", "c")
val v3 = Vector(true, false, true, false)
val v4 = Vector(1, "b", false)

// 2. Use the REPL to see if you can make a Vector containing other Vectors.
val vv = Vector(v1, v2, v3, v4)

// 3. Create a Vector and populate it with words (which are Strings). Add a for loop that prints each element in the Vector. Append to a variable of type String to create a sentence. Satisfy the following test:
val words = Vector("The ", "dog ", "visited ", "the ", "fire station ")
var sentence = ""
for (word <- words) sentence += word
assert(sentence.toString() == "The dog visited the fire station ")

// 4. Create and initialise two Vectors, one containing Ints and one containing Doubles.
// Call the sum, min, and max operations on each one.
val ints = Vector(1, 2, 3, 4, 5)
ints.sum
ints.min
ints.max
val doubles = Vector(1.0, 2.1, 3.2, 4.3, 5.4)
doubles.sum
doubles.min
doubles.max

// 5. Create two Vectors of Int named myVector1 and myVector2, each initialised to
// 1, 2, 3, 4, 5, 6. Use AtomicTest to show whether the two are equivalent.
val myVector1 = Vector(1, 2, 3, 4, 5, 6)
val myVector2 = Vector(1, 2, 3, 4, 5, 6)
assert(myVector1 == myVector2)
