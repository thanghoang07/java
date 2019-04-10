/**
 * Account.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Account  extends org.tempuri.Person  implements java.io.Serializable {
    private java.lang.String ID;

    private java.lang.String maHocSinh;

    private java.lang.String maLopHoc;

    private java.lang.String tenLopHoc;

    private int siSo;

    private java.lang.String maNienKhoa;

    private java.lang.String tenGiaoVienChuNhiem;

    private java.lang.String tenAcc;

    private java.lang.String diaChiAcc;

    private int soDienThoai;

    private java.lang.String diaChiTruong;

    private int namThanhLap;

    private java.lang.String maKhoiLop;

    private java.lang.String tenKhoiLop;

    public Account() {
    }

    public Account(
           java.lang.String maTruong,
           java.lang.String tenTruong,
           java.lang.String mail,
           java.lang.String pass,
           java.util.Calendar ngaySinh,
           java.lang.String gioiTinh,
           java.lang.String diaChi,
           java.lang.String ID,
           java.lang.String maHocSinh,
           java.lang.String maLopHoc,
           java.lang.String tenLopHoc,
           int siSo,
           java.lang.String maNienKhoa,
           java.lang.String tenGiaoVienChuNhiem,
           java.lang.String tenAcc,
           java.lang.String diaChiAcc,
           int soDienThoai,
           java.lang.String diaChiTruong,
           int namThanhLap,
           java.lang.String maKhoiLop,
           java.lang.String tenKhoiLop) {
        super(
            maTruong,
            tenTruong,
            mail,
            pass,
            ngaySinh,
            gioiTinh,
            diaChi);
        this.ID = ID;
        this.maHocSinh = maHocSinh;
        this.maLopHoc = maLopHoc;
        this.tenLopHoc = tenLopHoc;
        this.siSo = siSo;
        this.maNienKhoa = maNienKhoa;
        this.tenGiaoVienChuNhiem = tenGiaoVienChuNhiem;
        this.tenAcc = tenAcc;
        this.diaChiAcc = diaChiAcc;
        this.soDienThoai = soDienThoai;
        this.diaChiTruong = diaChiTruong;
        this.namThanhLap = namThanhLap;
        this.maKhoiLop = maKhoiLop;
        this.tenKhoiLop = tenKhoiLop;
    }


    /**
     * Gets the ID value for this Account.
     * 
     * @return ID
     */
    public java.lang.String getID() {
        return ID;
    }


    /**
     * Sets the ID value for this Account.
     * 
     * @param ID
     */
    public void setID(java.lang.String ID) {
        this.ID = ID;
    }


    /**
     * Gets the maHocSinh value for this Account.
     * 
     * @return maHocSinh
     */
    public java.lang.String getMaHocSinh() {
        return maHocSinh;
    }


    /**
     * Sets the maHocSinh value for this Account.
     * 
     * @param maHocSinh
     */
    public void setMaHocSinh(java.lang.String maHocSinh) {
        this.maHocSinh = maHocSinh;
    }


    /**
     * Gets the maLopHoc value for this Account.
     * 
     * @return maLopHoc
     */
    public java.lang.String getMaLopHoc() {
        return maLopHoc;
    }


    /**
     * Sets the maLopHoc value for this Account.
     * 
     * @param maLopHoc
     */
    public void setMaLopHoc(java.lang.String maLopHoc) {
        this.maLopHoc = maLopHoc;
    }


    /**
     * Gets the tenLopHoc value for this Account.
     * 
     * @return tenLopHoc
     */
    public java.lang.String getTenLopHoc() {
        return tenLopHoc;
    }


    /**
     * Sets the tenLopHoc value for this Account.
     * 
     * @param tenLopHoc
     */
    public void setTenLopHoc(java.lang.String tenLopHoc) {
        this.tenLopHoc = tenLopHoc;
    }


    /**
     * Gets the siSo value for this Account.
     * 
     * @return siSo
     */
    public int getSiSo() {
        return siSo;
    }


    /**
     * Sets the siSo value for this Account.
     * 
     * @param siSo
     */
    public void setSiSo(int siSo) {
        this.siSo = siSo;
    }


    /**
     * Gets the maNienKhoa value for this Account.
     * 
     * @return maNienKhoa
     */
    public java.lang.String getMaNienKhoa() {
        return maNienKhoa;
    }


    /**
     * Sets the maNienKhoa value for this Account.
     * 
     * @param maNienKhoa
     */
    public void setMaNienKhoa(java.lang.String maNienKhoa) {
        this.maNienKhoa = maNienKhoa;
    }


    /**
     * Gets the tenGiaoVienChuNhiem value for this Account.
     * 
     * @return tenGiaoVienChuNhiem
     */
    public java.lang.String getTenGiaoVienChuNhiem() {
        return tenGiaoVienChuNhiem;
    }


    /**
     * Sets the tenGiaoVienChuNhiem value for this Account.
     * 
     * @param tenGiaoVienChuNhiem
     */
    public void setTenGiaoVienChuNhiem(java.lang.String tenGiaoVienChuNhiem) {
        this.tenGiaoVienChuNhiem = tenGiaoVienChuNhiem;
    }


    /**
     * Gets the tenAcc value for this Account.
     * 
     * @return tenAcc
     */
    public java.lang.String getTenAcc() {
        return tenAcc;
    }


    /**
     * Sets the tenAcc value for this Account.
     * 
     * @param tenAcc
     */
    public void setTenAcc(java.lang.String tenAcc) {
        this.tenAcc = tenAcc;
    }


    /**
     * Gets the diaChiAcc value for this Account.
     * 
     * @return diaChiAcc
     */
    public java.lang.String getDiaChiAcc() {
        return diaChiAcc;
    }


    /**
     * Sets the diaChiAcc value for this Account.
     * 
     * @param diaChiAcc
     */
    public void setDiaChiAcc(java.lang.String diaChiAcc) {
        this.diaChiAcc = diaChiAcc;
    }


    /**
     * Gets the soDienThoai value for this Account.
     * 
     * @return soDienThoai
     */
    public int getSoDienThoai() {
        return soDienThoai;
    }


    /**
     * Sets the soDienThoai value for this Account.
     * 
     * @param soDienThoai
     */
    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }


    /**
     * Gets the diaChiTruong value for this Account.
     * 
     * @return diaChiTruong
     */
    public java.lang.String getDiaChiTruong() {
        return diaChiTruong;
    }


    /**
     * Sets the diaChiTruong value for this Account.
     * 
     * @param diaChiTruong
     */
    public void setDiaChiTruong(java.lang.String diaChiTruong) {
        this.diaChiTruong = diaChiTruong;
    }


    /**
     * Gets the namThanhLap value for this Account.
     * 
     * @return namThanhLap
     */
    public int getNamThanhLap() {
        return namThanhLap;
    }


    /**
     * Sets the namThanhLap value for this Account.
     * 
     * @param namThanhLap
     */
    public void setNamThanhLap(int namThanhLap) {
        this.namThanhLap = namThanhLap;
    }


    /**
     * Gets the maKhoiLop value for this Account.
     * 
     * @return maKhoiLop
     */
    public java.lang.String getMaKhoiLop() {
        return maKhoiLop;
    }


    /**
     * Sets the maKhoiLop value for this Account.
     * 
     * @param maKhoiLop
     */
    public void setMaKhoiLop(java.lang.String maKhoiLop) {
        this.maKhoiLop = maKhoiLop;
    }


    /**
     * Gets the tenKhoiLop value for this Account.
     * 
     * @return tenKhoiLop
     */
    public java.lang.String getTenKhoiLop() {
        return tenKhoiLop;
    }


    /**
     * Sets the tenKhoiLop value for this Account.
     * 
     * @param tenKhoiLop
     */
    public void setTenKhoiLop(java.lang.String tenKhoiLop) {
        this.tenKhoiLop = tenKhoiLop;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Account)) return false;
        Account other = (Account) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.maHocSinh==null && other.getMaHocSinh()==null) || 
             (this.maHocSinh!=null &&
              this.maHocSinh.equals(other.getMaHocSinh()))) &&
            ((this.maLopHoc==null && other.getMaLopHoc()==null) || 
             (this.maLopHoc!=null &&
              this.maLopHoc.equals(other.getMaLopHoc()))) &&
            ((this.tenLopHoc==null && other.getTenLopHoc()==null) || 
             (this.tenLopHoc!=null &&
              this.tenLopHoc.equals(other.getTenLopHoc()))) &&
            this.siSo == other.getSiSo() &&
            ((this.maNienKhoa==null && other.getMaNienKhoa()==null) || 
             (this.maNienKhoa!=null &&
              this.maNienKhoa.equals(other.getMaNienKhoa()))) &&
            ((this.tenGiaoVienChuNhiem==null && other.getTenGiaoVienChuNhiem()==null) || 
             (this.tenGiaoVienChuNhiem!=null &&
              this.tenGiaoVienChuNhiem.equals(other.getTenGiaoVienChuNhiem()))) &&
            ((this.tenAcc==null && other.getTenAcc()==null) || 
             (this.tenAcc!=null &&
              this.tenAcc.equals(other.getTenAcc()))) &&
            ((this.diaChiAcc==null && other.getDiaChiAcc()==null) || 
             (this.diaChiAcc!=null &&
              this.diaChiAcc.equals(other.getDiaChiAcc()))) &&
            this.soDienThoai == other.getSoDienThoai() &&
            ((this.diaChiTruong==null && other.getDiaChiTruong()==null) || 
             (this.diaChiTruong!=null &&
              this.diaChiTruong.equals(other.getDiaChiTruong()))) &&
            this.namThanhLap == other.getNamThanhLap() &&
            ((this.maKhoiLop==null && other.getMaKhoiLop()==null) || 
             (this.maKhoiLop!=null &&
              this.maKhoiLop.equals(other.getMaKhoiLop()))) &&
            ((this.tenKhoiLop==null && other.getTenKhoiLop()==null) || 
             (this.tenKhoiLop!=null &&
              this.tenKhoiLop.equals(other.getTenKhoiLop())));
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
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getMaHocSinh() != null) {
            _hashCode += getMaHocSinh().hashCode();
        }
        if (getMaLopHoc() != null) {
            _hashCode += getMaLopHoc().hashCode();
        }
        if (getTenLopHoc() != null) {
            _hashCode += getTenLopHoc().hashCode();
        }
        _hashCode += getSiSo();
        if (getMaNienKhoa() != null) {
            _hashCode += getMaNienKhoa().hashCode();
        }
        if (getTenGiaoVienChuNhiem() != null) {
            _hashCode += getTenGiaoVienChuNhiem().hashCode();
        }
        if (getTenAcc() != null) {
            _hashCode += getTenAcc().hashCode();
        }
        if (getDiaChiAcc() != null) {
            _hashCode += getDiaChiAcc().hashCode();
        }
        _hashCode += getSoDienThoai();
        if (getDiaChiTruong() != null) {
            _hashCode += getDiaChiTruong().hashCode();
        }
        _hashCode += getNamThanhLap();
        if (getMaKhoiLop() != null) {
            _hashCode += getMaKhoiLop().hashCode();
        }
        if (getTenKhoiLop() != null) {
            _hashCode += getTenKhoiLop().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Account.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Account"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ID"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maNienKhoa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MaNienKhoa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenGiaoVienChuNhiem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TenGiaoVienChuNhiem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenAcc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TenAcc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diaChiAcc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DiaChiAcc"));
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
        elemField.setFieldName("diaChiTruong");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DiaChiTruong"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maKhoiLop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MaKhoiLop"));
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
