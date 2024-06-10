package org.jl.factorymethod;


import org.jl.factorymethod.message.Message;
import org.jl.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {


    @Override
    protected Message createMessage() {
        return new TextMessage();
    }
}
