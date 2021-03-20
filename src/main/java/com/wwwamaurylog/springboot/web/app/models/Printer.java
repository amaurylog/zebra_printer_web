package com.wwwamaurylog.springboot.web.app.models;

public class Printer {

	private String Ip;
	private int Puerto;	
	
	public Printer() {
		super();
	}

	public Printer(String ip, int puerto) {
		super();
		Ip = ip;
		Puerto = puerto;
	}

	public String getIp() {
		return Ip;
	}

	public void setIp(String ip) {
		Ip = ip;
	}

	public int getPuerto() {
		return Puerto;
	}

	public void setPuerto(int puerto) {
		Puerto = puerto;
	}
	
}
