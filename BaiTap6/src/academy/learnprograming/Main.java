package academy.learnprograming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyHocSinh quanLyHocSinh = new QuanLyHocSinh();
        boolean isQuit = false;

        while (!isQuit) {
            System.out.println("\nPhần mềm quản lý học sinh");
            System.out.println("Bấm phím 1: Thêm học sinh");
            System.out.println("Bấm phím 2: Hiển thị toàn bộ học sinh");
            System.out.println("Bấm phím 3: Hiển thị học sinh 20 tuổi");
            System.out.println("Bấm phím 4: Hiển thị học sinh 23 tuổi, quê DN");
            System.out.println("Bấm phím 5: Thoát chương trình");
            int choice = quanLyHocSinh.checkInt(1, 5, "Vui lòng nhập phím từ 1-5:");

            switch (choice) {
                case 1:
                    System.out.println("Nhập họ tên học sinh:");
                    String hoTen = scanner.nextLine();

                    System.out.println("Nhập tuổi học sinh:");
                    int tuoi = quanLyHocSinh.checkInt(10,30,"Tuổi hợp lệ từ 10 đến 30. Vui lòng nhập lại:");

                    System.out.println("Nhập quê quán học sinh:");
                    String queQuan = scanner.nextLine();

                    quanLyHocSinh.themHocSinh(new HocSinh(hoTen, tuoi, queQuan));
                    System.out.println("Thêm thành công!");
                    break;

                case 2:
                    System.out.println("Danh sách học sinh:");
                    quanLyHocSinh.hienThiHocSinh();
                    break;

                case 3:
                    System.out.println("Danh sách học sinh 20 tuổi:");
                    quanLyHocSinh.hienThiHocSinh20Tuoi().forEach(hocsinh -> System.out.println(hocsinh.toString()));
                    break;

                case 4:
                    System.out.print("Số lượng học sinh 23 tuổi quê DN: ");
                    System.out.println(quanLyHocSinh.demHocSinh23TuoiQueDN());
                    break;

                case 5:
                    System.out.println("Thoát chương trình...");
                    isQuit = true;
                    break;
            }
        }
    }
}
