package com.designpatterns.behavior.command;

public class OpenFileCommand implements Command {

	private FileSystemReceiver fileSystem;
	
	public OpenFileCommand(FileSystemReceiver fileSystem) {
		super();
		this.fileSystem = fileSystem;
	}

	@Override
	public void execute() {
		this.fileSystem.openFile();
	}

}
