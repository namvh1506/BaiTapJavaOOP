package academy.learnprograming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KhachSan {

    List<PhongChoThue> khachSan = new ArrayList<>();

    public void themPhong(PhongChoThue phongChoThue) {
        khachSan.add(phongChoThue);
    }



    public PhongChoThue timPhong(String soCMNDCanTim) {
        for (PhongChoThue phong : khachSan) {
            if (phong.getNguoiThue().getSoCMND().equals(soCMNDCanTim)) {
                return phong;
            }
        }
        System.out.println("Không tìm thấy thông tin thuê phòng với số CMND " + soCMNDCanTim);
        return null;
    }


    public void xoaPhong(String soCMNDCanXoa) {
        PhongChoThue phongCanXoa = timPhong(soCMNDCanXoa);
        if (phongCanXoa != null) {
            khachSan.remove(phongCanXoa);
            System.out.println("Đã xóa thông tin thuê phòng với số CMND " + soCMNDCanXoa);
        }
    }


    public void tinhTienPhong(String soCMNDCanTinh) {
        PhongChoThue phongCanTinh = timPhong(soCMNDCanTinh);
        if (phongCanTinh != null) {
            int tienPhong = phongCanTinh.getSoNgayThue() * phongCanTinh.getTienPhong();
            System.out.println("Tiền phòng thuê của số CMND " + soCMNDCanTinh + " là " + tienPhong + "$");
        }
    }

    Scanner scanner = new Scanner(System.in);

    //check dữ liệu đầu vào có phải dạng số nguyên
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


//    //cách khác check Int không dùng hàm đệ quy:
//    public int checkInt(int min, int max, String message) {
//
//        int result = min - 1;
//        boolean success = false;
//        while (!success) {
//            while (!scanner.hasNextInt()) {
//                System.out.println("Vui lòng nhập lại dữ liệu kiểu số:");
//                scanner.nextLine();
//            }
//            result = scanner.nextInt();
//            scanner.nextLine();
//            if (result < min || result > max) {
//                System.out.println(message);
//            } else {
//                success = true;
//            }
//        }
//        return result;
//    }


    //check chuỗi ký tự dạng số (CMND)
    public String checkChuoiKyTuDangSo(int length, String message) {
        boolean success = false;
        String result = null;
        while (!success) {
            result = scanner.nextLine();
            if (result.length() == length && Integer.parseInt(result) > 0) {
                success = true;
            } else {
                System.out.println(message);
            }
        }
        return result;
    }
}
