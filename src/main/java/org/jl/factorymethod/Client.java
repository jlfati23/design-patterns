package org.jl.factorymethod;



public class Client {

	public static void main(String[] args) {
		JSONMessageCreator jsonMessageCreator = new JSONMessageCreator();
		printMessageContent(jsonMessageCreator);
	}
	
	public static void printMessageContent(MessageCreator creator) {
		System.out.println(creator.getMessageContent());
	}
}
