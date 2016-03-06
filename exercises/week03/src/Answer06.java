/*
Question: Why might you decide to lazy-initialise a singleton instance rather than initialise
it in its field declaration? Provide examples of both approaches to illustrate your answer.

Answer: lazy initialization delays the expensive processes of object creation or value computation
until it is needed for the first time.
*/

class LazySingleton {

    static class SingletonHolder {
        // instance will be created only when getInstance is called
        static LazySingleton instance = new LazySingleton();
    }

    private LazySingleton() {
        System.out.println("Initialising LazySingleton");
        try {
            Thread.sleep(1000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public static LazySingleton getInstance() {
        return SingletonHolder.instance;
    }

    public static void method(){
        System.out.println("LazySingleton static method called");
    }
}

class EagerSingleton {
    // instance is created when the class is initialized, before the class is used by any thread
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        System.out.println("Initialising EagerSingleton");
        try {
            Thread.sleep(1000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public static synchronized EagerSingleton getInstance() {
        return instance;
    }

    public static void method(){
        System.out.println("EagerSingleton static method called");
    }
}

public class Answer06 {
    public static void main(String args[]) {
        // This won't cause wait time due to instance creation
        LazySingleton.method();
        // This will cause wait time, as just loading the class sets the instance
        EagerSingleton.method();
        // With lazy loading instance is created on getInstance, so there will be wait time here
        LazySingleton lazySingleton = LazySingleton.getInstance();
        // While with eagerly loaded class the instance is already present (no wait time);
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
    }
}
