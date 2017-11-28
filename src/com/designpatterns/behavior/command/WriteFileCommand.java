package com.designpatterns.behavior.command;

public class WriteFileCommand implements Command {

	private FileSystemReceiver fileSystem;
	
	public WriteFileCommand(FileSystemReceiver fileSystem) {
		super();
		this.fileSystem = fileSystem;
	}

	@Override
	public void execute() {
		this.fileSystem.writeFile();
	}

}
