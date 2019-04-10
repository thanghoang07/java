/**
 * HocKy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class HocKy  implements java.io.Serializable {
    private java.lang.String maHocKy;

    private java.lang.String maNienKhoa;

    private java.lang.String tenNienKhoa;

    private java.lang.String tenHocKy;

    public HocKy() {
    }

    public HocKy(
           java.lang.String maHocKy,
           java.lang.String maNienKhoa,
           java.lang.String tenNienKhoa,
           java.lang.String tenHocKy) {
           this.maHocKy = maHocKy;
           this.maNienKhoa = maNienKhoa;
           this.tenNienKhoa = tenNienKhoa;
           this.tenHocKy = tenHocKy;
    }


    /**
     * Gets the maHocKy value for this HocKy.
     * 
     * @return maHocKy
     */
    public java.lang.String getMaHocKy() {
        return maHocKy;
    }


    /**
     * Sets the maHocKy value for this HocKy.
     * 
     * @param maHocKy
     */
    public void setMaHocKy(java.lang.String maHocKy) {
        this.maHocKy = maHocKy;
    }


    /**
     * Gets the maNienKhoa value for this HocKy.
     * 
     * @return maNienKhoa
     */
    public java.lang.String getMaNienKhoa() {
        return maNienKhoa;
    }


    /**
     * Sets the maNienKhoa value for this HocKy.
     * 
     * @param maNienKhoa
     */
    public void setMaNienKhoa(java.lang.String maNienKhoa) {
        this.maNienKhoa = maNienKhoa;
    }


    /**
     * Gets the tenNienKhoa value for this HocKy.
     * 
     * @return tenNienKhoa
     */
    public java.lang.String getTenNienKhoa() {
        return tenNienKhoa;
    }


    /**
     * Sets the tenNienKhoa value for this HocKy.
     * 
     * @param tenNienKhoa
     */
    public void setTenNienKhoa(java.lang.String tenNienKhoa) {
        this.tenNienKhoa = tenNienKhoa;
    }


    /**
     * Gets the tenHocKy value for this HocKy.
     * 
     * @return tenHocKy
     */
    public java.lang.String getTenHocKy() {
        return tenHocKy;
    }


    /**
     * Sets the tenHocKy value for this HocKy.
     * 
     * @param tenHocKy
     */
    public void setTenHocKy(java.lang.String tenHocKy) {
        this.tenHocKy = tenHocKy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HocKy)) return false;
        HocKy other = (HocKy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.maHocKy==null && other.getMaHocKy()==null) || 
             (this.maHocKy!=null &&
              this.maHocKy.equals(other.getMaHocKy()))) &&
            ((this.maNienKhoa==null && other.getMaNienKhoa()==null) || 
             (this.maNienKhoa!=null &&
              this.maNienKhoa.equals(other.getMaNienKhoa()))) &&
            ((this.tenNienKhoa==null && other.getTenNienKhoa()==null) || 
             (this.tenNienKhoa!=null &&
              this.tenNienKhoa.equals(other.getTenNienKhoa()))) &&
            ((this.tenHocKy==null && other.getTenHocKy()==null) || 
             (this.tenHocKy!=null &&
              this.tenHocKy.equals(other.getTenHocKy())));
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
        if (getMaHocKy() != null) {
            _hashCode += getMaHocKy().hashCode();
        }
        if (getMaNienKhoa() != null) {
            _hashCode += getMaNienKhoa().hashCode();
        }
        if (getTenNienKhoa() != null) {
            _hashCode += getTenNienKhoa().hashCode();
        }
        if (getTenHocKy() != null) {
            _hashCode += getTenHocKy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HocKy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "HocKy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maHocKy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MaHocKy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenHocKy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TenHocKy"));
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
