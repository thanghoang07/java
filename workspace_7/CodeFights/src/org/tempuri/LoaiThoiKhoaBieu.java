/**
 * LoaiThoiKhoaBieu.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class LoaiThoiKhoaBieu  implements java.io.Serializable {
    private int maLoaiThoiKhoaBieu;

    private java.lang.String tenLoaiThoiKhoaBieu;

    public LoaiThoiKhoaBieu() {
    }

    public LoaiThoiKhoaBieu(
           int maLoaiThoiKhoaBieu,
           java.lang.String tenLoaiThoiKhoaBieu) {
           this.maLoaiThoiKhoaBieu = maLoaiThoiKhoaBieu;
           this.tenLoaiThoiKhoaBieu = tenLoaiThoiKhoaBieu;
    }


    /**
     * Gets the maLoaiThoiKhoaBieu value for this LoaiThoiKhoaBieu.
     * 
     * @return maLoaiThoiKhoaBieu
     */
    public int getMaLoaiThoiKhoaBieu() {
        return maLoaiThoiKhoaBieu;
    }


    /**
     * Sets the maLoaiThoiKhoaBieu value for this LoaiThoiKhoaBieu.
     * 
     * @param maLoaiThoiKhoaBieu
     */
    public void setMaLoaiThoiKhoaBieu(int maLoaiThoiKhoaBieu) {
        this.maLoaiThoiKhoaBieu = maLoaiThoiKhoaBieu;
    }


    /**
     * Gets the tenLoaiThoiKhoaBieu value for this LoaiThoiKhoaBieu.
     * 
     * @return tenLoaiThoiKhoaBieu
     */
    public java.lang.String getTenLoaiThoiKhoaBieu() {
        return tenLoaiThoiKhoaBieu;
    }


    /**
     * Sets the tenLoaiThoiKhoaBieu value for this LoaiThoiKhoaBieu.
     * 
     * @param tenLoaiThoiKhoaBieu
     */
    public void setTenLoaiThoiKhoaBieu(java.lang.String tenLoaiThoiKhoaBieu) {
        this.tenLoaiThoiKhoaBieu = tenLoaiThoiKhoaBieu;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoaiThoiKhoaBieu)) return false;
        LoaiThoiKhoaBieu other = (LoaiThoiKhoaBieu) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.maLoaiThoiKhoaBieu == other.getMaLoaiThoiKhoaBieu() &&
            ((this.tenLoaiThoiKhoaBieu==null && other.getTenLoaiThoiKhoaBieu()==null) || 
             (this.tenLoaiThoiKhoaBieu!=null &&
              this.tenLoaiThoiKhoaBieu.equals(other.getTenLoaiThoiKhoaBieu())));
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
        _hashCode += getMaLoaiThoiKhoaBieu();
        if (getTenLoaiThoiKhoaBieu() != null) {
            _hashCode += getTenLoaiThoiKhoaBieu().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoaiThoiKhoaBieu.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "LoaiThoiKhoaBieu"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maLoaiThoiKhoaBieu");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MaLoaiThoiKhoaBieu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenLoaiThoiKhoaBieu");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TenLoaiThoiKhoaBieu"));
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
