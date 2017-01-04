package org.empleodigital.struts.Lidl.actions;

import com.opensymphony.xwork2.ActionSupport;

import classes.GestorUsuario;
import freemarker.template.utility.Execute;

public class LoginAction extends ActionSupport {

	private String username;
	private String password;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String execute() throws Exception {
		if(GestorUsuario.existeUsuario(username, password)){
			return SUCCESS;
		}
		return ERROR;
	}
	
	
}
