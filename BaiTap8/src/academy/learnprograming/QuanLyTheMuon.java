package academy.learnprograming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyTheMuon {

    List<TheMuon> quanLyTheMuon = new ArrayList<>();

    public void themTheMuon(TheMuon theMuon) {
        quanLyTheMuon.add(theMuon);
        System.out.println("Đã thêm thẻ mượn id: " + theMuon.getMaTheMuon());
    }


    public void xoaTheMuon(String maTheMuon) {
        TheMuon theMuon = quanLyTheMuon.stream().filter(o -> o.getMaTheMuon().equals(maTheMuon)).findFirst().orElse(null);
        if (theMuon == null) {
            System.out.println("Không tìm thấy thẻ mượn với mã: " + maTheMuon);
        } else {
            quanLyTheMuon.remove(theMuon);
            System.out.println("Đã xóa thẻ mượn với mã: " + maTheMuon);
        }
    }


    public void hienThiThongTin(String maTheMuon) {
        TheMuon theMuon = quanLyTheMuon.stream().filter(o -> o.getMaTheMuon().equals(maTheMuon)).findFirst().orElse(null);
        if (theMuon == null) {
            System.out.println("Không tìm thấy thẻ mượn với mã: " + maTheMuon);
        } else {
            System.out.println("Đã tìm thấy thông tin:");
            System.out.println(theMuon);
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


    //check số ngày trong tháng
    public int checkNgay(int thang) {
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return checkInt(1, 31,
                        "Tháng " + thang + " có 31 ngày. Vui lòng nhập lại:");
            case 4:
            case 6:
            case 9:
            case 11:
                return checkInt(1, 30,
                        "Tháng " + thang + " có 30 ngày. Vui lòng nhập lại:");
            case 2:
                return checkInt(1, 28,
                        "Tháng " + thang + " có 28 ngày. Vui lòng nhập lại:");
        }
        return 0;
    }


}
