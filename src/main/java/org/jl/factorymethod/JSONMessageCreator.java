package org.jl.factorymethod;


import org.jl.factorymethod.message.Message;
import org.jl.factorymethod.message.JSONMessage;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

    @Override
    protected Message createMessage() {
        return new JSONMessage();
    }
}
