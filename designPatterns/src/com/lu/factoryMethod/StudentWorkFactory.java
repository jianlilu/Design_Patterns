package com.lu.factoryMethod;

public class StudentWorkFactory implements IWorkFactory {

    public Work getWork() {
    	
        return new StudentWork();
    }

}