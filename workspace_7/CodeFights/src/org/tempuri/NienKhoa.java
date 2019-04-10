/**
 * NienKhoa.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class NienKhoa  implements java.io.Serializable {
    private java.lang.String maNienKhoa;

    private java.lang.String tenNienKhoa;

    public NienKhoa() {
    }

    public NienKhoa(
           java.lang.String maNienKhoa,
           java.lang.String tenNienKhoa) {
           this.maNienKhoa = maNienKhoa;
           this.tenNienKhoa = tenNienKhoa;
    }


    /**
     * Gets the maNienKhoa value for this NienKhoa.
     * 
     * @return maNienKhoa
     */
    public java.lang.String getMaNienKhoa() {
        return maNienKhoa;
    }


    /**
     * Sets the maNienKhoa value for this NienKhoa.
     * 
     * @param maNienKhoa
     */
    public void setMaNienKhoa(java.lang.String maNienKhoa) {
        this.maNienKhoa = maNienKhoa;
    }


    /**
     * Gets the tenNienKhoa value for this NienKhoa.
     * 
     * @return tenNienKhoa
     */
    public java.lang.String getTenNienKhoa() {
        return tenNienKhoa;
    }


    /**
     * Sets the tenNienKhoa value for this NienKhoa.
     * 
     * @param tenNienKhoa
     */
    public void setTenNienKhoa(java.lang.String tenNienKhoa) {
        this.tenNienKhoa = tenNienKhoa;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NienKhoa)) return false;
        NienKhoa other = (NienKhoa) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.maNienKhoa==null && other.getMaNienKhoa()==null) || 
             (this.maNienKhoa!=null &&
              this.maNienKhoa.equals(other.getMaNienKhoa()))) &&
            ((this.tenNienKhoa==null && other.getTenNienKhoa()==null) || 
             (this.tenNienKhoa!=null &&
              this.tenNienKhoa.equals(other.getTenNienKhoa())));
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
        if (getMaNienKhoa() != null) {
            _hashCode += getMaNienKhoa().hashCode();
        }
        if (getTenNienKhoa() != null) {
            _hashCode += getTenNienKhoa().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NienKhoa.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "NienKhoa"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maNienKhoa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MaNienKhoa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenNienKhoa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TenNienKhoa"));
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
