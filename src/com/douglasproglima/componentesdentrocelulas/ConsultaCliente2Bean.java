package com.douglasproglima.componentesdentrocelulas;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/*O escopo padrão é requestScoped*/
@ManagedBean
@ViewScoped
public class ConsultaCliente2Bean {
	private List<Cliente2Bean> clientes = new ArrayList<Cliente2Bean>();

	public List<Cliente2Bean> getClientes() {
		return clientes;
	}
	
	public void consultar(){
		this.getClientes().add(new Cliente2Bean(1, "douglasproglima", "Itaúna"));
		this.getClientes().add(new Cliente2Bean(2, "Fernando Luiz", "Itaúna"));
		this.getClientes().add(new Cliente2Bean(4, "Pedro Augusto", "Itaúna"));
		this.getClientes().add(new Cliente2Bean(6, "Welington Liduário", "Belo Horizonte"));
		this.getClientes().add(new Cliente2Bean(9, "Paulo Santos", "Belo Horizonte"));
		this.getClientes().add(new Cliente2Bean(10, "Guilherme Moreira", "Mateus Leme"));
	}
	
	public void salvar(){
		for(Cliente2Bean cliente2 : this.getClientes()){
			System.out.println(cliente2.getCodigo() + " - " + cliente2.getNome());
		}
	}
}
