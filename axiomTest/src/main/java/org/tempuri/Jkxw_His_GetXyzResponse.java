/**
 * Jkxw_His_GetXyzResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Jkxw_His_GetXyzResponse  implements java.io.Serializable {
    private java.lang.String jkxw_His_GetXyzResult;

    public Jkxw_His_GetXyzResponse() {
    }

    public Jkxw_His_GetXyzResponse(
           java.lang.String jkxw_His_GetXyzResult) {
           this.jkxw_His_GetXyzResult = jkxw_His_GetXyzResult;
    }


    /**
     * Gets the jkxw_His_GetXyzResult value for this Jkxw_His_GetXyzResponse.
     * 
     * @return jkxw_His_GetXyzResult
     */
    public java.lang.String getJkxw_His_GetXyzResult() {
        return jkxw_His_GetXyzResult;
    }


    /**
     * Sets the jkxw_His_GetXyzResult value for this Jkxw_His_GetXyzResponse.
     * 
     * @param jkxw_His_GetXyzResult
     */
    public void setJkxw_His_GetXyzResult(java.lang.String jkxw_His_GetXyzResult) {
        this.jkxw_His_GetXyzResult = jkxw_His_GetXyzResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Jkxw_His_GetXyzResponse)) return false;
        Jkxw_His_GetXyzResponse other = (Jkxw_His_GetXyzResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.jkxw_His_GetXyzResult==null && other.getJkxw_His_GetXyzResult()==null) || 
             (this.jkxw_His_GetXyzResult!=null &&
              this.jkxw_His_GetXyzResult.equals(other.getJkxw_His_GetXyzResult())));
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
        if (getJkxw_His_GetXyzResult() != null) {
            _hashCode += getJkxw_His_GetXyzResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Jkxw_His_GetXyzResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Jkxw_His_GetXyzResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jkxw_His_GetXyzResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Jkxw_His_GetXyzResult"));
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
