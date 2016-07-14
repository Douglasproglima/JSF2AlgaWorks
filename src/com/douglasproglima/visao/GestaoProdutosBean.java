package com.douglasproglima.visao;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.douglasproglima.dominio.Produto;

/*Anotações de Escopo
 * @AplicationScoped -> Sessão ativa enquanto a aplicação estiver ativa;
 * @SessionScoped    -> Sessão ativa por usuário;
 * */

@ManagedBean
@SessionScoped
public class GestaoProdutosBean {
	private Produto produto;
	private List<Produto> produtos;
	
	public GestaoProdutosBean(){
		this.produtos = new ArrayList<Produto>();
		this.produto = new Produto();
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public void incluir(){
		this.produtos.add(this.produto);
		
		this.produto = new Produto();
	}
}
