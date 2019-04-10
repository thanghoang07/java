/**
 * LoaiHinhKiemTra.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class LoaiHinhKiemTra  implements java.io.Serializable {
    private java.lang.String maLoai;

    private java.lang.String tenLoai;

    public LoaiHinhKiemTra() {
    }

    public LoaiHinhKiemTra(
           java.lang.String maLoai,
           java.lang.String tenLoai) {
           this.maLoai = maLoai;
           this.tenLoai = tenLoai;
    }


    /**
     * Gets the maLoai value for this LoaiHinhKiemTra.
     * 
     * @return maLoai
     */
    public java.lang.String getMaLoai() {
        return maLoai;
    }


    /**
     * Sets the maLoai value for this LoaiHinhKiemTra.
     * 
     * @param maLoai
     */
    public void setMaLoai(java.lang.String maLoai) {
        this.maLoai = maLoai;
    }


    /**
     * Gets the tenLoai value for this LoaiHinhKiemTra.
     * 
     * @return tenLoai
     */
    public java.lang.String getTenLoai() {
        return tenLoai;
    }


    /**
     * Sets the tenLoai value for this LoaiHinhKiemTra.
     * 
     * @param tenLoai
     */
    public void setTenLoai(java.lang.String tenLoai) {
        this.tenLoai = tenLoai;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoaiHinhKiemTra)) return false;
        LoaiHinhKiemTra other = (LoaiHinhKiemTra) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.maLoai==null && other.getMaLoai()==null) || 
             (this.maLoai!=null &&
              this.maLoai.equals(other.getMaLoai()))) &&
            ((this.tenLoai==null && other.getTenLoai()==null) || 
             (this.tenLoai!=null &&
              this.tenLoai.equals(other.getTenLoai())));
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
        if (getMaLoai() != null) {
            _hashCode += getMaLoai().hashCode();
        }
        if (getTenLoai() != null) {
            _hashCode += getTenLoai().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoaiHinhKiemTra.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "LoaiHinhKiemTra"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maLoai");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MaLoai"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenLoai");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TenLoai"));
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
