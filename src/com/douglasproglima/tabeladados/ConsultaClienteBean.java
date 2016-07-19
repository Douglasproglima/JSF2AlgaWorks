package com.douglasproglima.tabeladados;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ConsultaClienteBean {
	private List<ClienteBean> clientes = new ArrayList<ClienteBean>();

	public List<ClienteBean> getClientes() {
		return clientes;
	}
	
	public void consultar(){
		this.getClientes().add(new ClienteBean(1, "Douglas Lima", "Itaúna"));
		this.getClientes().add(new ClienteBean(2, "Fernando Luiz", "Itaúna"));
		this.getClientes().add(new ClienteBean(4, "Pedro Augusto", "Itaúna"));
		this.getClientes().add(new ClienteBean(6, "Welington Liduário", "Belo Horizonte"));
		this.getClientes().add(new ClienteBean(9, "Paulo Santos", "Belo Horizonte"));
		this.getClientes().add(new ClienteBean(10, "Guilherme Moreira", "Mateus Leme"));
	}
}
