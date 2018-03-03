/**
 * Jkxw_GetYhTjxxResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Jkxw_GetYhTjxxResponse  implements java.io.Serializable {
    private org.tempuri.Jkxw_GetYhTjxxResponseJkxw_GetYhTjxxResult jkxw_GetYhTjxxResult;

    public Jkxw_GetYhTjxxResponse() {
    }

    public Jkxw_GetYhTjxxResponse(
           org.tempuri.Jkxw_GetYhTjxxResponseJkxw_GetYhTjxxResult jkxw_GetYhTjxxResult) {
           this.jkxw_GetYhTjxxResult = jkxw_GetYhTjxxResult;
    }


    /**
     * Gets the jkxw_GetYhTjxxResult value for this Jkxw_GetYhTjxxResponse.
     * 
     * @return jkxw_GetYhTjxxResult
     */
    public org.tempuri.Jkxw_GetYhTjxxResponseJkxw_GetYhTjxxResult getJkxw_GetYhTjxxResult() {
        return jkxw_GetYhTjxxResult;
    }


    /**
     * Sets the jkxw_GetYhTjxxResult value for this Jkxw_GetYhTjxxResponse.
     * 
     * @param jkxw_GetYhTjxxResult
     */
    public void setJkxw_GetYhTjxxResult(org.tempuri.Jkxw_GetYhTjxxResponseJkxw_GetYhTjxxResult jkxw_GetYhTjxxResult) {
        this.jkxw_GetYhTjxxResult = jkxw_GetYhTjxxResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Jkxw_GetYhTjxxResponse)) return false;
        Jkxw_GetYhTjxxResponse other = (Jkxw_GetYhTjxxResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.jkxw_GetYhTjxxResult==null && other.getJkxw_GetYhTjxxResult()==null) || 
             (this.jkxw_GetYhTjxxResult!=null &&
              this.jkxw_GetYhTjxxResult.equals(other.getJkxw_GetYhTjxxResult())));
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
        if (getJkxw_GetYhTjxxResult() != null) {
            _hashCode += getJkxw_GetYhTjxxResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Jkxw_GetYhTjxxResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Jkxw_GetYhTjxxResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jkxw_GetYhTjxxResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Jkxw_GetYhTjxxResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Jkxw_GetYhTjxxResponse>Jkxw_GetYhTjxxResult"));
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
