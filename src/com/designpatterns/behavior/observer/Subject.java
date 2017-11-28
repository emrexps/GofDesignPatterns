package com.designpatterns.behavior.observer;

public interface Subject {
	
	public void register(Observer obj);
	public void unregistered(Observer obj);
	
	public void notifyObservers();
	
	public Object getUpdate(Observer obj);
	
}
