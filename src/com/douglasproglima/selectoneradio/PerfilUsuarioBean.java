package com.douglasproglima.selectoneradio;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class PerfilUsuarioBean {
	private String sexo;
	private Boolean novidadesPorEmail;
	private String[] linguagensfavoritas;
	
	public String confirmar(){
		return "PerfilUsuarioConfirmacao";
	}
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Boolean getNovidadesPorEmail() {
		return novidadesPorEmail;
	}
	public void setNovidadesPorEmail(Boolean novidadesPorEmail) {
		this.novidadesPorEmail = novidadesPorEmail;
	}
	
	public String[] getLinguagensfavoritas() {
		return linguagensfavoritas;
	}
	public void setLinguagensfavoritas(String[] linguagensfavoritas) {
		this.linguagensfavoritas = linguagensfavoritas;
	}
}