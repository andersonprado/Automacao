package br.com.arduino;

public class ConexaoProxy implements br.com.arduino.Conexao {
  private String _endpoint = null;
  private br.com.arduino.Conexao conexao = null;
  
  public ConexaoProxy() {
    _initConexaoProxy();
  }
  
  public ConexaoProxy(String endpoint) {
    _endpoint = endpoint;
    _initConexaoProxy();
  }
  
  private void _initConexaoProxy() {
    try {
      conexao = (new br.com.arduino.ConexaoServiceLocator()).getConexaoPort();
      if (conexao != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)conexao)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)conexao)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (conexao != null)
      ((javax.xml.rpc.Stub)conexao)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.arduino.Conexao getConexao() {
    if (conexao == null)
      _initConexaoProxy();
    return conexao;
  }
  
  public void habilita() throws java.rmi.RemoteException{
    if (conexao == null)
      _initConexaoProxy();
    conexao.habilita();
  }
  
  public void desabilita() throws java.rmi.RemoteException{
    if (conexao == null)
      _initConexaoProxy();
    conexao.desabilita();
  }
  
  
}