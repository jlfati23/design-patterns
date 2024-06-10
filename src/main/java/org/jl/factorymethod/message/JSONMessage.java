package org.jl.factorymethod.message;

public class JSONMessage extends Message {
	@Override
	public String getContent() {
		return "{\"JSON]\":[]}";
	}

	@Override
	public void addDefaultHeaders() {
		super.addDefaultHeaders();
	}
}
