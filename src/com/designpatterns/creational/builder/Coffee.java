package com.designpatterns.creational.builder;



public class Coffee {
	private CoffeeMenu coffee;

	private CoffeeSize drinkSize;

	public CoffeeSize getDrinkSize() {
		return drinkSize;
	}

	public void setDrinkSize(CoffeeSize drinkSize) {
		this.drinkSize = drinkSize;
	}

	private Coffee(CoffeeMaker coffeMaker) {
	
		this.coffee=coffeMaker.coffee;		
		this.drinkSize=coffeMaker.drinkSize;
	}
	public CoffeeMenu getCoffee() {
		return coffee;
	}

	public void setCoffee(CoffeeMenu coffee) {
		this.coffee = coffee;
	}
	
		public static class CoffeeMaker {
			
			private CoffeeMenu coffee;
			private CoffeeSize drinkSize;
			
			public CoffeeMaker(CoffeeMenu coffee, CoffeeSize drinkSize) {
				this.coffee = coffee;
				this.drinkSize = drinkSize;
			}

			
			public CoffeeMaker setDrinkSize(CoffeeSize drinkSize) {
				this.drinkSize = drinkSize;
				return this;
			}
			
		
			public CoffeeMaker setCoffee(CoffeeMenu coffee) {
				this.coffee = coffee;
				return this;
			}
	
			public Coffee build() {
				return new Coffee(this);
			}
	
		}
	
	

}
