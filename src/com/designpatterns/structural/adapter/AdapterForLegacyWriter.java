package com.designpatterns.structural.adapter;

public class AdapterForLegacyWriter implements Writer {

	 private LegacyWriter legacyWriter;

	    public AdapterForLegacyWriter(LegacyWriter legacyWriter) {
	        this.legacyWriter = legacyWriter;
	    }
	
	@Override
	public void write(String text) {
		legacyWriter.write(text);
		
	}
	
	

}
