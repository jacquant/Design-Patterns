package Creational_Patterns.AbstractFactory.exemple.GUI;

public abstract class Button {
    private String caption;

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public abstract void paint();
}
