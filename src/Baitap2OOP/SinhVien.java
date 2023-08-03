package Baitap2OOP;

import java.util.Scanner;

public class SinhVien {
    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    String tenSinhVien;
    String maSinhVien;
    float diemToan;
    float diemLy;
    float diemHoa;

    public SinhVien() {

    }

    @Override
    public String toString() {
        return
                "'" + tenSinhVien + '\'' +
                ", '" + maSinhVien + '\'' +
                ", " + diemToan + '\'' + '\'' +
                ", " + diemLy + '\'' + '\'' +
                ", " + diemHoa + '\'' +
                        ", " + tinhDiemTrungBinh() + '\''
                ;
    }

    public SinhVien(String tenSinhVien, String maSinhVien, float diemToan, float diemLy, float diemHoa) {
        this.tenSinhVien = tenSinhVien;
        this.maSinhVien = maSinhVien;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }
    public void hamNhap () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập vào tên của sinh viên: ");
        this.tenSinhVien = scanner.nextLine();
        System.out.println("Hãy nhâp vào mã của sinh viên: ");
        this.maSinhVien = scanner.nextLine();
        System.out.println("Hãy nhập vào điểm Toán của sinh viên: ");
        this.diemToan = scanner.nextFloat();
        System.out.println("Nhập vào điểm Lý của sinh viên: ");
        this.diemLy = scanner.nextFloat();
        System.out.println("Nhập vào điểm Hóa của sinh viên: ");
        this.diemHoa = scanner.nextFloat();
    }
    public void hamXuat () {
        System.out.println("Tên của sinh viên là: " + tenSinhVien);
        System.out.println("Mã số sinh viên là: " + maSinhVien);
        System.out.println("Điểm trung bình của sinh viên là: " + this.tinhDiemTrungBinh());
        System.out.print("Xếp loại sinh viên: ");
    }
    public float tinhDiemTrungBinh () {
        return (this.diemToan + this.diemLy + this.diemHoa) / 3;
    }
    public void xepLoai(){
        if (this.tinhDiemTrungBinh() > 9) {
            System.out.println("Xuất xắc");
        } else if ((this.tinhDiemTrungBinh() <= 9) && (this.tinhDiemTrungBinh() >= 8)) {
            System.out.println("Giỏi");
        } else if ((this.tinhDiemTrungBinh() < 8) && (this.tinhDiemTrungBinh() >= 7)) {
            System.out.println("Khá");
        } else if ((this.tinhDiemTrungBinh() < 7) && (this.tinhDiemTrungBinh() >= 6)) {
            System.out.println("Trung bình khá");
        } else if ((this.tinhDiemTrungBinh() < 6) && (this.tinhDiemTrungBinh() >= 5)) {
            System.out.println("Trung bình");
        } else {
            System.out.println("Yếu");
        }
    }
}
