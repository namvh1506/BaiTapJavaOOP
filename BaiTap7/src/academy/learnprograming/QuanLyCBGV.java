package academy.learnprograming;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class QuanLyCBGV {
    List<Nguoi> quanLyCBGV = new ArrayList<>();

    public void themNguoi(Nguoi nguoi) {
        quanLyCBGV.add(nguoi);
        System.out.println("Thêm thành công giáo viên id:" + nguoi.getMaGiaoVien());
    }

    public void xoaNguoi(String id) {
        Nguoi nguoi = quanLyCBGV.stream().filter(o -> o.getMaGiaoVien().equals(id)).findFirst().orElse(null);
        if (nguoi == null) {
            System.out.println("Không tìm được giáo viên có mã id: " + id);
        } else {
            quanLyCBGV.remove(nguoi);
            System.out.println("Đã xóa thành công giáo viên có mã id: " + id);
        }

    }

    public void tinhLuong(String id) {
        Nguoi nguoi = quanLyCBGV.stream().filter(o -> o.getMaGiaoVien().equals(id)).findFirst().orElse(null);
        if (nguoi == null) {
            System.out.println("Không tìm được giáo viên có mã id: " + id);
        } else {
            int luong = nguoi.getLuongThucLinh();
            System.out.println("Lương giáo viên có mã id: " + id + " là " + luong + " đ");
        }
    }

    Scanner scanner = new Scanner(System.in);
    public int checkInt(int min, int max, String message) {
        while (!scanner.hasNextInt()) {
            System.out.println("Vui lòng nhập lại dữ liệu kiểu số:");
            scanner.nextLine();
        }
        int result = scanner.nextInt();
        scanner.nextLine();
        if (result < min || result > max) {
            System.out.println(message);
            result = checkInt(min, max, message);
        }
        return result;
    }
}
