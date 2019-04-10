/**
 * NgayHoc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class NgayHoc  implements java.io.Serializable {
    private java.lang.String maNgayHoc;

    private java.lang.String tenNgayHoc;

    private java.util.Calendar ngay;

    private java.lang.String maBuoiHoc1;

    private java.lang.String maBuoiHoc2;

    private java.lang.String maBuoiHoc3;

    public NgayHoc() {
    }

    public NgayHoc(
           java.lang.String maNgayHoc,
           java.lang.String tenNgayHoc,
           java.util.Calendar ngay,
           java.lang.String maBuoiHoc1,
           java.lang.String maBuoiHoc2,
           java.lang.String maBuoiHoc3) {
           this.maNgayHoc = maNgayHoc;
           this.tenNgayHoc = tenNgayHoc;
           this.ngay = ngay;
           this.maBuoiHoc1 = maBuoiHoc1;
           this.maBuoiHoc2 = maBuoiHoc2;
           this.maBuoiHoc3 = maBuoiHoc3;
    }


    /**
     * Gets the maNgayHoc value for this NgayHoc.
     * 
     * @return maNgayHoc
     */
    public java.lang.String getMaNgayHoc() {
        return maNgayHoc;
    }


    /**
     * Sets the maNgayHoc value for this NgayHoc.
     * 
     * @param maNgayHoc
     */
    public void setMaNgayHoc(java.lang.String maNgayHoc) {
        this.maNgayHoc = maNgayHoc;
    }


    /**
     * Gets the tenNgayHoc value for this NgayHoc.
     * 
     * @return tenNgayHoc
     */
    public java.lang.String getTenNgayHoc() {
        return tenNgayHoc;
    }


    /**
     * Sets the tenNgayHoc value for this NgayHoc.
     * 
     * @param tenNgayHoc
     */
    public void setTenNgayHoc(java.lang.String tenNgayHoc) {
        this.tenNgayHoc = tenNgayHoc;
    }


    /**
     * Gets the ngay value for this NgayHoc.
     * 
     * @return ngay
     */
    public java.util.Calendar getNgay() {
        return ngay;
    }


    /**
     * Sets the ngay value for this NgayHoc.
     * 
     * @param ngay
     */
    public void setNgay(java.util.Calendar ngay) {
        this.ngay = ngay;
    }


    /**
     * Gets the maBuoiHoc1 value for this NgayHoc.
     * 
     * @return maBuoiHoc1
     */
    public java.lang.String getMaBuoiHoc1() {
        return maBuoiHoc1;
    }


    /**
     * Sets the maBuoiHoc1 value for this NgayHoc.
     * 
     * @param maBuoiHoc1
     */
    public void setMaBuoiHoc1(java.lang.String maBuoiHoc1) {
        this.maBuoiHoc1 = maBuoiHoc1;
    }


    /**
     * Gets the maBuoiHoc2 value for this NgayHoc.
     * 
     * @return maBuoiHoc2
     */
    public java.lang.String getMaBuoiHoc2() {
        return maBuoiHoc2;
    }


    /**
     * Sets the maBuoiHoc2 value for this NgayHoc.
     * 
     * @param maBuoiHoc2
     */
    public void setMaBuoiHoc2(java.lang.String maBuoiHoc2) {
        this.maBuoiHoc2 = maBuoiHoc2;
    }


    /**
     * Gets the maBuoiHoc3 value for this NgayHoc.
     * 
     * @return maBuoiHoc3
     */
    public java.lang.String getMaBuoiHoc3() {
        return maBuoiHoc3;
    }


    /**
     * Sets the maBuoiHoc3 value for this NgayHoc.
     * 
     * @param maBuoiHoc3
     */
    public void setMaBuoiHoc3(java.lang.String maBuoiHoc3) {
        this.maBuoiHoc3 = maBuoiHoc3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NgayHoc)) return false;
        NgayHoc other = (NgayHoc) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.maNgayHoc==null && other.getMaNgayHoc()==null) || 
             (this.maNgayHoc!=null &&
              this.maNgayHoc.equals(other.getMaNgayHoc()))) &&
            ((this.tenNgayHoc==null && other.getTenNgayHoc()==null) || 
             (this.tenNgayHoc!=null &&
              this.tenNgayHoc.equals(other.getTenNgayHoc()))) &&
            ((this.ngay==null && other.getNgay()==null) || 
             (this.ngay!=null &&
              this.ngay.equals(other.getNgay()))) &&
            ((this.maBuoiHoc1==null && other.getMaBuoiHoc1()==null) || 
             (this.maBuoiHoc1!=null &&
              this.maBuoiHoc1.equals(other.getMaBuoiHoc1()))) &&
            ((this.maBuoiHoc2==null && other.getMaBuoiHoc2()==null) || 
             (this.maBuoiHoc2!=null &&
              this.maBuoiHoc2.equals(other.getMaBuoiHoc2()))) &&
            ((this.maBuoiHoc3==null && other.getMaBuoiHoc3()==null) || 
             (this.maBuoiHoc3!=null &&
              this.maBuoiHoc3.equals(other.getMaBuoiHoc3())));
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
        if (getMaNgayHoc() != null) {
            _hashCode += getMaNgayHoc().hashCode();
        }
        if (getTenNgayHoc() != null) {
            _hashCode += getTenNgayHoc().hashCode();
        }
        if (getNgay() != null) {
            _hashCode += getNgay().hashCode();
        }
        if (getMaBuoiHoc1() != null) {
            _hashCode += getMaBuoiHoc1().hashCode();
        }
        if (getMaBuoiHoc2() != null) {
            _hashCode += getMaBuoiHoc2().hashCode();
        }
        if (getMaBuoiHoc3() != null) {
            _hashCode += getMaBuoiHoc3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NgayHoc.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "NgayHoc"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maNgayHoc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MaNgayHoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenNgayHoc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TenNgayHoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ngay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Ngay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maBuoiHoc1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MaBuoiHoc1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maBuoiHoc2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MaBuoiHoc2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maBuoiHoc3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MaBuoiHoc3"));
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
