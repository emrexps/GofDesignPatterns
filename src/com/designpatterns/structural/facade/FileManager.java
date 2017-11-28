package com.designpatterns.structural.facade;

public class FileManager {

	private PdfManager pdfManager;
	private DocManager docManager;

	public FileManager() {
		pdfManager = new PdfManager();
		docManager = new DocManager();
	}

	public void writeDocFile() {
		docManager.write();
	}

	public void readDocFile() {
		docManager.read();
	}

	public void writePdfFile() {
		pdfManager.write();
	}

	public void readPdfFile() {
		pdfManager.read();
	}
}
