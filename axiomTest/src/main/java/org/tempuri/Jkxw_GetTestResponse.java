/**
 * Jkxw_GetTestResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Jkxw_GetTestResponse  implements java.io.Serializable {
    private org.tempuri.Jkxw_GetTestResponseJkxw_GetTestResult jkxw_GetTestResult;

    public Jkxw_GetTestResponse() {
    }

    public Jkxw_GetTestResponse(
           org.tempuri.Jkxw_GetTestResponseJkxw_GetTestResult jkxw_GetTestResult) {
           this.jkxw_GetTestResult = jkxw_GetTestResult;
    }


    /**
     * Gets the jkxw_GetTestResult value for this Jkxw_GetTestResponse.
     * 
     * @return jkxw_GetTestResult
     */
    public org.tempuri.Jkxw_GetTestResponseJkxw_GetTestResult getJkxw_GetTestResult() {
        return jkxw_GetTestResult;
    }


    /**
     * Sets the jkxw_GetTestResult value for this Jkxw_GetTestResponse.
     * 
     * @param jkxw_GetTestResult
     */
    public void setJkxw_GetTestResult(org.tempuri.Jkxw_GetTestResponseJkxw_GetTestResult jkxw_GetTestResult) {
        this.jkxw_GetTestResult = jkxw_GetTestResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Jkxw_GetTestResponse)) return false;
        Jkxw_GetTestResponse other = (Jkxw_GetTestResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.jkxw_GetTestResult==null && other.getJkxw_GetTestResult()==null) || 
             (this.jkxw_GetTestResult!=null &&
              this.jkxw_GetTestResult.equals(other.getJkxw_GetTestResult())));
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
        if (getJkxw_GetTestResult() != null) {
            _hashCode += getJkxw_GetTestResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Jkxw_GetTestResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Jkxw_GetTestResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jkxw_GetTestResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Jkxw_GetTestResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Jkxw_GetTestResponse>Jkxw_GetTestResult"));
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
