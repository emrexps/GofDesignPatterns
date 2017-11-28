package com.designpatterns.behavior.command;

public class CommandApp {

	public static void main(String[] args) {
		
		FileSystemReceiver fs=new FileSystemReceiverUtil().getUnderlyingFileSystem();
		
		OpenFileCommand openFileCommand=new OpenFileCommand(fs);
		
		FileInvoker file=new FileInvoker(openFileCommand);
		
		file.execute();
		
		WriteFileCommand writeFileCommand=new WriteFileCommand(fs);
		file=new FileInvoker(writeFileCommand);
		file.execute();
		
		
	}

}
