package org.jl.factorymethod;


import org.jl.factorymethod.message.Message;

/**
 * This is our abstract "creator". 
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
public abstract class MessageCreator {

    public final String getMessageContent() {
        Message message = createMessage();
        return message.getContent();
    }

    public Message getMessage(){
        Message message = createMessage();
        message.addDefaultHeaders();
        message.encrypt();
        return message;
    }

    protected abstract Message createMessage();
	
}
