package Behavioral_Patterns.Interceptor;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class MainInterceptor {
    /*
     * This example consists of two applications (MainInterceptorSender & MainInterceptor). The first one sends requests
     * through UDP and the second one receives them. The second application is implemented with the design pattern interceptor
     * in order to be able to add new functionalities during events (such as the reception of a UDP packet). The application
     * includes three interceptors. The first one audits the received requests, the second one checks the syntax of the
     * requests before authorizing them, and the third one absorbs all requests (not shown).

     *When the "securityON" request is sent, the InterceptorValidCommand interceptor is added to the dispatcher and all
     * requests are checked until the "securityOFF" request is sent. Between these two moments, the only normal request
     * accepted is "bingo".
     * */
    public static void main(String[] args) {

        Logger logger = LogManager.getRootLogger();
        logger.setLevel(Level.ALL);


        IInterceptor audit = new InterceptorAudit();
        IInterceptor secur = new InterceptorInstallValidCommand();
        // IInterceptor black = new InterceptorBlackHole();

        Framework.getInstance().getDispatcher().register(audit);
        Framework.getInstance().getDispatcher().register(secur);
        // Framework.getInstance().getDispatcher().register(black);

        new Environment();

    }
}