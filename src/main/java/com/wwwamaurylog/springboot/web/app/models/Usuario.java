package com.wwwamaurylog.springboot.web.app.models;

public class Usuario {

	private String Nombre;
	private String Apellido;
	private String Email;
	
	public Usuario() { }
	
	public Usuario(String nombre, String apellido, String email) {
		super();
		Nombre = nombre;
		Apellido = apellido;
		Email = email;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	
}
