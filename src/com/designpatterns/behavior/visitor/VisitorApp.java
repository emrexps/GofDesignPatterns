package com.designpatterns.behavior.visitor;

public class VisitorApp {

	public static void main(String[] args) {
	
		 ComputerPart computer = new Computer();
	      computer.accept(new ComputerPartDisplayVisitor());
	}

}
