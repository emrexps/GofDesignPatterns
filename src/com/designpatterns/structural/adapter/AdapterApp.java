package com.designpatterns.structural.adapter;

public class AdapterApp {

	public static void main(String[] args) {
		
		Writer [] writers=new Writer[] {
				new TextWriter(),new TextWriter(),new AdapterForLegacyWriter(new LegacyWriter())
				
		};
		
		for(Writer w:writers) {
			w.write("a text");
		}
		

	}

}
