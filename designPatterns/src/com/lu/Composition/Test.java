package com.lu.Composition;

import java.util.List;

public class Test {
	
	 public static void main(String[] args) {
	        Employer pm = new ProjectManager("项目经理");
	        Employer pa = new ProjectAssistant("项目助理");
	        Employer programmer1 = new Programmer("程序员一");
	        Employer programmer2 = new Programmer("程序员二");
	       
	        pm.add(pa);//为项目经理添加项目助理
	        pm.add(programmer2);//*项目经理*加程序员
	        
	        pm.add(pm);
	        pm.add(programmer1);
	       
	        List<Employer> ems = pm.getEmployers();
	        for (Employer em : ems) {
	            System.out.println(em.getName());
	        }
	 }

}
