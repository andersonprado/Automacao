package br.com.WebServiceClient;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import br.com.arduino.Conexao;
import br.com.arduino.ConexaoProxy;
import br.com.arduino.ConexaoService;
import br.com.arduino.ConexaoServiceLocator;

public class TesteAcesso {

	public static void main(String[] args) throws ServiceException,
			RemoteException {

		ConexaoServiceLocator service = new ConexaoServiceLocator();
		Conexao proxy = service.getConexaoPort();
		proxy.habilita();
	}

}
