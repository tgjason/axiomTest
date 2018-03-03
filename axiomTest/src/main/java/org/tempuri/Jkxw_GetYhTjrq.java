/**
 * Jkxw_GetYhTjrq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Jkxw_GetYhTjrq  implements java.io.Serializable {
    private java.lang.String sSfzh;

    public Jkxw_GetYhTjrq() {
    }

    public Jkxw_GetYhTjrq(
           java.lang.String sSfzh) {
           this.sSfzh = sSfzh;
    }


    /**
     * Gets the sSfzh value for this Jkxw_GetYhTjrq.
     * 
     * @return sSfzh
     */
    public java.lang.String getSSfzh() {
        return sSfzh;
    }


    /**
     * Sets the sSfzh value for this Jkxw_GetYhTjrq.
     * 
     * @param sSfzh
     */
    public void setSSfzh(java.lang.String sSfzh) {
        this.sSfzh = sSfzh;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Jkxw_GetYhTjrq)) return false;
        Jkxw_GetYhTjrq other = (Jkxw_GetYhTjrq) obj;
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
              this.sSfzh.equals(other.getSSfzh())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Jkxw_GetYhTjrq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Jkxw_GetYhTjrq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSfzh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sSfzh"));
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
