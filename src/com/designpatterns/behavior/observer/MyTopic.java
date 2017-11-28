package com.designpatterns.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {
	
	private List observers;
	private String message;
	private boolean changed;
	private final Object MUTEX=new Object();
	
	public MyTopic()
	{
		this.observers=new ArrayList<>();
	}

	
	@Override
	public void register(Observer obj) {
		if(obj==null)throw new NullPointerException("Null Observers");
		synchronized (MUTEX) {
			if(!observers.contains(obj)) observers.add(obj);
		}

	}

	@Override
	public void unregistered(Observer obj) {
	synchronized (MUTEX) {
		observers.remove(obj);	}

	}

	@Override
	public void notifyObservers() {
	List<Observer> observersLocal=null;
	synchronized (MUTEX) {
		if(!changed) 
			return;
			observersLocal=new ArrayList<>(this.observers);
			this.changed=false;
		
	}
	for(Observer obj:observersLocal)
	{
		obj.update();
	}

	}

	@Override
	public Object getUpdate(Observer obj) {
		// TODO Auto-generated method stub
		return this.message;
	}

	public void postMessage(String msg) {
		System.out.println("Message posted to Topic:"+message);
		this.message=msg;
	    this.changed=true;
	    notifyObservers();
	}
	
}
