package Behavioral_Patterns.Interceptor;

/**
 * @author UNamur
 * <p>
 * This interceptor consumes all the events !
 */
public class InterceptorBlackHole implements IInterceptor {


    @Override
    public boolean event_callback(Context ctx) {
        return false;
    }

}
