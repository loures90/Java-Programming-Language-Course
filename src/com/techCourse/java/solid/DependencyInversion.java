package com.techCourse.java.solid;


/*
 * D. Dependency Inversion Principle: 
 *  High level modules should not directly depend on low level modules, instead they should depend on abstraction
 * */

/* Before Dependency Inversion Principle
class MyMessenger {
	TCPProtocolHandler protocolHandler = new TCPProtocolHandler();
	public void send(String to, String message) {
		this.protocolHandler.sendMessage("Message to - " + to + ", message: " + message);
	}
}
*/


// High level class
class MyMessenger {
	ProtocolHandler protocolHandler;
	
	public void getProtocol(String protocol) {
		if (protocol.equalsIgnoreCase("TCP")) {
			this.protocolHandler = new TCPProtocolHandler();
		} 
		if (protocol.equalsIgnoreCase("UDP")) {
			this.protocolHandler  =  new UDPProtocolHandler();
		}
	}
	
	public void send(String to, String message) {
		this.protocolHandler.sendMessage("Message to - " + to + ", message: " + message);
	}
}


// Transport Layer - low level class
interface ProtocolHandler {
	public void sendMessage(String message);
}

class TCPProtocolHandler implements ProtocolHandler {
	public void sendMessage(String message) {
		System.out.println("TCP message - " + message);
	}
}

class UDPProtocolHandler implements ProtocolHandler {
	public void sendMessage(String message) {
		System.out.println("UDP message - " + message);
	}
}


public class DependencyInversion {
		
	public static void main(String[] args) {
		MyMessenger myTCPMessanger = new MyMessenger();
		myTCPMessanger.getProtocol("TCP");
		myTCPMessanger.send("Test user", "Solid is veru useful");
		
		MyMessenger myUDPMessanger = new MyMessenger();
		myUDPMessanger.getProtocol("UDP");
		myUDPMessanger.send("Test user", "Solid is veru useful");
		
	}

}
