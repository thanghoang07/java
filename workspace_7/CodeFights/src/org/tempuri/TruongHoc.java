/**
 * TruongHoc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class TruongHoc  implements java.io.Serializable {
    private java.lang.String maTruong;

    private java.lang.String tenTruong;

    private int soDienThoai;

    private java.lang.String diaChi;

    private int namThanhLap;

    public TruongHoc() {
    }

    public TruongHoc(
           java.lang.String maTruong,
           java.lang.String tenTruong,
           int soDienThoai,
           java.lang.String diaChi,
           int namThanhLap) {
           this.maTruong = maTruong;
           this.tenTruong = tenTruong;
           this.soDienThoai = soDienThoai;
           this.diaChi = diaChi;
           this.namThanhLap = namThanhLap;
    }


    /**
     * Gets the maTruong value for this TruongHoc.
     * 
     * @return maTruong
     */
    public java.lang.String getMaTruong() {
        return maTruong;
    }


    /**
     * Sets the maTruong value for this TruongHoc.
     * 
     * @param maTruong
     */
    public void setMaTruong(java.lang.String maTruong) {
        this.maTruong = maTruong;
    }


    /**
     * Gets the tenTruong value for this TruongHoc.
     * 
     * @return tenTruong
     */
    public java.lang.String getTenTruong() {
        return tenTruong;
    }


    /**
     * Sets the tenTruong value for this TruongHoc.
     * 
     * @param tenTruong
     */
    public void setTenTruong(java.lang.String tenTruong) {
        this.tenTruong = tenTruong;
    }


    /**
     * Gets the soDienThoai value for this TruongHoc.
     * 
     * @return soDienThoai
     */
    public int getSoDienThoai() {
        return soDienThoai;
    }


    /**
     * Sets the soDienThoai value for this TruongHoc.
     * 
     * @param soDienThoai
     */
    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }


    /**
     * Gets the diaChi value for this TruongHoc.
     * 
     * @return diaChi
     */
    public java.lang.String getDiaChi() {
        return diaChi;
    }


    /**
     * Sets the diaChi value for this TruongHoc.
     * 
     * @param diaChi
     */
    public void setDiaChi(java.lang.String diaChi) {
        this.diaChi = diaChi;
    }


    /**
     * Gets the namThanhLap value for this TruongHoc.
     * 
     * @return namThanhLap
     */
    public int getNamThanhLap() {
        return namThanhLap;
    }


    /**
     * Sets the namThanhLap value for this TruongHoc.
     * 
     * @param namThanhLap
     */
    public void setNamThanhLap(int namThanhLap) {
        this.namThanhLap = namThanhLap;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TruongHoc)) return false;
        TruongHoc other = (TruongHoc) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.maTruong==null && other.getMaTruong()==null) || 
             (this.maTruong!=null &&
              this.maTruong.equals(other.getMaTruong()))) &&
            ((this.tenTruong==null && other.getTenTruong()==null) || 
             (this.tenTruong!=null &&
              this.tenTruong.equals(other.getTenTruong()))) &&
            this.soDienThoai == other.getSoDienThoai() &&
            ((this.diaChi==null && other.getDiaChi()==null) || 
             (this.diaChi!=null &&
              this.diaChi.equals(other.getDiaChi()))) &&
            this.namThanhLap == other.getNamThanhLap();
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
        if (getMaTruong() != null) {
            _hashCode += getMaTruong().hashCode();
        }
        if (getTenTruong() != null) {
            _hashCode += getTenTruong().hashCode();
        }
        _hashCode += getSoDienThoai();
        if (getDiaChi() != null) {
            _hashCode += getDiaChi().hashCode();
        }
        _hashCode += getNamThanhLap();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TruongHoc.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "TruongHoc"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("soDienThoai");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SoDienThoai"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diaChi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DiaChi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namThanhLap");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NamThanhLap"));
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
