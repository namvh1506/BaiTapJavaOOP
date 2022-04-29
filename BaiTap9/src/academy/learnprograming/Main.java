package academy.learnprograming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyKhachHang quanLyKhachHang = new QuanLyKhachHang();
        boolean isQuit = false;

        while (!isQuit) {
            System.out.println("\nPhần mềm quản lý khách hàng dùng điện");
            System.out.println("Bấm phím 1: Thêm khách hàng mới");
            System.out.println("Bấm phím 2: Nhập số điện mới khách hàng cũ");
            System.out.println("Bấm phím 3: Chỉnh sửa thông tin khách hàng cũ");
            System.out.println("Bấm phím 4: Xóa khách hàng cũ");
            System.out.println("Bấm phím 5: Hiển thị toàn bộ biên lai khách hàng");
            System.out.println("Bấm phím 6: Thoát chương trình");

            int choice = quanLyKhachHang.checkInt(1, 6, "Vui lòng nhập từ 1 - 6:");
            switch (choice) {
                case 1:
                    System.out.println("Nhập họ tên khách hàng mới:");
                    String hoTen = scanner.nextLine();

                    System.out.println("Nhập số nhà:");
                    int soNha = quanLyKhachHang.checkInt(1, 999, "Vui lòng nhập số nhà hợp lệ từ 1 đến 999:");

                    System.out.println("Nhập số điện hiện tại:");
                    int chiSoDienHienTai = quanLyKhachHang.checkInt(1, Integer.MAX_VALUE, "Vui lòng nhập số điện hợp lệ:");


                    quanLyKhachHang.themKhachHang(new KhachHang(hoTen, soNha, chiSoDienHienTai));
                    break;


                case 2:
                    System.out.println("Nhập mã công tơ: ");
                    String maCongTo = scanner.nextLine();

                    System.out.println("Nhập số điện mới: ");
                    int chiSoDienMoi = quanLyKhachHang.checkInt(1, Integer.MAX_VALUE, "Vui lòng nhập số điện hợp lệ:");

                    quanLyKhachHang.themBienLai(maCongTo, chiSoDienMoi);
                    break;

                case 3:
                    System.out.println("Nhập mã công tơ: ");
                    String maCongTo2 = scanner.nextLine();

                    System.out.println("Nhập họ tên mới: ");
                    String hoTenMoi = scanner.nextLine();

                    System.out.println("Nhập số nhà mới: ");
                    int soNhaMoi = quanLyKhachHang.checkInt(1, 999, "Vui lòng nhập số nhà hợp lệ từ 1 đến 999:");

                    quanLyKhachHang.suaKhachHang(maCongTo2, hoTenMoi, soNhaMoi);

                    break;

                case 4:
                    System.out.println("Nhập mã công tơ: ");
                    String maCongTo3 = scanner.nextLine();

                    quanLyKhachHang.xoaKhachHang(maCongTo3);
                    break;

                case 5:
                    System.out.println("Nhập mã công tơ: ");
                    String maCongTo4 = scanner.nextLine();

                    System.out.println("Thông tin tiền điện:");
                    quanLyKhachHang.thongTinTienDien(maCongTo4);
                    break;

                case 6:
                    System.out.println("Thoát chương trình...");
                    isQuit = true;
                    break;
            }
        }
    }
}
