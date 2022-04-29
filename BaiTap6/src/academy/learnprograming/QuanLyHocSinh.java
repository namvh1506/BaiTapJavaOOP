package academy.learnprograming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuanLyHocSinh {

    List<HocSinh> quanLyHocSinh = new ArrayList<>();

    public void themHocSinh(HocSinh hocSinh) {
        quanLyHocSinh.add(hocSinh);
    }

    public void hienThiHocSinh() {
        quanLyHocSinh.forEach(hocSinh -> System.out.println(hocSinh.toString()));
    }

    public List<HocSinh> hienThiHocSinh20Tuoi() {
        return quanLyHocSinh.stream().filter(hocSinh -> hocSinh.getTuoi() == 20 ).collect(Collectors.toList());
    }

    public long demHocSinh23TuoiQueDN() {
        return quanLyHocSinh.stream().filter(hocSinh -> hocSinh.getTuoi() == 23
                && hocSinh.getQueQuan().toUpperCase().equals("DN")).count();
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
