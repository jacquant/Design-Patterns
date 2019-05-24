package Behavioral_Patterns.Observer;

public class ObservableOptim extends Observable {
    private boolean hasChanged = false;

    protected void setChanged() {
        hasChanged = true;
    }

    protected void clearChanged() {
        hasChanged = false;
    }

    @Override
    public void notifyObservers() {
        if (hasChanged) {
            super.notifyObservers();
            clearChanged();
        }
    }

}