package hw;

public class Singleton {
    private Singleton() {}

    private static class SingletonStudent {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonStudent.INSTANCE;
    }
}
