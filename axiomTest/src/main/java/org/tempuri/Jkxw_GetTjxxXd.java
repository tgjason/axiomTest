/**
 * Jkxw_GetTjxxXd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Jkxw_GetTjxxXd  implements java.io.Serializable {
    private java.lang.String sSfzh;

    private java.lang.String sCheckdate;

    private java.lang.String sIcpcode;

    public Jkxw_GetTjxxXd() {
    }

    public Jkxw_GetTjxxXd(
           java.lang.String sSfzh,
           java.lang.String sCheckdate,
           java.lang.String sIcpcode) {
           this.sSfzh = sSfzh;
           this.sCheckdate = sCheckdate;
           this.sIcpcode = sIcpcode;
    }


    /**
     * Gets the sSfzh value for this Jkxw_GetTjxxXd.
     * 
     * @return sSfzh
     */
    public java.lang.String getSSfzh() {
        return sSfzh;
    }


    /**
     * Sets the sSfzh value for this Jkxw_GetTjxxXd.
     * 
     * @param sSfzh
     */
    public void setSSfzh(java.lang.String sSfzh) {
        this.sSfzh = sSfzh;
    }


    /**
     * Gets the sCheckdate value for this Jkxw_GetTjxxXd.
     * 
     * @return sCheckdate
     */
    public java.lang.String getSCheckdate() {
        return sCheckdate;
    }


    /**
     * Sets the sCheckdate value for this Jkxw_GetTjxxXd.
     * 
     * @param sCheckdate
     */
    public void setSCheckdate(java.lang.String sCheckdate) {
        this.sCheckdate = sCheckdate;
    }


    /**
     * Gets the sIcpcode value for this Jkxw_GetTjxxXd.
     * 
     * @return sIcpcode
     */
    public java.lang.String getSIcpcode() {
        return sIcpcode;
    }


    /**
     * Sets the sIcpcode value for this Jkxw_GetTjxxXd.
     * 
     * @param sIcpcode
     */
    public void setSIcpcode(java.lang.String sIcpcode) {
        this.sIcpcode = sIcpcode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Jkxw_GetTjxxXd)) return false;
        Jkxw_GetTjxxXd other = (Jkxw_GetTjxxXd) obj;
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
            ((this.sCheckdate==null && other.getSCheckdate()==null) || 
             (this.sCheckdate!=null &&
              this.sCheckdate.equals(other.getSCheckdate()))) &&
            ((this.sIcpcode==null && other.getSIcpcode()==null) || 
             (this.sIcpcode!=null &&
              this.sIcpcode.equals(other.getSIcpcode())));
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
        if (getSCheckdate() != null) {
            _hashCode += getSCheckdate().hashCode();
        }
        if (getSIcpcode() != null) {
            _hashCode += getSIcpcode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Jkxw_GetTjxxXd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Jkxw_GetTjxxXd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSfzh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sSfzh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCheckdate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sCheckdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIcpcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sIcpcode"));
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
