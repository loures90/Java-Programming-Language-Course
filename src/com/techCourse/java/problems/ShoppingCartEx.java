package com.techCourse.java.problems;

import java.util.Arrays;

class CarItem {
	private String itemCode;
	private int quantity;
	
	CarItem (String itemCode, int quantity){
		this.itemCode = itemCode;
		this.quantity = quantity;
	}
	public String getItemCode () {
		return this.itemCode;
	}
	public int getQuantity () {
		return this.quantity;
	}
}

class ShoppingCart {
	private CarItem[] items;
	private int size;
	private int itemsCount = 0;
	
	private static final int DEFAULT_SIZE = 10;
	
	ShoppingCart (){
		this(DEFAULT_SIZE);
	}
	ShoppingCart (int size){
		this.size = size;
		this.items = new CarItem[size];
	}
	
	public void addToCart(CarItem carItem) {
		if (this.itemsCount < this.size) {
			this.items[this.itemsCount++] = carItem;
		}
	}
	
	public void print() {
		for (CarItem item : this.items) {
			if (item != null) {
				System.out.println("Item Code: " + item.getItemCode());
				System.out.println("Quantity: " + item.getQuantity() + "\n");				
			}
		}
	}
	
	public void order() {
		Arrays.sort(this.items, (a,b) -> {
			if (a == null || b == null) return 0;
			return a.getItemCode().compareToIgnoreCase(b.getItemCode());
		});
		this.print();
	}
}

public class ShoppingCartEx {

	public static void main(String[] args) {
		ShoppingCart shoppingCart = new ShoppingCart();
		CarItem carItem1, carItem2, carItem3;
		carItem1 = new CarItem("UNO", 5);
		carItem2 = new CarItem("PALIO", 3);
		carItem3 = new CarItem("SANDERO", 1);
		shoppingCart.addToCart(carItem1);
		shoppingCart.addToCart(carItem2);
		shoppingCart.addToCart(carItem3);
		shoppingCart.order();
	}

}
