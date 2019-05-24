package Behavioral_Patterns.Observer.example;

import Behavioral_Patterns.Observer.Observable;
import Behavioral_Patterns.Observer.Observer;
import org.apache.log4j.Logger;


public class Camembert implements Observer {
    private static Logger logger = Logger.getLogger(Camembert.class);

    public Camembert(Data data) {
        data.addObserver(this);
    }

    @Override
    public void notify(Observable subject) {
        logger.info("camembert notified");

    }

}