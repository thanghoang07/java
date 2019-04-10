package org.tempuri;

public class StudentManagerWebServiceSoapProxy implements org.tempuri.StudentManagerWebServiceSoap {
  private String _endpoint = null;
  private org.tempuri.StudentManagerWebServiceSoap studentManagerWebServiceSoap = null;
  
  public StudentManagerWebServiceSoapProxy() {
    _initStudentManagerWebServiceSoapProxy();
  }
  
  public StudentManagerWebServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initStudentManagerWebServiceSoapProxy();
  }
  
  private void _initStudentManagerWebServiceSoapProxy() {
    try {
      studentManagerWebServiceSoap = (new org.tempuri.StudentManagerWebServiceLocator()).getStudentManagerWebServiceSoap();
      if (studentManagerWebServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)studentManagerWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)studentManagerWebServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (studentManagerWebServiceSoap != null)
      ((javax.xml.rpc.Stub)studentManagerWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.StudentManagerWebServiceSoap getStudentManagerWebServiceSoap() {
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap;
  }
  
  public org.tempuri.TruongHoc[] getListTruongHoc() throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getListTruongHoc();
  }
  
  public org.tempuri.TruongHoc[] getListKhoangTruongHoc(java.lang.String maTruongHoc1, java.lang.String maTruongHoc2) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getListKhoangTruongHoc(maTruongHoc1, maTruongHoc2);
  }
  
  public org.tempuri.TruongHoc getTruongHoc(java.lang.String maTruongHoc) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getTruongHoc(maTruongHoc);
  }
  
  public boolean checkIdTruongHoc(java.lang.String maTruongHoc) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.checkIdTruongHoc(maTruongHoc);
  }
  
  public org.tempuri.KhoiLop[] getAllListKhoiLop() throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getAllListKhoiLop();
  }
  
  public org.tempuri.KhoiLop[] getAllListKhoiLop2() throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getAllListKhoiLop2();
  }
  
  public org.tempuri.KhoiLop[] getListKhoiLopTheoTruong(java.lang.String maTruong) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getListKhoiLopTheoTruong(maTruong);
  }
  
  public org.tempuri.KhoiLop[] getListKhoiLopTheoTruong2(java.lang.String maTruong) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getListKhoiLopTheoTruong2(maTruong);
  }
  
  public org.tempuri.KhoiLop getKhoiLop(java.lang.String maKhoiLop) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getKhoiLop(maKhoiLop);
  }
  
  public org.tempuri.NienKhoa[] getListNienKhoa() throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getListNienKhoa();
  }
  
  public org.tempuri.HocKy getOneHocKy(java.lang.String maNienKhoa, java.lang.String maHocKy) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getOneHocKy(maNienKhoa, maHocKy);
  }
  
  public org.tempuri.MonHoc[] getListMonHoc() throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getListMonHoc();
  }
  
  public org.tempuri.MonHoc getMonHoc(java.lang.String maMonHoc) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getMonHoc(maMonHoc);
  }
  
  public org.tempuri.GiaoVien[] getListGiaoVien() throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getListGiaoVien();
  }
  
  public org.tempuri.GiaoVien getOneGiaoVien(java.lang.String maGiaoVien) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getOneGiaoVien(maGiaoVien);
  }
  
  public org.tempuri.GiaoVien[] getListGiaoVienTheoTruong(java.lang.String maTruong) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getListGiaoVienTheoTruong(maTruong);
  }
  
  public org.tempuri.HocSinh[] getAllListHocSinh() throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getAllListHocSinh();
  }
  
  public int getAllCountHocSinh() throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getAllCountHocSinh();
  }
  
  public org.tempuri.HocSinh[] getListHocSinhTheoTruongVaLop(java.lang.String maTruong, java.lang.String maLopHoc) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getListHocSinhTheoTruongVaLop(maTruong, maLopHoc);
  }
  
  public org.tempuri.HocSinh getOneHocSinh(java.lang.String maHocSinh) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getOneHocSinh(maHocSinh);
  }
  
  public boolean checkIdHocSinh(java.lang.String maHocSinh) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.checkIdHocSinh(maHocSinh);
  }
  
  public org.tempuri.TietHoc[] getListTietHoc(java.lang.String maTruong, java.lang.String maNienKhoa, java.lang.String maLopHoc) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getListTietHoc(maTruong, maNienKhoa, maLopHoc);
  }
  
  public org.tempuri.BuoiHoc[] getListBuoiHoc() throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getListBuoiHoc();
  }
  
  public org.tempuri.NgayHoc[] getListNgayHoc() throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getListNgayHoc();
  }
  
  public org.tempuri.LoaiThoiKhoaBieu[] getListLoaiThoiKhoaBieu() throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getListLoaiThoiKhoaBieu();
  }
  
  public org.tempuri.ThoiKhoaBieu getTietHoc(java.lang.String maTruong, java.lang.String maLopHoc, int maLoaiTKB, java.lang.String maBuoiHoc, java.lang.String maTietHoc) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getTietHoc(maTruong, maLopHoc, maLoaiTKB, maBuoiHoc, maTietHoc);
  }
  
  public org.tempuri.ThoiKhoaBieu[] getListTietHocTheoNgay(java.lang.String maLopHoc, java.lang.String maNgayHoc) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getListTietHocTheoNgay(maLopHoc, maNgayHoc);
  }
  
  public org.tempuri.DanhSachMonHoc[] getListMonHocHocSinh(java.lang.String maTruong, java.lang.String maLop, java.lang.String maHocSinh) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getListMonHocHocSinh(maTruong, maLop, maHocSinh);
  }
  
  public org.tempuri.LoaiHinhKiemTra[] getListLoaiHinhKiemTra() throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getListLoaiHinhKiemTra();
  }
  
  public org.tempuri.HocPhi getHocPhiMotMonHocSinh(java.lang.String maHocSinh, java.lang.String maMonHoc) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getHocPhiMotMonHocSinh(maHocSinh, maMonHoc);
  }
  
  public org.tempuri.HocPhi[] getListHocPhiMon(java.lang.String maHocSinh) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getListHocPhiMon(maHocSinh);
  }
  
  public float getTongHocPhi1(java.lang.String maHocSinh) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getTongHocPhi1(maHocSinh);
  }
  
  public org.tempuri.DiemSo[] getListDiemSoHocSinh(java.lang.String maHocSinh) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getListDiemSoHocSinh(maHocSinh);
  }
  
  public org.tempuri.DiemSo[] getDiemMonHocSinh(java.lang.String maMonHoc, java.lang.String maHocSinh) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getDiemMonHocSinh(maMonHoc, maHocSinh);
  }
  
  public org.tempuri.DiemSo getDiemMonHocSinhTheoLoai(java.lang.String maMonHoc, java.lang.String maLoai, java.lang.String maHocSinh) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getDiemMonHocSinhTheoLoai(maMonHoc, maLoai, maHocSinh);
  }
  
  public org.tempuri.PhuHuynh getOnePhuHuynh(java.lang.String maPhuHuynh, java.lang.String maLopHoc, java.lang.String maHocSinh) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getOnePhuHuynh(maPhuHuynh, maLopHoc, maHocSinh);
  }
  
  public org.tempuri.PhuHuynh[] getListPhuHuynhLop(java.lang.String maLopHoc) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getListPhuHuynhLop(maLopHoc);
  }
  
  public org.tempuri.PhuHuynh getPhuHuynhTheoMa(java.lang.String maPhuHuynh) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getPhuHuynhTheoMa(maPhuHuynh);
  }
  
  public org.tempuri.LichThi[] getListLichThiLop(java.lang.String maNienKhoa, java.lang.String maHocKy, java.lang.String maLopKiemTra) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getListLichThiLop(maNienKhoa, maHocKy, maLopKiemTra);
  }
  
  public org.tempuri.LichThi getLichThiTheoMon(java.lang.String maNienKhoa, java.lang.String maHocKy, java.lang.String maLopKiemTra, java.lang.String maMonKiemTra) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getLichThiTheoMon(maNienKhoa, maHocKy, maLopKiemTra, maMonKiemTra);
  }
  
  public boolean isNumberic(java.lang.String soDienThoai) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.isNumberic(soDienThoai);
  }
  
  public boolean isEmail(java.lang.String email) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.isEmail(email);
  }
  
  public boolean isEmail2(java.lang.String mail, java.lang.String reMail) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.isEmail2(mail, reMail);
  }
  
  public boolean isLogin(java.lang.String mail, java.lang.String pass) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.isLogin(mail, pass);
  }
  
  public org.tempuri.Account accountLogin(java.lang.String mail, java.lang.String pass) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.accountLogin(mail, pass);
  }
  
  public org.tempuri.Account adminLogin(java.lang.String mail, java.lang.String pass) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.adminLogin(mail, pass);
  }
  
  public java.lang.String getPassAccount(java.lang.String mail) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.getPassAccount(mail);
  }
  
  public boolean isMailDatabase(java.lang.String mail) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    return studentManagerWebServiceSoap.isMailDatabase(mail);
  }
  
  public void sentMail(java.lang.String to, java.lang.String subject, java.lang.String message) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    studentManagerWebServiceSoap.sentMail(to, subject, message);
  }
  
  public void sentMailMissPass(java.lang.String to) throws java.rmi.RemoteException{
    if (studentManagerWebServiceSoap == null)
      _initStudentManagerWebServiceSoapProxy();
    studentManagerWebServiceSoap.sentMailMissPass(to);
  }
  
  
}