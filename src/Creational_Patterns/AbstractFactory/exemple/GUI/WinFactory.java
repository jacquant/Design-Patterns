package Creational_Patterns.AbstractFactory.exemple.GUI;

public class WinFactory extends GUIFactory {
    public Button createButton() {
        return (new WinButton());
    }

}
