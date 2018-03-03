package org.tempuri;

public class WebServiceJkxwSoapProxy implements org.tempuri.WebServiceJkxwSoap {
  private String _endpoint = null;
  private org.tempuri.WebServiceJkxwSoap webServiceJkxwSoap = null;
  
  public WebServiceJkxwSoapProxy() {
    _initWebServiceJkxwSoapProxy();
  }
  
  public WebServiceJkxwSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebServiceJkxwSoapProxy();
  }
  
  private void _initWebServiceJkxwSoapProxy() {
    try {
      webServiceJkxwSoap = (new org.tempuri.WebServiceJkxwLocator()).getWebServiceJkxwSoap();
      if (webServiceJkxwSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webServiceJkxwSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webServiceJkxwSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webServiceJkxwSoap != null)
      ((javax.xml.rpc.Stub)webServiceJkxwSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.WebServiceJkxwSoap getWebServiceJkxwSoap() {
    if (webServiceJkxwSoap == null)
      _initWebServiceJkxwSoapProxy();
    return webServiceJkxwSoap;
  }
  
  public java.lang.String helloWorld() throws java.rmi.RemoteException{
    if (webServiceJkxwSoap == null)
      _initWebServiceJkxwSoapProxy();
    return webServiceJkxwSoap.helloWorld();
  }
  
  public org.tempuri.Jkxw_GetYhxxResponseJkxw_GetYhxxResult jkxw_GetYhxx(java.lang.String sPara) throws java.rmi.RemoteException{
    if (webServiceJkxwSoap == null)
      _initWebServiceJkxwSoapProxy();
    return webServiceJkxwSoap.jkxw_GetYhxx(sPara);
  }
  
  public org.tempuri.Jkxw_GetYhTjrqResponseJkxw_GetYhTjrqResult jkxw_GetYhTjrq(java.lang.String sSfzh) throws java.rmi.RemoteException{
    if (webServiceJkxwSoap == null)
      _initWebServiceJkxwSoapProxy();
    return webServiceJkxwSoap.jkxw_GetYhTjrq(sSfzh);
  }
  
  public org.tempuri.Jkxw_GetYhTjxxResponseJkxw_GetYhTjxxResult jkxw_GetYhTjxx(java.lang.String sSfzh, java.lang.String sCheckDate) throws java.rmi.RemoteException{
    if (webServiceJkxwSoap == null)
      _initWebServiceJkxwSoapProxy();
    return webServiceJkxwSoap.jkxw_GetYhTjxx(sSfzh, sCheckDate);
  }
  
  public org.tempuri.Jkxw_GetTestResponseJkxw_GetTestResult jkxw_GetTest() throws java.rmi.RemoteException{
    if (webServiceJkxwSoap == null)
      _initWebServiceJkxwSoapProxy();
    return webServiceJkxwSoap.jkxw_GetTest();
  }
  
  public java.lang.String funMain(java.lang.String sXml) throws java.rmi.RemoteException{
    if (webServiceJkxwSoap == null)
      _initWebServiceJkxwSoapProxy();
    return webServiceJkxwSoap.funMain(sXml);
  }
  
  public java.lang.String jkxw_His_GetXyz(java.lang.String sData) throws java.rmi.RemoteException{
    if (webServiceJkxwSoap == null)
      _initWebServiceJkxwSoapProxy();
    return webServiceJkxwSoap.jkxw_His_GetXyz(sData);
  }
  
  public java.lang.String jkxw_GetTjxx(java.lang.String sData) throws java.rmi.RemoteException{
    if (webServiceJkxwSoap == null)
      _initWebServiceJkxwSoapProxy();
    return webServiceJkxwSoap.jkxw_GetTjxx(sData);
  }
  
  public org.tempuri.SaveJKXW_SCXDResponseSaveJKXW_SCXDResult saveJKXW_SCXD(java.lang.String sData) throws java.rmi.RemoteException{
    if (webServiceJkxwSoap == null)
      _initWebServiceJkxwSoapProxy();
    return webServiceJkxwSoap.saveJKXW_SCXD(sData);
  }
  
  public java.lang.String jkxw_GetTjxxXd(java.lang.String sSfzh, java.lang.String sCheckdate, java.lang.String sIcpcode) throws java.rmi.RemoteException{
    if (webServiceJkxwSoap == null)
      _initWebServiceJkxwSoapProxy();
    return webServiceJkxwSoap.jkxw_GetTjxxXd(sSfzh, sCheckdate, sIcpcode);
  }
  
  public java.lang.String jkxw_GetTjxxXdpng(java.lang.String sSfzh, java.lang.String sCheckdate, java.lang.String sIcpcode) throws java.rmi.RemoteException{
    if (webServiceJkxwSoap == null)
      _initWebServiceJkxwSoapProxy();
    return webServiceJkxwSoap.jkxw_GetTjxxXdpng(sSfzh, sCheckdate, sIcpcode);
  }
  
  
}