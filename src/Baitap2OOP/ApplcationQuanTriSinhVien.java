package Baitap2OOP;

public class ApplcationQuanTriSinhVien {
    public static void main(String[] args) {
        SinhVien sinhVien = new SinhVien();
        sinhVien.hamNhap();
        sinhVien.hamXuat();
        sinhVien.tinhDiemTrungBinh();
        sinhVien.xepLoai();
        sinhVien.toString();
        SinhVien sinhVien1 = new SinhVien();
        sinhVien1.hamNhap();
        sinhVien1.hamXuat();
        sinhVien1.tinhDiemTrungBinh();
        sinhVien1.xepLoai();
        sinhVien1.toString();
        QuanTriListHocSinh quanTriListHocSinh = new QuanTriListHocSinh();
        quanTriListHocSinh.addSinhVien(sinhVien);
        quanTriListHocSinh.addSinhVien(sinhVien1);
        quanTriListHocSinh.displaySinhVien();
        quanTriListHocSinh.displaySinhVienCoDiemTBCaoNhat();
        quanTriListHocSinh.displaySinhVienYeu();
        quanTriListHocSinh.timTenSinhVien(sinhVien.tenSinhVien);
        quanTriListHocSinh.timMaSinhVien(sinhVien.maSinhVien);
    }
}
