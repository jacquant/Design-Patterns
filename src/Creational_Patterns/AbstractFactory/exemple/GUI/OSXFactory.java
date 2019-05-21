package Creational_Patterns.AbstractFactory.exemple.GUI;

public class OSXFactory extends GUIFactory {
    public Button createButton() {
        return (new OSXButton());
    }

}
