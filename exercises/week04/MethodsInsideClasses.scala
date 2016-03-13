// 1. Create a Sailboat class with methods to raise and lower the sails, printing Sails raised, and Sails lowered, respectively.
// Create a Motorboat class with methods to start and stop the motor, returning Motor on, and Motor off, respectively. Create an object (instance) of the Sailboat class. Use assert for verification:
class Sailboat {
     def lower(): String = {
          return "Sails lowered"
     }
     def raise(): String = {
          return "Sails raised"
     }
}
val sailboat = new Sailboat
val r1 = sailboat.raise()
assert(r1 == "Sails raised", "Expected Sails raised, Got " + r1)
val r2 = sailboat.lower()
assert(r2 == "Sails lowered", "Expected Sails lowered, Got " + r2)

class Motorboat {
     def on(): String = {
          return "Motor on"
     }
     def off(): String = {
          return "Motor off"
     }
}
val motorboat = new Motorboat
val s1 = motorboat.on()
assert(s1 == "Motor on", "Expected Motor on, Got " + s1)
val s2 = motorboat.off()
assert(s2 == "Motor off", "Expected Motor off, Got " + s2)
// 2. Create a new class Flare. Define a light method in the Flare class. Satisfy the following:
class Flare {
     def light(): String = {
          return "Flare used!"
     }
}
val flare = new Flare
val f1 = flare.light
assert(f1 == "Flare used!", "Expected Flare used!, Got " + f1)
// 3. In each of the Sailboat and Motorboat classes, add a method signal that creates a Flare object and calls the light method on the Flare. Satisfy the following:
class Sailboat2 extends Sailboat {
     def signal(): String = {
          val flare = new Flare
          return flare.light
     }
}
val sailboat2 = new Sailboat2
val signal = sailboat2.signal()
assert(signal == "Flare used!", "Expected Flare used! Got " + signal)

class Motorboat2 extends Motorboat {
     def signal(): String = {
          val flare = new Flare
          return flare.light
     }
}
val motorboat2 = new Motorboat2
val flare2 = motorboat2.signal()
assert(flare2 == "Flare used!", "Expected Flare used!, Got " + flare2)
