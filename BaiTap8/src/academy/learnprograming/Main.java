package academy.learnprograming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyTheMuon quanLyTheMuon = new QuanLyTheMuon();
        boolean isQuit = false;

        while (!isQuit) {
            System.out.println("\nPhần mềm quản lý thư viện");
            System.out.println("Bấm phím 1: Thêm phiếu mượn");
            System.out.println("Bấm phím 2: Xóa phiếu mượn theo mã");
            System.out.println("Bấm phím 3: Hiển thị thông tin phiếu mượn theo mã");
            System.out.println("Bấm phím 4: Thoát chương trình");

            int choice = quanLyTheMuon.checkInt(1,4,"Vui lòng nhập từ 1 - 4:");
            switch (choice) {
                case 1:
                    System.out.println("Nhập họ tên sinh viên mượn:");
                    String hoTen = scanner.nextLine();

                    System.out.println("Nhập tuổi:");
                    int tuoi = quanLyTheMuon.checkInt(18,70,"Vui lòng nhập tuổi hợp lệ từ 18 đến 70:");

                    System.out.println("Nhập lớp:");
                    String lop = scanner.nextLine();

                    System.out.println("Nhập tháng mượn:");
                    int thang = quanLyTheMuon.checkInt(1,12, "Vui lòng nhập tháng hợp lệ từ 1 đến 12:");

                    System.out.println("Nhập ngày mượn:");
                    int ngay = quanLyTheMuon.checkNgay(thang);
                    String ngayMuon = ngay + "/" + thang;

                    System.out.println("Nhập tháng trả:");
                    int thang2 = quanLyTheMuon.checkInt(1,12, "Vui lòng nhập tháng hợp lệ từ 1 đến 12:");

                    System.out.println("Nhập ngày trả:");
                    int ngay2 = quanLyTheMuon.checkNgay(thang);
                    String hanTra = ngay2 + "/" + thang2;

                    System.out.println("Nhập số hiệu sách:");
                    String soHieuSach = scanner.nextLine();

                    quanLyTheMuon.themTheMuon(new TheMuon(ngayMuon, hanTra, soHieuSach, hoTen, tuoi, lop));
                    break;


                case 2:
                    System.out.println("Nhập mã thẻ mượn cần xóa: ");
                    String maCanXoa = scanner.nextLine();

                    quanLyTheMuon.xoaTheMuon(maCanXoa);
                    break;

                case 3:
                    System.out.println("Nhập mã thẻ mượn cần hiển thị: ");
                    String maHienThi = scanner.nextLine();

                    quanLyTheMuon.hienThiThongTin(maHienThi);
                    break;

                case 4:
                    System.out.println("Thoát chương trình...");
                    isQuit = true;
                    break;


            }
        }
    }
}
