package com.douglasproglima.estudo;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Cgm {
	private String nomeRazaoSocial;
	private String nomeFantasia;
	private String tipoPessoa;
	private String cpf;
	private String cnpj;

	
	public void tipoPessoaSelecionada(){
//		if (this.getTipoPessoa() == "F") {
//			return "Fisíca";
//		} else {
//			return "Jurícica";
//		}
		System.out.println("Tipo Pessoa: " + this.getTipoPessoa());
	}
	
	public String getNomeRazaoSocial() {
		return nomeRazaoSocial;
	}
	public void setNomeRazaoSocial(String nomeRazaoSocial) {
		this.nomeRazaoSocial = nomeRazaoSocial;
	}
	
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	public String getTipoPessoa() {
		return tipoPessoa;
	}
	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
