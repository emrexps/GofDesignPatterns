package com.designpatterns.behavior.memento;

import java.io.FileWriter;

public class MementoApp {

	public static void main(String[] args) {
		
		FileWriterCaretaker careTaker=new FileWriterCaretaker();
		FileWriterUtil fileWriterUtil=new FileWriterUtil("data.txt");
	    fileWriterUtil.write("First set of Data\n\n");
	    System.out.println(fileWriterUtil+"\n\n");
	    
	    careTaker.save(fileWriterUtil);
	    fileWriterUtil.write("Second set of Data\n");
	    
	    System.out.println(fileWriterUtil+"\n\n");
	    
	    careTaker.undo(fileWriterUtil);
	    
	    System.out.println(fileWriterUtil+"\n\n\n");
		

	}

}
