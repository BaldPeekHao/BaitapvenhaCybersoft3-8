import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Baitap128 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hãy nhập vào tên sinh viên: ");
        String tenSinhVien = scanner.nextLine();

        System.out.println("Hãy nhập vào mã sinh viên: ");
        String maSinhVien = scanner.nextLine();

        System.out.println("Hãy nhập điểm Toán của sinh viên: ");
        float diemToan = scanner.nextFloat();

        System.out.println("Hãy nhập điểm Lý của sinh viên: ");
        float diemLy = scanner.nextFloat();

        System.out.println("Hãy nhập vào điểm Hóa của sinh viên: ");
        float diemHoa = scanner.nextFloat();

        float diemTrungBinh = tinhDiemTrungBinh(diemToan,diemLy,diemHoa);
        System.out.println("Điểm trung bình của sinh viên là: " + diemTrungBinh);
        xepLoai(diemTrungBinh);

    }
    public static float tinhDiemTrungBinh (float a, float b, float c){
        return (a+b+c) / 3;
    }
    public static void xepLoai (float d) {
        if (d > 9) {
            System.out.println("Xếp loại xuất xắc");
        } else if ((d<9) && (d>8)) {
            System.out.println("Xếp loại giỏi");
        } else if ((d < 8) && (d > 7)) {
            System.out.println("Xếp loại khá");
        } else if ((d < 7) && (d > 6)) {
            System.out.println("Xấp loại trung bình khá");
        } else if ((d < 6) && (d > 5)) {
            System.out.println("Xếp loại trung bình");
        } else {
            System.out.println("Xếp loại yếu");
        }
    }
}