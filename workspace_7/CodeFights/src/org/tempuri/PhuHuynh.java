/**
 * PhuHuynh.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class PhuHuynh  extends org.tempuri.Person  implements java.io.Serializable {
    private java.lang.String maPhuHuynh;

    private java.lang.String tenPhuHuynh;

    private java.lang.String maHocSinh;

    private java.lang.String tenHocSinh;

    private java.lang.String soDienThoai;

    private java.lang.String maLopHoc;

    private java.lang.String tenLopHoc;

    private int siSo;

    public PhuHuynh() {
    }

    public PhuHuynh(
           java.lang.String maTruong,
           java.lang.String tenTruong,
           java.lang.String mail,
           java.lang.String pass,
           java.util.Calendar ngaySinh,
           java.lang.String gioiTinh,
           java.lang.String diaChi,
           java.lang.String maPhuHuynh,
           java.lang.String tenPhuHuynh,
           java.lang.String maHocSinh,
           java.lang.String tenHocSinh,
           java.lang.String soDienThoai,
           java.lang.String maLopHoc,
           java.lang.String tenLopHoc,
           int siSo) {
        super(
            maTruong,
            tenTruong,
            mail,
            pass,
            ngaySinh,
            gioiTinh,
            diaChi);
        this.maPhuHuynh = maPhuHuynh;
        this.tenPhuHuynh = tenPhuHuynh;
        this.maHocSinh = maHocSinh;
        this.tenHocSinh = tenHocSinh;
        this.soDienThoai = soDienThoai;
        this.maLopHoc = maLopHoc;
        this.tenLopHoc = tenLopHoc;
        this.siSo = siSo;
    }


    /**
     * Gets the maPhuHuynh value for this PhuHuynh.
     * 
     * @return maPhuHuynh
     */
    public java.lang.String getMaPhuHuynh() {
        return maPhuHuynh;
    }


    /**
     * Sets the maPhuHuynh value for this PhuHuynh.
     * 
     * @param maPhuHuynh
     */
    public void setMaPhuHuynh(java.lang.String maPhuHuynh) {
        this.maPhuHuynh = maPhuHuynh;
    }


    /**
     * Gets the tenPhuHuynh value for this PhuHuynh.
     * 
     * @return tenPhuHuynh
     */
    public java.lang.String getTenPhuHuynh() {
        return tenPhuHuynh;
    }


    /**
     * Sets the tenPhuHuynh value for this PhuHuynh.
     * 
     * @param tenPhuHuynh
     */
    public void setTenPhuHuynh(java.lang.String tenPhuHuynh) {
        this.tenPhuHuynh = tenPhuHuynh;
    }


    /**
     * Gets the maHocSinh value for this PhuHuynh.
     * 
     * @return maHocSinh
     */
    public java.lang.String getMaHocSinh() {
        return maHocSinh;
    }


    /**
     * Sets the maHocSinh value for this PhuHuynh.
     * 
     * @param maHocSinh
     */
    public void setMaHocSinh(java.lang.String maHocSinh) {
        this.maHocSinh = maHocSinh;
    }


    /**
     * Gets the tenHocSinh value for this PhuHuynh.
     * 
     * @return tenHocSinh
     */
    public java.lang.String getTenHocSinh() {
        return tenHocSinh;
    }


    /**
     * Sets the tenHocSinh value for this PhuHuynh.
     * 
     * @param tenHocSinh
     */
    public void setTenHocSinh(java.lang.String tenHocSinh) {
        this.tenHocSinh = tenHocSinh;
    }


    /**
     * Gets the soDienThoai value for this PhuHuynh.
     * 
     * @return soDienThoai
     */
    public java.lang.String getSoDienThoai() {
        return soDienThoai;
    }


    /**
     * Sets the soDienThoai value for this PhuHuynh.
     * 
     * @param soDienThoai
     */
    public void setSoDienThoai(java.lang.String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }


    /**
     * Gets the maLopHoc value for this PhuHuynh.
     * 
     * @return maLopHoc
     */
    public java.lang.String getMaLopHoc() {
        return maLopHoc;
    }


    /**
     * Sets the maLopHoc value for this PhuHuynh.
     * 
     * @param maLopHoc
     */
    public void setMaLopHoc(java.lang.String maLopHoc) {
        this.maLopHoc = maLopHoc;
    }


    /**
     * Gets the tenLopHoc value for this PhuHuynh.
     * 
     * @return tenLopHoc
     */
    public java.lang.String getTenLopHoc() {
        return tenLopHoc;
    }


    /**
     * Sets the tenLopHoc value for this PhuHuynh.
     * 
     * @param tenLopHoc
     */
    public void setTenLopHoc(java.lang.String tenLopHoc) {
        this.tenLopHoc = tenLopHoc;
    }


    /**
     * Gets the siSo value for this PhuHuynh.
     * 
     * @return siSo
     */
    public int getSiSo() {
        return siSo;
    }


    /**
     * Sets the siSo value for this PhuHuynh.
     * 
     * @param siSo
     */
    public void setSiSo(int siSo) {
        this.siSo = siSo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PhuHuynh)) return false;
        PhuHuynh other = (PhuHuynh) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.maPhuHuynh==null && other.getMaPhuHuynh()==null) || 
             (this.maPhuHuynh!=null &&
              this.maPhuHuynh.equals(other.getMaPhuHuynh()))) &&
            ((this.tenPhuHuynh==null && other.getTenPhuHuynh()==null) || 
             (this.tenPhuHuynh!=null &&
              this.tenPhuHuynh.equals(other.getTenPhuHuynh()))) &&
            ((this.maHocSinh==null && other.getMaHocSinh()==null) || 
             (this.maHocSinh!=null &&
              this.maHocSinh.equals(other.getMaHocSinh()))) &&
            ((this.tenHocSinh==null && other.getTenHocSinh()==null) || 
             (this.tenHocSinh!=null &&
              this.tenHocSinh.equals(other.getTenHocSinh()))) &&
            ((this.soDienThoai==null && other.getSoDienThoai()==null) || 
             (this.soDienThoai!=null &&
              this.soDienThoai.equals(other.getSoDienThoai()))) &&
            ((this.maLopHoc==null && other.getMaLopHoc()==null) || 
             (this.maLopHoc!=null &&
              this.maLopHoc.equals(other.getMaLopHoc()))) &&
            ((this.tenLopHoc==null && other.getTenLopHoc()==null) || 
             (this.tenLopHoc!=null &&
              this.tenLopHoc.equals(other.getTenLopHoc()))) &&
            this.siSo == other.getSiSo();
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
        if (getMaPhuHuynh() != null) {
            _hashCode += getMaPhuHuynh().hashCode();
        }
        if (getTenPhuHuynh() != null) {
            _hashCode += getTenPhuHuynh().hashCode();
        }
        if (getMaHocSinh() != null) {
            _hashCode += getMaHocSinh().hashCode();
        }
        if (getTenHocSinh() != null) {
            _hashCode += getTenHocSinh().hashCode();
        }
        if (getSoDienThoai() != null) {
            _hashCode += getSoDienThoai().hashCode();
        }
        if (getMaLopHoc() != null) {
            _hashCode += getMaLopHoc().hashCode();
        }
        if (getTenLopHoc() != null) {
            _hashCode += getTenLopHoc().hashCode();
        }
        _hashCode += getSiSo();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PhuHuynh.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "PhuHuynh"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maPhuHuynh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MaPhuHuynh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenPhuHuynh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TenPhuHuynh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maHocSinh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MaHocSinh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenHocSinh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TenHocSinh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soDienThoai");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SoDienThoai"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maLopHoc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MaLopHoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenLopHoc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TenLopHoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siSo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SiSo"));
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
