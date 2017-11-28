package com.designpatterns.behavior.strategy;

public class StrategyApp {

	public static void main(String[] args) {
	 ShoppingCart shoppingCart=new ShoppingCart();
	 
	 Item item1=new Item("1234",10);
	 Item item2=new Item("2234",12);
	 Item item3=new Item("11234",11);
	 Item item4=new Item("444",8);

	 shoppingCart.addItem(item1);
	 shoppingCart.addItem(item2);
	 shoppingCart.addItem(item3);
	 shoppingCart.addItem(item4);
	 
	 shoppingCart.pay(new PaypalStrategy("abc@gmail.com", "mypswd"));
	 
	 shoppingCart.pay(new CreditCardStrategy("emre", "555555", "333", "12/20"));
	}

}
