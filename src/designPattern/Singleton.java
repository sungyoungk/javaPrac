package designPattern;

public class Singleton {

    private static class SingletonInstanceHolder {
        private static final Singleton instance = new Singleton();
    }

    private Singleton(){};

    public static synchronized Singleton getInstance() {
        return SingletonInstanceHolder.instance;
    }

    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();

        Singleton c = new Singleton();


        System.out.println("a == b? " + "" + (a == b));
        System.out.println("a == b ==c ? " + "" + (a == b));

    }


}
