package Behavioral_Patterns.Strategy;

public class StrategyShortestPath implements Strategy {

    @Override
    public String[] computePath(String fromCity, String toCity) {
        return new String[]{fromCity, "JustPass", toCity};

    }

}