package Creational_Patterns.AbstractFactory.exemple.GUI;

public class OSXButton extends Button {
    public void paint() {
        System.out.println("I'm an OSXButton: " + getCaption());
    }
}
