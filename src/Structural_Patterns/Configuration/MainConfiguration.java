package Structural_Patterns.Configuration;

import Structural_Patterns.Configuration.pattern.BadPreCondition;
import Structural_Patterns.Configuration.pattern.example.*;
import org.apache.log4j.Logger;


public class MainConfiguration {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(MainConfiguration.class);

        ISOConfiguration config = null;

        logger.info("In an happy world");

        try {
            config = new ISOConfiguration();
            config.addComponent("Layer 1", new ISOLayer1());
            config.addComponent("Layer 2", new ISOLayer2());
            config.addComponent("Layer 3", new ISOLayer3());
            config.configure(new String[]{"Layer 1", "Layer 2", "Layer 3"});
        } catch (BadPreCondition e) {
        }

        logger.info("In a sad world");

        try {
            config = new ISOConfiguration();
            config.addComponent("Layer 1", new ISOLayer1());
            config.addComponent("Layer 2", new ISOLayer2bug());
            config.addComponent("Layer 3", new ISOLayer3());
            config.configure(new String[]{"Layer 1", "Layer 2", "Layer 3"});
        } catch (BadPreCondition e) {
            try {
                logger.info("Hopefully, alternatives exist");
                config.replaceComponent("Layer 2", new ISOLayer2());
                config.configure(new String[]{"Layer 1", "Layer 2", "Layer 3"});
            } catch (BadPreCondition e1) {
                System.exit(1);
            }
        }

    }
}
