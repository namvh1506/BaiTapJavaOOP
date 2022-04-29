package academy.learnprograming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        KhachSan khachSan = new KhachSan();
        boolean isQuit = false;

        while (!isQuit) {
            System.out.println("\nPhần mềm quản lý khách sạn");
            System.out.println("Bấm phím 1 để thêm khách hàng theo CMND");
            System.out.println("Bấm phím 2 để xóa khách hàng theo CMND");
            System.out.println("Bấm phím 3 để tính tiền phòng theo CMND");
            System.out.println("Bấm phím 4 để thoát chương trình");

            int choice = khachSan.checkInt(1, 4, "Vui lòng nhập lại phím chọn từ 1 đến 4:");
            switch (choice) {

                case 1:
                    System.out.println("Nhập CMND khách hàng:");
                    String soCMND = khachSan.checkChuoiKyTuDangSo(9, "CMND gồm 9 chữ số. Vui lòng nhập lại:");

                    System.out.println("Nhập họ tên khách hàng:");
                    String hoTen = scanner.nextLine();

                    System.out.println("Nhập tuổi khách hàng:");
                    int tuoi = khachSan.checkInt(18, 100, "Tuổi yêu cầu từ 18 đến 100. Vui lòng nhập lại:");

                    System.out.println("Nhập loại phòng muốn thuê:");
                    System.out.println("Phím 1: Phòng loại A - 500$" + "\nPhím 2: Phòng loại B - 300$" + "\nPhím 3: Phòng loại C - 100$");

                    int choice2 = khachSan.checkInt(1, 3, "Vui lòng nhập lại loại phòng từ 1 đến 3:");
                    String loaiPhong = null;
                    switch (choice2) {
                        case 1:
                            loaiPhong = "A";
                            break;
                        case 2:
                            loaiPhong = "B";
                            break;
                        case 3:
                            loaiPhong = "C";
                            break;
                    }

                    System.out.println("Nhập số ngày thuê:");
                    int soNgayThue = khachSan.checkInt(1, 365, "Số ngày hợp lệ từ 1 đến 365 ngày. Vui lòng nhập lại:");


                    PhongChoThue phongChoThue = new PhongChoThue(soNgayThue, loaiPhong, hoTen, tuoi, soCMND);
                    khachSan.themPhong(phongChoThue);
                    System.out.println("Thêm thành công! Thông tin thuê phòng:");
                    System.out.println(phongChoThue.toString());
                    break;


                case 2:
                    System.out.println("Nhập số CMND khách hàng cần xóa:");
                    String soCMNDCanXoa = khachSan.checkChuoiKyTuDangSo(9, "CMND gồm 9 chữ số. Vui lòng nhập lại:");

                    khachSan.xoaPhong(soCMNDCanXoa);
                    break;

                case 3:
                    System.out.println("Nhập số CMND cần lấy thông tin tiền phòng:");
                    String soCMNDCanTinh = khachSan.checkChuoiKyTuDangSo(9, "CMND gồm 9 chữ số. Vui lòng nhập lại:");
                    khachSan.tinhTienPhong(soCMNDCanTinh);
                    break;

                case 4:
                    System.out.println("Thoát chương trình...");
                    isQuit = true;
                    break;
            }
        }
    }
}
