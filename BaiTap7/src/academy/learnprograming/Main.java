package academy.learnprograming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyCBGV quanLyCBGV = new QuanLyCBGV();
        boolean isQuit = false;

        while (!isQuit) {
            System.out.println("Phần mềm quản lý giáo viên");
            System.out.println("Bấm 1 để thêm giáo viên");
            System.out.println("Bấm 2 để xóa giáo viên theo ID");
            System.out.println("Bấm 3 tra lương của giáo viên theo ID");
            System.out.println("Bấm 4 thoát chương trình");

            int choice = quanLyCBGV.checkInt(1,4,"Vui lòng nhập từ 1 - 4:");
            switch (choice) {
                case 1:
                    System.out.println("Nhập họ tên:");
                    String hoTen = scanner.nextLine();

                    System.out.println("Nhập tuổi:");
                    int tuoi = quanLyCBGV.checkInt(18,70,"Vui lòng nhập tuổi từ 18 - 70:");

                    System.out.println("Nhập quê quán:");
                    String queQuan = scanner.nextLine();

                    System.out.println("Nhập lương cứng:");
                    int luongCung = quanLyCBGV.checkInt(2000000,100000000,"Vui lòng nhập lương tối thiểu 2 triệu, tối đa 100 triệu:");

                    System.out.println("Nhập lương thưởng:");
                    int luongThuong = quanLyCBGV.checkInt(0,100000000,"Vui lòng nhập lại:");

                    System.out.println("Nhập tiền phạt:");
                    int tienPhat = quanLyCBGV.checkInt(0,100000000,"Vui lòng nhập lại:");

                    quanLyCBGV.themNguoi(new Nguoi(hoTen, tuoi, queQuan, luongCung, luongThuong, tienPhat));
                    break;

                case 2:
                    System.out.println("Nhập mã id giáo viên cần xóa: ");
                    String idCanXoa = scanner.nextLine();

                    quanLyCBGV.xoaNguoi(idCanXoa);
                    break;

                case 3:
                    System.out.println("Nhập mã id giáo viên cần xem lương thực lĩnh: ");
                    String idCanXem = scanner.nextLine();

                    quanLyCBGV.tinhLuong(idCanXem);
                    break;

                case 4:
                    System.out.println("Thoát chương trình...");
                    isQuit = true;
                    break;
            }
        }

    }
}
