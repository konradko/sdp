/*
How can you prevent other developers from constructing new instances of your class?
Provide appropriate examples to illustrate your answer.
*/
class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton() {
        // Private constructor prevents instantiation by other developers
    }

    public static Singleton getInstance() {
        return instance;
    }
}

public class Answer05 {
    // Ths won't compile:
    // Singleton singleton = new Singleton();
    // The instance can only be accessed via getInstance method:
    Singleton singleton = Singleton.getInstance();
}
