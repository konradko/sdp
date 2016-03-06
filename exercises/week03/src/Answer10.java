/**
 Question: What are the signs that a Factory Method is at work?

 Answer: the constructor class is private and objects instantiating different classes can be returned,
 as long as they implement the interface specified by the factory method.
 */

interface InterfaceForFactory {
}

class FirstClass implements InterfaceForFactory {
    public FirstClass() {
        System.out.println("FirstClass object returned");
    }
}

class SecondClass implements InterfaceForFactory {
    public SecondClass() {
        System.out.println("SecondClass object returned");
    }
}

class FactoryClass {

    public static InterfaceForFactory getNewObject(boolean firstOne) {
        if (firstOne) {
            return new FirstClass();
        }
        return new SecondClass();
    }
}

public class Answer10 {
    public static void main(String[] args) {
        InterfaceForFactory firstClass = FactoryClass.getNewObject(true);
        InterfaceForFactory secondClass = FactoryClass.getNewObject(false);
    }
}
