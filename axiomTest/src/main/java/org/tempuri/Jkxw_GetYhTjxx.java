/**
 * Jkxw_GetYhTjxx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Jkxw_GetYhTjxx  implements java.io.Serializable {
    private java.lang.String sSfzh;

    private java.lang.String sCheckDate;

    public Jkxw_GetYhTjxx() {
    }

    public Jkxw_GetYhTjxx(
           java.lang.String sSfzh,
           java.lang.String sCheckDate) {
           this.sSfzh = sSfzh;
           this.sCheckDate = sCheckDate;
    }


    /**
     * Gets the sSfzh value for this Jkxw_GetYhTjxx.
     * 
     * @return sSfzh
     */
    public java.lang.String getSSfzh() {
        return sSfzh;
    }


    /**
     * Sets the sSfzh value for this Jkxw_GetYhTjxx.
     * 
     * @param sSfzh
     */
    public void setSSfzh(java.lang.String sSfzh) {
        this.sSfzh = sSfzh;
    }


    /**
     * Gets the sCheckDate value for this Jkxw_GetYhTjxx.
     * 
     * @return sCheckDate
     */
    public java.lang.String getSCheckDate() {
        return sCheckDate;
    }


    /**
     * Sets the sCheckDate value for this Jkxw_GetYhTjxx.
     * 
     * @param sCheckDate
     */
    public void setSCheckDate(java.lang.String sCheckDate) {
        this.sCheckDate = sCheckDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Jkxw_GetYhTjxx)) return false;
        Jkxw_GetYhTjxx other = (Jkxw_GetYhTjxx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sSfzh==null && other.getSSfzh()==null) || 
             (this.sSfzh!=null &&
              this.sSfzh.equals(other.getSSfzh()))) &&
            ((this.sCheckDate==null && other.getSCheckDate()==null) || 
             (this.sCheckDate!=null &&
              this.sCheckDate.equals(other.getSCheckDate())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSSfzh() != null) {
            _hashCode += getSSfzh().hashCode();
        }
        if (getSCheckDate() != null) {
            _hashCode += getSCheckDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Jkxw_GetYhTjxx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Jkxw_GetYhTjxx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSfzh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sSfzh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCheckDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sCheckDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
