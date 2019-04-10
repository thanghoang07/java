/**
 * StudentManagerWebServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class StudentManagerWebServiceLocator extends org.apache.axis.client.Service implements org.tempuri.StudentManagerWebService {

    public StudentManagerWebServiceLocator() {
    }


    public StudentManagerWebServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public StudentManagerWebServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for StudentManagerWebServiceSoap
    private java.lang.String StudentManagerWebServiceSoap_address = "http://round2demo4.azurewebsites.net/WServices/StudentManagerWebService.asmx";

    public java.lang.String getStudentManagerWebServiceSoapAddress() {
        return StudentManagerWebServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String StudentManagerWebServiceSoapWSDDServiceName = "StudentManagerWebServiceSoap";

    public java.lang.String getStudentManagerWebServiceSoapWSDDServiceName() {
        return StudentManagerWebServiceSoapWSDDServiceName;
    }

    public void setStudentManagerWebServiceSoapWSDDServiceName(java.lang.String name) {
        StudentManagerWebServiceSoapWSDDServiceName = name;
    }

    public org.tempuri.StudentManagerWebServiceSoap getStudentManagerWebServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(StudentManagerWebServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getStudentManagerWebServiceSoap(endpoint);
    }

    public org.tempuri.StudentManagerWebServiceSoap getStudentManagerWebServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.StudentManagerWebServiceSoapStub _stub = new org.tempuri.StudentManagerWebServiceSoapStub(portAddress, this);
            _stub.setPortName(getStudentManagerWebServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setStudentManagerWebServiceSoapEndpointAddress(java.lang.String address) {
        StudentManagerWebServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.StudentManagerWebServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.StudentManagerWebServiceSoapStub _stub = new org.tempuri.StudentManagerWebServiceSoapStub(new java.net.URL(StudentManagerWebServiceSoap_address), this);
                _stub.setPortName(getStudentManagerWebServiceSoapWSDDServiceName());
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
        if ("StudentManagerWebServiceSoap".equals(inputPortName)) {
            return getStudentManagerWebServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "StudentManagerWebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "StudentManagerWebServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("StudentManagerWebServiceSoap".equals(portName)) {
            setStudentManagerWebServiceSoapEndpointAddress(address);
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
