package com.douglasproglima.visao;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CadastroCurriculoBean {
	private String vaga = "A0382D";
	private String cargo = "Desenvolvedor Java";
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String getVaga() {
		return vaga;
	}
	public void setVaga(String vaga) {
		this.vaga = vaga;
	}
}
