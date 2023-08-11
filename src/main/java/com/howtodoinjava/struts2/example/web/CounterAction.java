package com.howtodoinjava.struts2.example.web;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class CounterAction extends ActionSupport 
{

	private String action;
	
    public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Override
    public void validate(){
    }

    @Override
    public String execute() throws Exception {
        return ActionSupport.SUCCESS;
    }
}
