package academy.learnprograming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyCanBo {

    private List<CanBo> danhSachCanBo;

    public QuanLyCanBo() {
        danhSachCanBo = new ArrayList<>();
    }

    public void themCanBo(CanBo canbo) {
        danhSachCanBo.add(canbo);
    }

    public void timCanBo(String ten) {
        List<CanBo> danhSachTimKiem = new ArrayList<>();

        for (CanBo element : danhSachCanBo) {
            if(element.getHoTen().toLowerCase().contains(ten.toLowerCase())) {
                danhSachTimKiem.add(element);
            }
        }
        if (!danhSachTimKiem.isEmpty()) {
            System.out.println("Danh sách cán bộ chứa từ khóa \"" + ten +"\"");
            danhSachTimKiem.forEach(element -> System.out.println(element.toString()));
        } else {
            System.out.println("Không tìm thấy cán bộ nào chứa từ khóa \"" + ten + "\"");
        }
    }

    public void thongTinCanBo() {
//        danhSachCanBo.forEach(element -> System.out.println(element.toString()));
        for (CanBo element : danhSachCanBo) {
            System.out.println(element.toString());
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
