package com.designpatterns.structural.facade;

public class FacedeApp {

	public static void main(String[] args) {
		FileManager fm=new FileManager();
		fm.readDocFile();
		fm.writePdfFile();
	}
	
	

}
