package org.empleodigital.struts.Lidl.actions;

import com.opensymphony.xwork2.ActionSupport;

import classes.GestorUsuario;


public class RegisterAction extends ActionSupport {

	private String username;
	private String password;
	private String nombre;
	private int edad;
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
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
public String execute() throws Exception{
		
		if (GestorUsuario.registraUsuario(username, password, nombre, edad)) {
			return SUCCESS;
		}
		else {
			return ERROR;
		}
				
	}
}
