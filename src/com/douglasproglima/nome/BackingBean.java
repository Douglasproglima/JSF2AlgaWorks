package com.douglasproglima.nome;

import javax.faces.bean.ManagedBean;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlInputText;

@ManagedBean
public class BackingBean {
	private HtmlInputText campo;
	private HtmlCommandButton botao;
	
	public void alterarPropriedades(){	
		if (this.campo.isDisabled()) {
			this.campo.setDisabled(false);
			this.botao.setStyle("backgroud-color: black; color: white"); 			
		} else {
			this.campo.setDisabled(true);
			this.botao.setStyle("backgroud-color: red; color: white"); 
		}
	}	
	
	public HtmlInputText getCampo() {
		return campo;
	}
	public void setCampo(HtmlInputText campo) {
		this.campo = campo;
	}
	
	public HtmlCommandButton getBotao() {
		return botao;
	}
	public void setBotao(HtmlCommandButton botao) {
		this.botao = botao;
	}
}
