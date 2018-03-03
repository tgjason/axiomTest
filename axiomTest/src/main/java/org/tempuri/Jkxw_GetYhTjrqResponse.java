/**
 * Jkxw_GetYhTjrqResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Jkxw_GetYhTjrqResponse  implements java.io.Serializable {
    private org.tempuri.Jkxw_GetYhTjrqResponseJkxw_GetYhTjrqResult jkxw_GetYhTjrqResult;

    public Jkxw_GetYhTjrqResponse() {
    }

    public Jkxw_GetYhTjrqResponse(
           org.tempuri.Jkxw_GetYhTjrqResponseJkxw_GetYhTjrqResult jkxw_GetYhTjrqResult) {
           this.jkxw_GetYhTjrqResult = jkxw_GetYhTjrqResult;
    }


    /**
     * Gets the jkxw_GetYhTjrqResult value for this Jkxw_GetYhTjrqResponse.
     * 
     * @return jkxw_GetYhTjrqResult
     */
    public org.tempuri.Jkxw_GetYhTjrqResponseJkxw_GetYhTjrqResult getJkxw_GetYhTjrqResult() {
        return jkxw_GetYhTjrqResult;
    }


    /**
     * Sets the jkxw_GetYhTjrqResult value for this Jkxw_GetYhTjrqResponse.
     * 
     * @param jkxw_GetYhTjrqResult
     */
    public void setJkxw_GetYhTjrqResult(org.tempuri.Jkxw_GetYhTjrqResponseJkxw_GetYhTjrqResult jkxw_GetYhTjrqResult) {
        this.jkxw_GetYhTjrqResult = jkxw_GetYhTjrqResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Jkxw_GetYhTjrqResponse)) return false;
        Jkxw_GetYhTjrqResponse other = (Jkxw_GetYhTjrqResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.jkxw_GetYhTjrqResult==null && other.getJkxw_GetYhTjrqResult()==null) || 
             (this.jkxw_GetYhTjrqResult!=null &&
              this.jkxw_GetYhTjrqResult.equals(other.getJkxw_GetYhTjrqResult())));
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
        if (getJkxw_GetYhTjrqResult() != null) {
            _hashCode += getJkxw_GetYhTjrqResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Jkxw_GetYhTjrqResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Jkxw_GetYhTjrqResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jkxw_GetYhTjrqResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Jkxw_GetYhTjrqResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Jkxw_GetYhTjrqResponse>Jkxw_GetYhTjrqResult"));
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
