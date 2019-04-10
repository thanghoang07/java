/**
 * MonHoc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class MonHoc  implements java.io.Serializable {
    private java.lang.String maMonHoc;

    private java.lang.String tenMonHoc;

    private int hocPhi;

    public MonHoc() {
    }

    public MonHoc(
           java.lang.String maMonHoc,
           java.lang.String tenMonHoc,
           int hocPhi) {
           this.maMonHoc = maMonHoc;
           this.tenMonHoc = tenMonHoc;
           this.hocPhi = hocPhi;
    }


    /**
     * Gets the maMonHoc value for this MonHoc.
     * 
     * @return maMonHoc
     */
    public java.lang.String getMaMonHoc() {
        return maMonHoc;
    }


    /**
     * Sets the maMonHoc value for this MonHoc.
     * 
     * @param maMonHoc
     */
    public void setMaMonHoc(java.lang.String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }


    /**
     * Gets the tenMonHoc value for this MonHoc.
     * 
     * @return tenMonHoc
     */
    public java.lang.String getTenMonHoc() {
        return tenMonHoc;
    }


    /**
     * Sets the tenMonHoc value for this MonHoc.
     * 
     * @param tenMonHoc
     */
    public void setTenMonHoc(java.lang.String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }


    /**
     * Gets the hocPhi value for this MonHoc.
     * 
     * @return hocPhi
     */
    public int getHocPhi() {
        return hocPhi;
    }


    /**
     * Sets the hocPhi value for this MonHoc.
     * 
     * @param hocPhi
     */
    public void setHocPhi(int hocPhi) {
        this.hocPhi = hocPhi;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MonHoc)) return false;
        MonHoc other = (MonHoc) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.maMonHoc==null && other.getMaMonHoc()==null) || 
             (this.maMonHoc!=null &&
              this.maMonHoc.equals(other.getMaMonHoc()))) &&
            ((this.tenMonHoc==null && other.getTenMonHoc()==null) || 
             (this.tenMonHoc!=null &&
              this.tenMonHoc.equals(other.getTenMonHoc()))) &&
            this.hocPhi == other.getHocPhi();
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
        if (getMaMonHoc() != null) {
            _hashCode += getMaMonHoc().hashCode();
        }
        if (getTenMonHoc() != null) {
            _hashCode += getTenMonHoc().hashCode();
        }
        _hashCode += getHocPhi();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MonHoc.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "MonHoc"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maMonHoc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MaMonHoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenMonHoc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TenMonHoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hocPhi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "HocPhi"));
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
