package com.designpatterns.behavior.template;

public class TemplateApp {

	public static void main(String[] args) {
		
		 Game game = new Cricket();
	      game.play();
	      System.out.println();
	      game = new Football();
	      game.play();		
	
	}

}
