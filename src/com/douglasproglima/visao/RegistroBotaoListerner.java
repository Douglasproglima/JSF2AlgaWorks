package com.douglasproglima.visao;

import javax.faces.bean.ManagedBean;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

@ManagedBean
public class RegistroBotaoListerner implements ActionListener{

	@Override
	public void processAction(ActionEvent event) throws AbortProcessingException {
		System.out.println("Clicando no botão " + event.getComponent().getId()+"\n"
												+ event.getComponent().getFamily());
	}

}
