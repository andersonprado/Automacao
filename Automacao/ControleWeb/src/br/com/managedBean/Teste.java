package br.com.managedBean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.arduino.ConexaoRemote;

@ManagedBean
@RequestScoped
public class Teste {
	@EJB
	private ConexaoRemote arduino;

	public String ativar() {

		arduino.habilita();

		return "";
	}

	public String desativar() {

		arduino.desabilita();

		return "";

	}

}
