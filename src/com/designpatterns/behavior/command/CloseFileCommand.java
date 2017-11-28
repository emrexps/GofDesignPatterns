package com.designpatterns.behavior.command;

public class CloseFileCommand implements Command {

	private FileSystemReceiver fileSystem;
	
	public CloseFileCommand(FileSystemReceiver fileSystem) {
		super();
		this.fileSystem = fileSystem;
	}

	@Override
	public void execute() {
		this.fileSystem.closeFile();
	}

}
