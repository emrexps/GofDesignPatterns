package com.designpatterns.behavior.visitor;

public interface ComputerPart {
	   public void accept(ComputerPartVisitor computerPartVisitor);
	}