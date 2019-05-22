package Structural_Patterns.Decorator.exemple.Voiture;

public class Usine {

    public static void main(String[] args) {
        Voiture ds = new DS();
        Voiture dsOption = new DSAvecToitOuvrantDecorator((DS) ds);
        System.out.println(dsOption.getPoids() + " - " + dsOption.getPrix());
    }
}