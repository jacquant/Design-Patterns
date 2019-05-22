package Structural_Patterns.Configuration.pattern.example;

import Structural_Patterns.Configuration.pattern.BadPreCondition;
import org.apache.log4j.Logger;


public class ISOLayer2 extends ISOLayer {
    Logger logger = Logger.getLogger(ISOLayer1.class);

    @Override
    public void configure() throws BadPreCondition {
        logger.info("configure Layer 2 ");
    }

    @Override
    public void reset() {
        logger.info("reset Layer 2 ");

    }

}