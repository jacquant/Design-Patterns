package Behavioral_Patterns.State;

import Behavioral_Patterns.State.TCPState.IllegalState;

public interface TCPOperations {

    void open(int Port) throws IllegalState;

    void close() throws IllegalState;

    String receive() throws IllegalState;

    void reset() throws IllegalState;

}
