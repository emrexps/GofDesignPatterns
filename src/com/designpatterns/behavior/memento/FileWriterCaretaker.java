package com.designpatterns.behavior.memento;

public class FileWriterCaretaker {
	
	public Object obj;
	
	public void save(FileWriterUtil fileWriterUtil) {
	this.obj=fileWriterUtil.save();
	}

	public void undo(FileWriterUtil fileWriterUtil) {
		fileWriterUtil.undoToLastSave(obj);
	}
}
