/*
 Provide an example of an interface with methods that do not imply responsibility on
 the part of the implementing class to take action on behalf of the caller or to return a value.
 */

interface InterfaceWithDefaultMethods {
    default void defaultMethod(){
        System.out.println("Called default method, class does not implement it");
    }
}

class Class04 implements InterfaceWithDefaultMethods{
    // Do not implement default method
}

public class Answer03 {
    public static void main(String args[]){
        Class04 class04 = new Class04();
        class04.defaultMethod();
    }
}
