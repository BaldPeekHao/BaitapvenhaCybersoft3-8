package Baitap2OOP;
import java.util.*;

public class QuanTriListHocSinh {
    ArrayList<SinhVien> sinhVienArray = new ArrayList<>();

    public void addSinhVien(SinhVien sinhVien) {
        sinhVienArray.add(sinhVien);
    }

    public void displaySinhVien() {
        System.out.println("                                Danh sách sinh viên:");
        System.out.println("Tên                 Mã SV     Toán      Lý        Hóa       ĐTB        Xếp loại");
        System.out.println("----------------------------------------------------------------------");

        for (SinhVien sinhVien : sinhVienArray) {
            System.out.println(sinhVien);
        }
    }

    public void displaySinhVienCoDiemTBCaoNhat() {
        SinhVien caoNhat = Collections.max(sinhVienArray, Comparator.comparing(SinhVien::tinhDiemTrungBinh));
        System.out.println("                                Sinh viên có ĐTB cao nhất:");
        System.out.println("Tên                 Mã SV     Toán      Lý        Hóa       ĐTB        Xếp loại");
        System.out.println("----------------------------------------------------------------------");
        System.out.println(caoNhat);
    }

    public void displaySinhVienYeu() {
        System.out.println("                                Danh sách sinh viên loại Yếu:");
        System.out.println("Tên                 Mã SV     Toán      Lý        Hóa       ĐTB        Xếp loại");
        System.out.println("----------------------------------------------------------------------");
        for (SinhVien student : sinhVienArray) {
            if (student.tinhDiemTrungBinh() < 5) {
                System.out.println(student);
            }
        }
    }

    public void timTenSinhVien(String tenSinhVien) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập vào tên sinh viên bạn cần tìm: ");
        tenSinhVien = scanner.nextLine();
        System.out.println("                                Danh sách sinh viên có tên: " + tenSinhVien + ":");
        System.out.println("Tên                 Mã SV     Toán      Lý        Hóa       ĐTB        Xếp loại");
        System.out.println("----------------------------------------------------------------------");

        for (SinhVien sinhVien : sinhVienArray) {
            if (sinhVien.getTenSinhVien().equalsIgnoreCase(tenSinhVien)) {
                System.out.println(sinhVien);
            }
        }
    }

    public void timMaSinhVien(String maSinhVien) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập vào mã sinh viên bạn cần tìm: ");
        maSinhVien = scanner.nextLine();
        System.out.println("                                Danh sách sinh viên có mã: " + maSinhVien + ":");
        System.out.println("Tên                 Mã SV     Toán      Lý        Hóa       ĐTB        Xếp loại");
        System.out.println("----------------------------------------------------------------------");

        for (SinhVien sinhVien: sinhVienArray) {
            if (sinhVien.getTenSinhVien().equals(maSinhVien)) {
                System.out.println(sinhVien);
            }
        }
    }
}