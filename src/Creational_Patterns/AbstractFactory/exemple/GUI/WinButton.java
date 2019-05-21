package Creational_Patterns.AbstractFactory.exemple.GUI;

public class WinButton extends Button {
    public void paint() {
        System.out.println("I'm a WinButton: " + getCaption());
    }
}
