/*
Write down three differences between abstract classes and interfaces in Java 8.
Provide examples to illustrate your answer.
*/

/*
01. All interface fields are automatically public, static, and final,
and all methods that you declare or define (as default methods) are public.
*/

interface Interface01 {
    int x = 5;

    void method();
}

/*
02. With abstract classes, you can declare fields that are not static and final,
and define public, protected, and private concrete methods.
*/

abstract class AbstractClass01 implements Interface01{
    protected String message = "Called private method printing protected field!";

    private void privateMethod(){
        System.out.println(message);
    }

    @Override
    public void method(){
        privateMethod();
    }


}


/*
03. You can extend only one class, whether or not it is abstract,
but you can implement any number of interfaces.
 */
class Class01 extends AbstractClass01{
    // Abstract classes cannot be instantiated
}

interface Interface02 {
    void method2();
}

class Class02 implements Interface01, Interface02{

    @Override
    public void method(){
        System.out.println("Implemented method from Interface01!");
    }

    @Override
    public void method2(){
        System.out.println("Implemented method from Interface02!");
    }

}


public class Answer01 {
    public static void main(String args[])
    {
        Class01 class01 = new Class01();
        class01.method();

        Class02 class02 = new Class02();
        class02.method();
        class02.method2();
    }
}
