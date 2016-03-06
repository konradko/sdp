// Are the following true or false?

/* a)
Question: every interface must have at least one method
Answer: false
 */
interface InterfaceWithNoMethods {
    // Interface with no methods
}

class Class03 implements InterfaceWithNoMethods {
}

/* b)
Question: an interface can declare instance fields that an implementing class must also declare
Answer: false
 */
interface InvalidInterfaceWithInstanceFields {
    // Java interfaces cannot be instantiated, thus this would not compile:
    // int x;
    // All interface fields are automatically public, static, and final
}

/* c)
Question: although you can’t instantiate an interface, an interface definition can declare constructor
methods that require an implementing class to provide constructors with given signatures.

Answer: false. A class can implement multiple interfaces and it is impossible to construct an object
that calls multiple constructors.
*/

interface InvalidInterfaceWithConstructor {
    // This won't compile:
    // InvalidInterfaceWithConstructor(String a);
}


class Answer02 {
    public static void main(String args[]){
        Class03 class03 = new Class03();
    }
}

