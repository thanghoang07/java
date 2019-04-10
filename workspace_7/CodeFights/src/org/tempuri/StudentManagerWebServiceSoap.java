/**
 * StudentManagerWebServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface StudentManagerWebServiceSoap extends java.rmi.Remote {
    public org.tempuri.TruongHoc[] getListTruongHoc() throws java.rmi.RemoteException;
    public org.tempuri.TruongHoc[] getListKhoangTruongHoc(java.lang.String maTruongHoc1, java.lang.String maTruongHoc2) throws java.rmi.RemoteException;
    public org.tempuri.TruongHoc getTruongHoc(java.lang.String maTruongHoc) throws java.rmi.RemoteException;
    public boolean checkIdTruongHoc(java.lang.String maTruongHoc) throws java.rmi.RemoteException;
    public org.tempuri.KhoiLop[] getAllListKhoiLop() throws java.rmi.RemoteException;
    public org.tempuri.KhoiLop[] getAllListKhoiLop2() throws java.rmi.RemoteException;
    public org.tempuri.KhoiLop[] getListKhoiLopTheoTruong(java.lang.String maTruong) throws java.rmi.RemoteException;
    public org.tempuri.KhoiLop[] getListKhoiLopTheoTruong2(java.lang.String maTruong) throws java.rmi.RemoteException;
    public org.tempuri.KhoiLop getKhoiLop(java.lang.String maKhoiLop) throws java.rmi.RemoteException;
    public org.tempuri.NienKhoa[] getListNienKhoa() throws java.rmi.RemoteException;
    public org.tempuri.HocKy getOneHocKy(java.lang.String maNienKhoa, java.lang.String maHocKy) throws java.rmi.RemoteException;
    public org.tempuri.MonHoc[] getListMonHoc() throws java.rmi.RemoteException;
    public org.tempuri.MonHoc getMonHoc(java.lang.String maMonHoc) throws java.rmi.RemoteException;
    public org.tempuri.GiaoVien[] getListGiaoVien() throws java.rmi.RemoteException;
    public org.tempuri.GiaoVien getOneGiaoVien(java.lang.String maGiaoVien) throws java.rmi.RemoteException;
    public org.tempuri.GiaoVien[] getListGiaoVienTheoTruong(java.lang.String maTruong) throws java.rmi.RemoteException;
    public org.tempuri.HocSinh[] getAllListHocSinh() throws java.rmi.RemoteException;
    public int getAllCountHocSinh() throws java.rmi.RemoteException;
    public org.tempuri.HocSinh[] getListHocSinhTheoTruongVaLop(java.lang.String maTruong, java.lang.String maLopHoc) throws java.rmi.RemoteException;
    public org.tempuri.HocSinh getOneHocSinh(java.lang.String maHocSinh) throws java.rmi.RemoteException;
    public boolean checkIdHocSinh(java.lang.String maHocSinh) throws java.rmi.RemoteException;
    public org.tempuri.TietHoc[] getListTietHoc(java.lang.String maTruong, java.lang.String maNienKhoa, java.lang.String maLopHoc) throws java.rmi.RemoteException;
    public org.tempuri.BuoiHoc[] getListBuoiHoc() throws java.rmi.RemoteException;
    public org.tempuri.NgayHoc[] getListNgayHoc() throws java.rmi.RemoteException;
    public org.tempuri.LoaiThoiKhoaBieu[] getListLoaiThoiKhoaBieu() throws java.rmi.RemoteException;
    public org.tempuri.ThoiKhoaBieu getTietHoc(java.lang.String maTruong, java.lang.String maLopHoc, int maLoaiTKB, java.lang.String maBuoiHoc, java.lang.String maTietHoc) throws java.rmi.RemoteException;
    public org.tempuri.ThoiKhoaBieu[] getListTietHocTheoNgay(java.lang.String maLopHoc, java.lang.String maNgayHoc) throws java.rmi.RemoteException;
    public org.tempuri.DanhSachMonHoc[] getListMonHocHocSinh(java.lang.String maTruong, java.lang.String maLop, java.lang.String maHocSinh) throws java.rmi.RemoteException;
    public org.tempuri.LoaiHinhKiemTra[] getListLoaiHinhKiemTra() throws java.rmi.RemoteException;
    public org.tempuri.HocPhi getHocPhiMotMonHocSinh(java.lang.String maHocSinh, java.lang.String maMonHoc) throws java.rmi.RemoteException;
    public org.tempuri.HocPhi[] getListHocPhiMon(java.lang.String maHocSinh) throws java.rmi.RemoteException;
    public float getTongHocPhi1(java.lang.String maHocSinh) throws java.rmi.RemoteException;
    public org.tempuri.DiemSo[] getListDiemSoHocSinh(java.lang.String maHocSinh) throws java.rmi.RemoteException;
    public org.tempuri.DiemSo[] getDiemMonHocSinh(java.lang.String maMonHoc, java.lang.String maHocSinh) throws java.rmi.RemoteException;
    public org.tempuri.DiemSo getDiemMonHocSinhTheoLoai(java.lang.String maMonHoc, java.lang.String maLoai, java.lang.String maHocSinh) throws java.rmi.RemoteException;
    public org.tempuri.PhuHuynh getOnePhuHuynh(java.lang.String maPhuHuynh, java.lang.String maLopHoc, java.lang.String maHocSinh) throws java.rmi.RemoteException;
    public org.tempuri.PhuHuynh[] getListPhuHuynhLop(java.lang.String maLopHoc) throws java.rmi.RemoteException;
    public org.tempuri.PhuHuynh getPhuHuynhTheoMa(java.lang.String maPhuHuynh) throws java.rmi.RemoteException;
    public org.tempuri.LichThi[] getListLichThiLop(java.lang.String maNienKhoa, java.lang.String maHocKy, java.lang.String maLopKiemTra) throws java.rmi.RemoteException;
    public org.tempuri.LichThi getLichThiTheoMon(java.lang.String maNienKhoa, java.lang.String maHocKy, java.lang.String maLopKiemTra, java.lang.String maMonKiemTra) throws java.rmi.RemoteException;
    public boolean isNumberic(java.lang.String soDienThoai) throws java.rmi.RemoteException;
    public boolean isEmail(java.lang.String email) throws java.rmi.RemoteException;
    public boolean isEmail2(java.lang.String mail, java.lang.String reMail) throws java.rmi.RemoteException;
    public boolean isLogin(java.lang.String mail, java.lang.String pass) throws java.rmi.RemoteException;
    public org.tempuri.Account accountLogin(java.lang.String mail, java.lang.String pass) throws java.rmi.RemoteException;
    public org.tempuri.Account adminLogin(java.lang.String mail, java.lang.String pass) throws java.rmi.RemoteException;
    public java.lang.String getPassAccount(java.lang.String mail) throws java.rmi.RemoteException;
    public boolean isMailDatabase(java.lang.String mail) throws java.rmi.RemoteException;
    public void sentMail(java.lang.String to, java.lang.String subject, java.lang.String message) throws java.rmi.RemoteException;
    public void sentMailMissPass(java.lang.String to) throws java.rmi.RemoteException;
}
