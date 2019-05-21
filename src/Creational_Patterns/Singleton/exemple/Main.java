package Creational_Patterns.Singleton.exemple;

public class Main {
    public static void main(String[] args) {
        SingletonLogger.getInstance().out("running\n");
        SingletonLogger.getInstance().out().println("computing");
        SingletonLogger.getInstance().out("stopped\n");
    }
}
