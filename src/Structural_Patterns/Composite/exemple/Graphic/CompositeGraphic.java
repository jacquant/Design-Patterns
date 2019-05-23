package Structural_Patterns.Composite.exemple.Graphic;

import java.util.ArrayList;

class CompositeGraphic implements Graphic {

    //Collection de graphiques enfants.
    private ArrayList<Graphic> mChildGraphics = new ArrayList<Graphic>();

    //Imprime le graphique.
    public void print() {
        for (Graphic graphic : mChildGraphics) {
            graphic.print();
        }
    }

    //Ajoute le graphique à la composition.
    public void add(Graphic graphic) {
        mChildGraphics.add(graphic);
    }

    //Retire le graphique de la composition.
    public void remove(Graphic graphic) {
        mChildGraphics.remove(graphic);
    }

}
