/**
 * ConexaoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.arduino;

public class ConexaoServiceLocator extends org.apache.axis.client.Service implements br.com.arduino.ConexaoService {

    public ConexaoServiceLocator() {
    }


    public ConexaoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ConexaoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ConexaoPort
    private java.lang.String ConexaoPort_address = "http://192.168.0.100:8080/ConexaoService/Conexao";

    public java.lang.String getConexaoPortAddress() {
        return ConexaoPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ConexaoPortWSDDServiceName = "ConexaoPort";

    public java.lang.String getConexaoPortWSDDServiceName() {
        return ConexaoPortWSDDServiceName;
    }

    public void setConexaoPortWSDDServiceName(java.lang.String name) {
        ConexaoPortWSDDServiceName = name;
    }

    public br.com.arduino.Conexao getConexaoPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ConexaoPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getConexaoPort(endpoint);
    }

    public br.com.arduino.Conexao getConexaoPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.arduino.ConexaoPortBindingStub _stub = new br.com.arduino.ConexaoPortBindingStub(portAddress, this);
            _stub.setPortName(getConexaoPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setConexaoPortEndpointAddress(java.lang.String address) {
        ConexaoPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.arduino.Conexao.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.arduino.ConexaoPortBindingStub _stub = new br.com.arduino.ConexaoPortBindingStub(new java.net.URL(ConexaoPort_address), this);
                _stub.setPortName(getConexaoPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ConexaoPort".equals(inputPortName)) {
            return getConexaoPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://arduino.com.br/", "ConexaoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://arduino.com.br/", "ConexaoPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ConexaoPort".equals(portName)) {
            setConexaoPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
