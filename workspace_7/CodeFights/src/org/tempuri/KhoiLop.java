/**
 * KhoiLop.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class KhoiLop  implements java.io.Serializable {
    private java.lang.String maKhoiLop;

    private java.lang.String maTruong;

    private java.lang.String tenTruong;

    private java.lang.String tenKhoiLop;

    private int soLuongHocSinh;

    private int soLuongLopHoc;

    public KhoiLop() {
    }

    public KhoiLop(
           java.lang.String maKhoiLop,
           java.lang.String maTruong,
           java.lang.String tenTruong,
           java.lang.String tenKhoiLop,
           int soLuongHocSinh,
           int soLuongLopHoc) {
           this.maKhoiLop = maKhoiLop;
           this.maTruong = maTruong;
           this.tenTruong = tenTruong;
           this.tenKhoiLop = tenKhoiLop;
           this.soLuongHocSinh = soLuongHocSinh;
           this.soLuongLopHoc = soLuongLopHoc;
    }


    /**
     * Gets the maKhoiLop value for this KhoiLop.
     * 
     * @return maKhoiLop
     */
    public java.lang.String getMaKhoiLop() {
        return maKhoiLop;
    }


    /**
     * Sets the maKhoiLop value for this KhoiLop.
     * 
     * @param maKhoiLop
     */
    public void setMaKhoiLop(java.lang.String maKhoiLop) {
        this.maKhoiLop = maKhoiLop;
    }


    /**
     * Gets the maTruong value for this KhoiLop.
     * 
     * @return maTruong
     */
    public java.lang.String getMaTruong() {
        return maTruong;
    }


    /**
     * Sets the maTruong value for this KhoiLop.
     * 
     * @param maTruong
     */
    public void setMaTruong(java.lang.String maTruong) {
        this.maTruong = maTruong;
    }


    /**
     * Gets the tenTruong value for this KhoiLop.
     * 
     * @return tenTruong
     */
    public java.lang.String getTenTruong() {
        return tenTruong;
    }


    /**
     * Sets the tenTruong value for this KhoiLop.
     * 
     * @param tenTruong
     */
    public void setTenTruong(java.lang.String tenTruong) {
        this.tenTruong = tenTruong;
    }


    /**
     * Gets the tenKhoiLop value for this KhoiLop.
     * 
     * @return tenKhoiLop
     */
    public java.lang.String getTenKhoiLop() {
        return tenKhoiLop;
    }


    /**
     * Sets the tenKhoiLop value for this KhoiLop.
     * 
     * @param tenKhoiLop
     */
    public void setTenKhoiLop(java.lang.String tenKhoiLop) {
        this.tenKhoiLop = tenKhoiLop;
    }


    /**
     * Gets the soLuongHocSinh value for this KhoiLop.
     * 
     * @return soLuongHocSinh
     */
    public int getSoLuongHocSinh() {
        return soLuongHocSinh;
    }


    /**
     * Sets the soLuongHocSinh value for this KhoiLop.
     * 
     * @param soLuongHocSinh
     */
    public void setSoLuongHocSinh(int soLuongHocSinh) {
        this.soLuongHocSinh = soLuongHocSinh;
    }


    /**
     * Gets the soLuongLopHoc value for this KhoiLop.
     * 
     * @return soLuongLopHoc
     */
    public int getSoLuongLopHoc() {
        return soLuongLopHoc;
    }


    /**
     * Sets the soLuongLopHoc value for this KhoiLop.
     * 
     * @param soLuongLopHoc
     */
    public void setSoLuongLopHoc(int soLuongLopHoc) {
        this.soLuongLopHoc = soLuongLopHoc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KhoiLop)) return false;
        KhoiLop other = (KhoiLop) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.maKhoiLop==null && other.getMaKhoiLop()==null) || 
             (this.maKhoiLop!=null &&
              this.maKhoiLop.equals(other.getMaKhoiLop()))) &&
            ((this.maTruong==null && other.getMaTruong()==null) || 
             (this.maTruong!=null &&
              this.maTruong.equals(other.getMaTruong()))) &&
            ((this.tenTruong==null && other.getTenTruong()==null) || 
             (this.tenTruong!=null &&
              this.tenTruong.equals(other.getTenTruong()))) &&
            ((this.tenKhoiLop==null && other.getTenKhoiLop()==null) || 
             (this.tenKhoiLop!=null &&
              this.tenKhoiLop.equals(other.getTenKhoiLop()))) &&
            this.soLuongHocSinh == other.getSoLuongHocSinh() &&
            this.soLuongLopHoc == other.getSoLuongLopHoc();
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
        if (getMaKhoiLop() != null) {
            _hashCode += getMaKhoiLop().hashCode();
        }
        if (getMaTruong() != null) {
            _hashCode += getMaTruong().hashCode();
        }
        if (getTenTruong() != null) {
            _hashCode += getTenTruong().hashCode();
        }
        if (getTenKhoiLop() != null) {
            _hashCode += getTenKhoiLop().hashCode();
        }
        _hashCode += getSoLuongHocSinh();
        _hashCode += getSoLuongLopHoc();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KhoiLop.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "KhoiLop"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maKhoiLop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MaKhoiLop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maTruong");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MaTruong"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenTruong");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TenTruong"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenKhoiLop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TenKhoiLop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soLuongHocSinh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SoLuongHocSinh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soLuongLopHoc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SoLuongLopHoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
