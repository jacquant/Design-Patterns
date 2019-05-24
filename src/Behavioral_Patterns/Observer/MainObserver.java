package Behavioral_Patterns.Observer;

import Behavioral_Patterns.Observer.example.Camembert;
import Behavioral_Patterns.Observer.example.Data;
import Behavioral_Patterns.Observer.example.Histogram;

public class MainObserver {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        Data donnee = new Data();
        Histogram histogram = new Histogram(donnee);
        Camembert camembert = new Camembert(donnee);
        Camembert camembert2 = new Camembert(donnee);

        donnee.set("Vincent", Data.MATH, 9); // -> OK
        donnee.set("Tintin", Data.MATH, 10); // -> NO
        donnee.set("Vincent", Data.MATH, 9); // -> NO
        donnee.set("Vincent", Data.MATH, 0); // -> OK
    }

}