/**
 Provide examples of two commonly used Java methods that return a new object.
 */

class Class06 {
    public Class06() {
        System.out.println("Here's your new object!");
    }
    public static Class06 getNewObject() {
        return new Class06();
    }
}

public class Answer09 {
    public static void main(String[] args) {
        Class06 object = new Class06();
        Class06 anotherObject = Class06.getNewObject();
    }
}
