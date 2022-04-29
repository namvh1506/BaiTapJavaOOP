package academy.learnprograming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyPTGT {

    List<PhuongTienGiaoThong> quanLyPTGT = new ArrayList<>();

    public void themPhuongTien(PhuongTienGiaoThong phuongTienGiaoThong) {
        quanLyPTGT.add(phuongTienGiaoThong);
        System.out.println("Thêm thành công phương tiện:\n" + phuongTienGiaoThong.toString());
    }


    public void timPhuongTien(String hangSanXuat, String mauXe) {
        boolean found = false;

        for (PhuongTienGiaoThong phuongTien : quanLyPTGT) {
            if (phuongTien.getHangSanXuat().toLowerCase().equals(hangSanXuat.toLowerCase()) &&
                    phuongTien.getMauXe().toLowerCase().equals(mauXe.toLowerCase())) {
                System.out.println(phuongTien);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm được phương tiện với hãng sản xuất "
                    + hangSanXuat + " và màu " + mauXe);
        }
    }


    public void xoaPhuongTien(String id) {
        boolean found = false;

        for (PhuongTienGiaoThong phuongTien : quanLyPTGT) {
            if (phuongTien.getId().toLowerCase().equals(id.toLowerCase())) {
                System.out.println("Tìm thấy " + phuongTien.toString());
                System.out.println("Đã xóa phương tiện có id " + id.toUpperCase());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm được phương tiện có id "+ id);
        }
    }


    //check dữ liệu đầu vào có phải dạng số nguyên
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
