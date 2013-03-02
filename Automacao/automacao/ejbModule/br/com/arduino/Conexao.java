package br.com.arduino;

import java.net.URL;
import java.net.URLConnection;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebService;

@WebService
@Stateless
@Remote(ConexaoRemote.class)
public class Conexao implements ConexaoRemote {

	@Override
	public void habilita() {

		URL url;
		try {
			url = new URL("http://192.168.0.250?4=liga");

			URLConnection con = url.openConnection();
			con.setConnectTimeout(1000);
			con.getInputStream();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void desabilita() {
		URL url;
		try {
			url = new URL("http://192.168.0.250?4=desliga");

			URLConnection con = url.openConnection();
			con.setConnectTimeout(1000);
			con.getInputStream();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}