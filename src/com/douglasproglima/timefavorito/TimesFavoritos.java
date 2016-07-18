package com.douglasproglima.timefavorito;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TimesFavoritos {
	private String[] times;
	
	public void escolher(){
		System.out.println("-----------Times Selecionados-----------");
		for(String time : this.getTimes()){
			System.out.println(time);
		}
	}
	
	public String[] getTimes() {
		return times;
	}
	public void setTimes(String[] times) {
		this.times = times;
	}
}
