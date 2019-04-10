/**
 * Person.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public abstract class Person  implements java.io.Serializable {
    private java.lang.String maTruong;

    private java.lang.String tenTruong;

    private java.lang.String mail;

    private java.lang.String pass;

    private java.util.Calendar ngaySinh;

    private java.lang.String gioiTinh;

    private java.lang.String diaChi;

    public Person() {
    }

    public Person(
           java.lang.String maTruong,
           java.lang.String tenTruong,
           java.lang.String mail,
           java.lang.String pass,
           java.util.Calendar ngaySinh,
           java.lang.String gioiTinh,
           java.lang.String diaChi) {
           this.maTruong = maTruong;
           this.tenTruong = tenTruong;
           this.mail = mail;
           this.pass = pass;
           this.ngaySinh = ngaySinh;
           this.gioiTinh = gioiTinh;
           this.diaChi = diaChi;
    }


    /**
     * Gets the maTruong value for this Person.
     * 
     * @return maTruong
     */
    public java.lang.String getMaTruong() {
        return maTruong;
    }


    /**
     * Sets the maTruong value for this Person.
     * 
     * @param maTruong
     */
    public void setMaTruong(java.lang.String maTruong) {
        this.maTruong = maTruong;
    }


    /**
     * Gets the tenTruong value for this Person.
     * 
     * @return tenTruong
     */
    public java.lang.String getTenTruong() {
        return tenTruong;
    }


    /**
     * Sets the tenTruong value for this Person.
     * 
     * @param tenTruong
     */
    public void setTenTruong(java.lang.String tenTruong) {
        this.tenTruong = tenTruong;
    }


    /**
     * Gets the mail value for this Person.
     * 
     * @return mail
     */
    public java.lang.String getMail() {
        return mail;
    }


    /**
     * Sets the mail value for this Person.
     * 
     * @param mail
     */
    public void setMail(java.lang.String mail) {
        this.mail = mail;
    }


    /**
     * Gets the pass value for this Person.
     * 
     * @return pass
     */
    public java.lang.String getPass() {
        return pass;
    }


    /**
     * Sets the pass value for this Person.
     * 
     * @param pass
     */
    public void setPass(java.lang.String pass) {
        this.pass = pass;
    }


    /**
     * Gets the ngaySinh value for this Person.
     * 
     * @return ngaySinh
     */
    public java.util.Calendar getNgaySinh() {
        return ngaySinh;
    }


    /**
     * Sets the ngaySinh value for this Person.
     * 
     * @param ngaySinh
     */
    public void setNgaySinh(java.util.Calendar ngaySinh) {
        this.ngaySinh = ngaySinh;
    }


    /**
     * Gets the gioiTinh value for this Person.
     * 
     * @return gioiTinh
     */
    public java.lang.String getGioiTinh() {
        return gioiTinh;
    }


    /**
     * Sets the gioiTinh value for this Person.
     * 
     * @param gioiTinh
     */
    public void setGioiTinh(java.lang.String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }


    /**
     * Gets the diaChi value for this Person.
     * 
     * @return diaChi
     */
    public java.lang.String getDiaChi() {
        return diaChi;
    }


    /**
     * Sets the diaChi value for this Person.
     * 
     * @param diaChi
     */
    public void setDiaChi(java.lang.String diaChi) {
        this.diaChi = diaChi;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
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
            ((this.mail==null && other.getMail()==null) || 
             (this.mail!=null &&
              this.mail.equals(other.getMail()))) &&
            ((this.pass==null && other.getPass()==null) || 
             (this.pass!=null &&
              this.pass.equals(other.getPass()))) &&
            ((this.ngaySinh==null && other.getNgaySinh()==null) || 
             (this.ngaySinh!=null &&
              this.ngaySinh.equals(other.getNgaySinh()))) &&
            ((this.gioiTinh==null && other.getGioiTinh()==null) || 
             (this.gioiTinh!=null &&
              this.gioiTinh.equals(other.getGioiTinh()))) &&
            ((this.diaChi==null && other.getDiaChi()==null) || 
             (this.diaChi!=null &&
              this.diaChi.equals(other.getDiaChi())));
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
        if (getMail() != null) {
            _hashCode += getMail().hashCode();
        }
        if (getPass() != null) {
            _hashCode += getPass().hashCode();
        }
        if (getNgaySinh() != null) {
            _hashCode += getNgaySinh().hashCode();
        }
        if (getGioiTinh() != null) {
            _hashCode += getGioiTinh().hashCode();
        }
        if (getDiaChi() != null) {
            _hashCode += getDiaChi().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Person.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Person"));
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
        elemField.setFieldName("mail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Mail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Pass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ngaySinh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NgaySinh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gioiTinh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GioiTinh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diaChi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DiaChi"));
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
