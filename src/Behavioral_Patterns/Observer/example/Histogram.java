package Behavioral_Patterns.Observer.example;

import Behavioral_Patterns.Observer.Observable;
import Behavioral_Patterns.Observer.Observer;
import org.apache.log4j.Logger;


public class Histogram implements Observer {
    static private Logger logger = Logger.getLogger(Histogram.class);

    public Histogram(Data data) {
        data.addObserver(this);
    }

    @Override
    public void notify(Observable subject) {
        logger.info("histogram notified");
    }

}