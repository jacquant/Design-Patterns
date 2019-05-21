package Creational_Patterns.AbstractFactory.exemple.GUI;

import java.util.Random;

public abstract class GUIFactory {
    public static GUIFactory getFactory() {
        Random random = new Random();

        int sys = random.nextInt(2);
        if (sys == 0)
            return (new WinFactory());

        return (new OSXFactory());
    }

    public abstract Button createButton();
}
