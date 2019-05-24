package Behavioral_Patterns.State;

public class TCPError extends TCPState {


    protected TCPError(Context ctx) {
        super(ctx);
    }

    @Override
    public void reset() throws IllegalState {
        context.setState(new TCPClosed(context));
    }


}