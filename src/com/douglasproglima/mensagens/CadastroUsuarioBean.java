package com.douglasproglima.mensagens;

import java.util.Calendar;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class CadastroUsuarioBean {
	private String nome;
	private String email;
	private String senha;
	
	private void addMensagem(String clientId, Severity severidade, String resumoErro, String detalhesErro){
		FacesContext context = FacesContext.getCurrentInstance(); 
		FacesMessage mensagem = new FacesMessage(severidade, resumoErro, detalhesErro);
		
		//Coloca as mensagens em uma fila, falta mostrar na páginas as mensagens
		context.addMessage(clientId, mensagem);
	}
	
	private boolean hojeDiaDDescanso(){
		return Calendar.getInstance().get(Calendar.DAY_OF_WEEK ) == Calendar.SUNDAY;
	}	
	
	public void cadastrar(){
		if (this.getNome() == null || this.getNome().length() < 10) {
			this.addMensagem("FrmCadUsuario:idCampoNome", FacesMessage.SEVERITY_ERROR, "Nome Incompleto.", "Campo 'Nome' é obrigatório!");
		}
		
		if (this.getEmail() == null || this.getEmail().length() < 4) {
			this.addMensagem("FrmCadUsuario:idCampoEmail", FacesMessage.SEVERITY_ERROR, "E-mail Incompleto.", "Campo 'e-mail' é obrigatório!");
		}

		if (this.getSenha() == null || this.getSenha().length() < 6) {
			this.addMensagem("FrmCadUsuario:idCampoSenha", FacesMessage.SEVERITY_ERROR, "Senha não pode ser nula.", "O campo 'Senha' é obrigatório!");
		}		
		
		if (hojeDiaDDescanso()) {
			this.addMensagem(null, FacesMessage.SEVERITY_WARN, "Hoje não é um dia útil.", "Você não pode cadastrar um usuário em dias de folgas.");
		}
		
		FacesContext context = FacesContext.getCurrentInstance();
		//Se não tive mensagens no faceContext pode concluir o cadastro.
		if (!context.getMessages().hasNext()) {	
			this.addMensagem(null, FacesMessage.SEVERITY_INFO, "Usuário Cadastrado", "Usuário Cadastrado com Sucesso.");
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}