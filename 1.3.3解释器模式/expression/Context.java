package com.lu.expression;

import java.util.ArrayList;
import java.util.List;

public class Context {

	private String content;
	   
    private List<Expression> list = new ArrayList<Expression>();
   
    public void setContent(String content) {
        this.content = content;
    }
   
    public String getContent() {
        return this.content;
    }
   
    public void add(Expression eps) {
        list.add(eps);
    }
   
    public List<Expression> getList() {
        return list;
    }
}
