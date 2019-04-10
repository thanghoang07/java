/**
 * GiaoVien.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GiaoVien  extends org.tempuri.Person  implements java.io.Serializable {
    private java.lang.String maGiaoVien;

    private java.lang.String tenGiaoVien;

    public GiaoVien() {
    }

    public GiaoVien(
           java.lang.String maTruong,
           java.lang.String tenTruong,
           java.lang.String mail,
           java.lang.String pass,
           java.util.Calendar ngaySinh,
           java.lang.String gioiTinh,
           java.lang.String diaChi,
           java.lang.String maGiaoVien,
           java.lang.String tenGiaoVien) {
        super(
            maTruong,
            tenTruong,
            mail,
            pass,
            ngaySinh,
            gioiTinh,
            diaChi);
        this.maGiaoVien = maGiaoVien;
        this.tenGiaoVien = tenGiaoVien;
    }


    /**
     * Gets the maGiaoVien value for this GiaoVien.
     * 
     * @return maGiaoVien
     */
    public java.lang.String getMaGiaoVien() {
        return maGiaoVien;
    }


    /**
     * Sets the maGiaoVien value for this GiaoVien.
     * 
     * @param maGiaoVien
     */
    public void setMaGiaoVien(java.lang.String maGiaoVien) {
        this.maGiaoVien = maGiaoVien;
    }


    /**
     * Gets the tenGiaoVien value for this GiaoVien.
     * 
     * @return tenGiaoVien
     */
    public java.lang.String getTenGiaoVien() {
        return tenGiaoVien;
    }


    /**
     * Sets the tenGiaoVien value for this GiaoVien.
     * 
     * @param tenGiaoVien
     */
    public void setTenGiaoVien(java.lang.String tenGiaoVien) {
        this.tenGiaoVien = tenGiaoVien;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GiaoVien)) return false;
        GiaoVien other = (GiaoVien) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.maGiaoVien==null && other.getMaGiaoVien()==null) || 
             (this.maGiaoVien!=null &&
              this.maGiaoVien.equals(other.getMaGiaoVien()))) &&
            ((this.tenGiaoVien==null && other.getTenGiaoVien()==null) || 
             (this.tenGiaoVien!=null &&
              this.tenGiaoVien.equals(other.getTenGiaoVien())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getMaGiaoVien() != null) {
            _hashCode += getMaGiaoVien().hashCode();
        }
        if (getTenGiaoVien() != null) {
            _hashCode += getTenGiaoVien().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GiaoVien.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "GiaoVien"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maGiaoVien");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MaGiaoVien"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenGiaoVien");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TenGiaoVien"));
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
