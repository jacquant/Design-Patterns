package Structural_Patterns.Configuration.pattern.example;

import Structural_Patterns.Configuration.pattern.BadPreCondition;
import org.apache.log4j.Logger;

public class ISOLayer2bug extends ISOLayer2 {
    Logger logger = Logger.getLogger(ISOLayer2bug.class);

    @Override
    public void configure() throws BadPreCondition {
        logger.info("problem while configuring Layer 2 ");
        throw new BadPreCondition();
    }

}
