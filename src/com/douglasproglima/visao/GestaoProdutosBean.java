package com.douglasproglima.visao;

import java.util.ArrayList;
import java.util.List;

//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

import com.douglasproglima.dominio.Produto;

/*Anotações de Escopo
 * @AplicationScoped -> Sessão ativa enquanto a aplicação estiver ativa;
 * @SessionScoped    -> Sessão ativa por usuário;
 * @ViewScoped       -> Sessão ativa por usuário e por tela, se sair da tela finaliza a vida deste escopo;
 * @RequestScoped    -> Sessão ativa por clique o ação de usuário e tela, inicia e finaliza o tempo sessão em tempo real;
 * @NoneScoped		 -> Sessão ativa por demanda, inicializa e morre na hora, um escopo menos utilizado.
 * */


/*Observações sobre escopos que possuem um tempo de vida longo
 * @AplicationScoped, @SessionScoped e @ViewScoped 
 * 
 * Os objetos que são colocados nestes escopos podem precisar serem serializados;
 * 	**Serilização: É um processo que escreve o processo atual em bytes para serem transmitidos via rede ou algo similar;
 * 	
 * Para isso é necessário que uma class implemente uma interface (contrato) com a interface Serializable() -> Interface apenas de marcação; 
 * */

@ManagedBean
@SessionScoped
public class GestaoProdutosBean {
	private Produto produto;
	private List<Produto> produtos;
	private Produto produtoSelecionado;
	private List<Produto> produtosFiltrados;
	private String fabricantePesquisa;
	
	public GestaoProdutosBean(){
		this.produtos = new ArrayList<Produto>();
		this.produtosFiltrados = new ArrayList<Produto>();
		this.produto = new Produto();
	}
	
	public void verificarCampos(ActionEvent event){
		if ("".equals(this.getProduto().getFabricante())) {
			this.produto.setFabricante("Não Informado");
		}
		
		if ("".equals(this.produto.getCategoria())) {
			this.produto.setCategoria("Não Informado");
		}
	}
	
	public void incluir(){
		this.produtos.add(this.produto);
		
		this.produto = new Produto();
	}
	
	public void excluir(){
		this.produtos.remove(this.produtoSelecionado);
	}
	
	
	public void pesquisar(){
		System.out.println("Pesquisando faricante - Aguarde...");
	}
	
	public void fabricantePesquisaAlterado(ValueChangeEvent event){
		System.out.println("\nValor fabricantePesquisado Fabricante: " + this.fabricantePesquisa);
		System.out.println("Valor getOldValue Fabricante: " + event.getOldValue());
		System.out.println("Valor getNewValue Fabricante: " + event.getNewValue());
		
		this.produtosFiltrados.clear();
		
		for(Produto produto : this.produtos){
			if (produto.getNome() != null && produto.getNome().toLowerCase().startsWith(event.getNewValue().toString().toLowerCase())) {
				this.produtosFiltrados.add(produto);
			}
		}
	}
	
	public String obterHelp(){
		if (this.produtos.isEmpty()) {
			return "HelpGestaoProdutos?faces-redirect=true";
		}else{
			return "HelpGestaoProdutosTelefone?faces-redirect=true";
		}
		
	}
	
	/*Método para analisar o tempo de vida escopo
	 *Geralmente utilizado para inicializar algum recurso que o Bean precisa, carregar algum .xml etc...
	 * */
//	@PostConstruct
//	public void inicializar(){
//		System.out.println("Inicializou");
//	}
	
	/*Será chamado momentos antes do ManagedBean ser encerrado
	 *Geralmente utilizado finalizar algum recurso que o Bean está utilizando, fechar arquivo, salvar algo no banco.
	 * */
//	@PreDestroy
//	public void finalizar(){
//		System.out.println("Finalizando Bean");
//	}

	//Métodos gets e sets
	public Produto getProduto() {
		return produto;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public Produto getProdutoSelecionado() {
		return produtoSelecionado;
	}
	public void setProdutoSelecionado(Produto produtoSelecionado) {
		this.produtoSelecionado = produtoSelecionado;
	}
	
	public List<Produto> getProdutosFiltrados() {
		return produtosFiltrados;
	}
	
	public String getFabricantePesquisado() {
		return fabricantePesquisa;
	}
	public void setFabricantePesquisado(String fabricantePesquisado) {
		this.fabricantePesquisa = fabricantePesquisado;
	}
}
