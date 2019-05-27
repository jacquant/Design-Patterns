package Behavioral_Patterns.Interceptor;

import org.apache.log4j.Logger;

public class InterceptorInstallValidCommand implements IInterceptor {
    public static final String SECURITY_ON = "securityON";
    public static final String SECURITY_OFF = "securityOFF";
    static private final Logger logger = Logger.getLogger(InterceptorAudit.class);
    private IInterceptor validCommand = null;

    @Override
    public boolean event_callback(Context ctx) {

        if (ctx.getEvent().getInfo().equals(SECURITY_ON) && validCommand == null) {
            logger.info("security on");
            validCommand = new InterceptorValidCommand();
            Framework.getInstance().getDispatcher().register(validCommand);
        } else if (ctx.getEvent().getInfo().equals(SECURITY_OFF)) {
            logger.info("security off");
            Framework.getInstance().getDispatcher().unregister(validCommand);
            validCommand = null;
        }
        return true;
    }

}
