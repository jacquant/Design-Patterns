package Structural_Patterns.Proxy;

public class Proxy implements IReal {
    private final IReal reference;

    Proxy(IReal real) {
        assert real != null;

        reference = real;
    }

    @Override
    public long compute(String query) {
        return reference.compute(query);
    }

}
