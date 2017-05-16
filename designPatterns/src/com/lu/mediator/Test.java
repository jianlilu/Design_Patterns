package com.lu.mediator;

public class Test {

	public static void main(String[] args) {
        Mediator med = new ConcreteMediator();
        //老板来了
        med.notice("boss");
       
        //客户来*
        med.notice("client");
    }
}