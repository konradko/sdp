// 1. Create classes for Hippo, Lion, Tiger, Monkey, and Giraffe, then create an instance of each one of those classes. Display the objects. Do you see five different ugly-looking (but unique) strings? Count and inspect them.
class Hippo {}
class Lion {}
class Tiger {}
class Monkey {}
class Giraffe {}
val hippo = new Hippo()
val lion = new Lion()
val tiger = new Tiger()
val monkey = new Monkey()
val giraffe = new Giraffe()
println(hippo)
println(lion)
println(tiger)
println(monkey)
println(giraffe)
// 2. Create a second instance of Lion and two more Giraffes. Print those objects. How do they differ from the original objects that you created?
// Answer: identity hash code is different
val lion2 = new Lion()
val giraffe2 = new Giraffe()
val giraffe3 = new Giraffe()
println(lion2)
println(giraffe2)
println(giraffe3)
