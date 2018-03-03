/**
 * WebServiceJkxwSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface WebServiceJkxwSoap extends java.rmi.Remote {

    /**
     * HelloWorld
     */
    public java.lang.String helloWorld() throws java.rmi.RemoteException;
    public org.tempuri.Jkxw_GetYhxxResponseJkxw_GetYhxxResult jkxw_GetYhxx(java.lang.String sPara) throws java.rmi.RemoteException;

    /**
     * 根据身份证获取用户体检日期
     */
    public org.tempuri.Jkxw_GetYhTjrqResponseJkxw_GetYhTjrqResult jkxw_GetYhTjrq(java.lang.String sSfzh) throws java.rmi.RemoteException;

    /**
     * 根据身份证、体检日期获取用户体检信息
     */
    public org.tempuri.Jkxw_GetYhTjxxResponseJkxw_GetYhTjxxResult jkxw_GetYhTjxx(java.lang.String sSfzh, java.lang.String sCheckDate) throws java.rmi.RemoteException;

    /**
     * 测试
     */
    public org.tempuri.Jkxw_GetTestResponseJkxw_GetTestResult jkxw_GetTest() throws java.rmi.RemoteException;
    public java.lang.String funMain(java.lang.String sXml) throws java.rmi.RemoteException;
    public java.lang.String jkxw_His_GetXyz(java.lang.String sData) throws java.rmi.RemoteException;

    /**
     * 获取体检信息
     */
    public java.lang.String jkxw_GetTjxx(java.lang.String sData) throws java.rmi.RemoteException;

    /**
     * 保存心电图
     */
    public org.tempuri.SaveJKXW_SCXDResponseSaveJKXW_SCXDResult saveJKXW_SCXD(java.lang.String sData) throws java.rmi.RemoteException;

    /**
     * 获取心电图
     */
    public java.lang.String jkxw_GetTjxxXd(java.lang.String sSfzh, java.lang.String sCheckdate, java.lang.String sIcpcode) throws java.rmi.RemoteException;

    /**
     * 获取心电图png
     */
    public java.lang.String jkxw_GetTjxxXdpng(java.lang.String sSfzh, java.lang.String sCheckdate, java.lang.String sIcpcode) throws java.rmi.RemoteException;
}
