package Behavioral_Patterns.State;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class TCPClosed extends TCPState {

    public TCPClosed(Context context) {
        super(context);
    }

    @Override
    public void open(int port) throws IllegalState {
        try {
            Socket client = null;
            BufferedReader in = null;
            ServerSocket ecoute = null;

            InetAddress address = Inet4Address.getLocalHost();
            assert address != null;
            // Creates a server socket on a specified port.
            ecoute = new ServerSocket(port);
            client = ecoute.accept();
            in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            context.setState(new TCPListening(context, in, client, ecoute));
        } catch (UnknownHostException e) {
            context.setState(new TCPError(context));
        } catch (IOException e) {
            context.setState(new TCPError(context));
        }
    }

    @Override
    public void close() throws IllegalState {
        // idempotent operation
    }

}

