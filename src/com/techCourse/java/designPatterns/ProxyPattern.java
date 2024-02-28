package com.techCourse.java.designPatterns;

/*
 *  Proxy creates a representative obeject that controls access to another object
 *
 * 
 * Types:
 * 	Remote Proxy - For accessing a remote object.
 *  Virtual Proxy - For deferred inicialization
 *  Protection proxy - for secured and controlled acces to the object.
 * 
 * 
 * 
 * */

interface StockAPI {
	public String getQuote(String ticker);
}

// Simulate the server

class StockAPIImp implements StockAPI {

	@Override
	public String getQuote(String ticker) {
		// TODO Auto-generated method stub
		return "any_value";
	}
}

//Simulate the proxy

class StockAPIProxyImp implements StockAPI {

	@Override
	public String getQuote(String ticker) {
		// simulate the call of the API above
		StockAPIImp stockAPIImp = new StockAPIImp();
		
		return stockAPIImp.getQuote("bla");
	}
}


public class ProxyPattern {

	public static void main(String[] args) {
		StockAPI stock = new StockAPIProxyImp();
		System.out.println(stock.getQuote("a"));
	}

}
