package com.lu.command;

public class Test {

	 public static void main(String[] args) {
		 
	        Receiver rec = new Receiver();
	        Command cmd = new CommandImpl(rec);
	        Invoker i = new Invoker();
	        i.setCommand(cmd);
	        i.execute();
	    }
	}
