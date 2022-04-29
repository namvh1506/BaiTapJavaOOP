package academy.learnprograming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySach {

    private List<TaiLieu> quanLySach;

    public QuanLySach() {
        quanLySach = new ArrayList<>();
    }

    public void themTaiLieu(TaiLieu tailieu) {
        quanLySach.add(tailieu);
    }

    public void xoaTaiLieu(int maTaiLieu) {
        boolean found = false;

        for (TaiLieu element : quanLySach) {
            if (element.getMaTaiLieu() == maTaiLieu) {
                quanLySach.remove(element);
                System.out.println("Tài liệu mã \"" + maTaiLieu + "\" đã được xóa!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy tài liệu có mã \"" + maTaiLieu + "\"");
        }
    }

    public void hienThiTaiLieu() {
        if (!quanLySach.isEmpty()) {
            System.out.println("Danh sách tài liệu hiện có:");
            quanLySach.forEach(element -> System.out.println(element.toString()));
        } else {
            System.out.println("Không có tài liệu nào trong danh sách.");
        }
    }

    public void hienThiCuThe(String loaiTaiLieu, String tenClass) {
        System.out.println("Danh sách tài liệu dạng " + loaiTaiLieu + ":");
        int count = 0;
        for (TaiLieu element : quanLySach) {
            if (element.getClass().getSimpleName().equals(tenClass)) {
                System.out.println(element.toString());
                count++;
            }
        }
        if (count != 0) {
            System.out.println("Có tổng cộng " + count + " " + loaiTaiLieu + " trong danh sách tài liệu");
        } else {
            System.out.println("Không có " + loaiTaiLieu + " nào trong danh sách tài liệu");
        }
    }

    Scanner scanner = new Scanner(System.in);
    public int checkInt(int min, int max, String message) {
        while (!scanner.hasNextInt()) {
            System.out.println("Vui lòng nhập dữ liệu dạng số:");
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

    public int checkInt(int min, String message) {
        while (!scanner.hasNextInt()) {
            System.out.println("Vui lòng nhập dữ liệu dạng số:");
            scanner.nextLine();
        }
        int result = scanner.nextInt();
        scanner.nextLine();
        if (result < min) {
            System.out.println(message);
            result = checkInt(min, message);
        }
        return result;
    }

//cách khác check Int không dùng hàm đệ quy:
//    public int checkInt(int min, int max, String message) {
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
}
