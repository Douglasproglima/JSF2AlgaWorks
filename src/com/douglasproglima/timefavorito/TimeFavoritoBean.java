package com.douglasproglima.timefavorito;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TimeFavoritoBean {
	private String time;
	
	public void escolher(){
		System.out.println("time selecionado: " + this.getTime());
	}
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
}
