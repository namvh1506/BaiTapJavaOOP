package academy.learnprograming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        QuanLySach quanLySach = new QuanLySach();
        int maTaiLieu = 0; //mã tài liệu tăng dần từ 1
        boolean isQuit = false;

        while (!isQuit) {
            System.out.println("\nPhần mềm quản lý sách");
            System.out.println("Bấm phím 1: Thêm mới tài liệu");
            System.out.println("Bấm phím 2: Xóa tài liệu");
            System.out.println("Bấm phím 3: Hiển thị tài liệu");
            System.out.println("Bấm phím 4: Tìm kiếm theo loại");
            System.out.println("Bấm phím 5: Thoát chương trình");
            int choice = quanLySach.checkInt(1,5,"Phím bấm không hợp lệ. Vui lòng chọn lại:");

            switch (choice) {
                case 1:
                    System.out.println("Chọn loại tài liệu muốn thêm vào:\n" +
                            "Phím 1: Sách, phím 2: Tạp chí, phím 3: Báo");
                    int choice2 = quanLySach.checkInt(1, 3, "Vui lòng chọn lại. " +
                            "Phím 1: Sách, phím 2: Tạp chí, phím 3: Báo");

                    System.out.println("Nhập nhà xuất bản:");
                    String nhaXuatBan = scanner.nextLine();
                    System.out.println("Nhập số bản phát hành:");
                    int soBanPhatHanh = quanLySach.checkInt(1, "Số bản phát hành không hợp lệ. Vui lòng nhập lại:");

                    switch (choice2) {
                        case 1:
                            System.out.println("Nhập tên tác giả sách:");
                            String tenTacGia = scanner.nextLine();
                            System.out.println("Nhập số trang sách:");
                            int soTrang = quanLySach.checkInt(1, "Số trang không hợp lệ. Vui lòng nhập lại");

                            maTaiLieu++;
                            TaiLieu sach = new Sach(maTaiLieu, nhaXuatBan, soBanPhatHanh, tenTacGia, soTrang);
                            quanLySach.themTaiLieu(sach);
                            break;

                        case 2:
                            System.out.println("Nhập số phát hành tạp chí:");
                            int soPhatHanh = quanLySach.checkInt(1, 10000,
                                    "Số phát hành không hợp lệ. Vui lòng nhập lại:");
                            System.out.println("Nhập tháng phát hành tạp chí:");
                            int thangPhatHanh = quanLySach.checkInt(1, 12,
                                    "Tháng phát hành không hợp lệ. Vui lòng nhập lại:");

                            maTaiLieu++;
                            TaiLieu tapChi = new TapChi(maTaiLieu, nhaXuatBan, soBanPhatHanh, soPhatHanh, thangPhatHanh);
                            quanLySach.themTaiLieu(tapChi);
                            break;

                        case 3:
                            System.out.println("Nhập tháng phát hành báo:");
                            int thangCuaBao = quanLySach.checkInt(1, 12,
                                    "Tháng phát hành không hợp lệ. Vui lòng nhập lại:");
                            System.out.println("Nhập ngày phát hành báo:");
                            int ngayCuaBao = -1;
                            switch (thangCuaBao) {
                                case 1:
                                case 3:
                                case 5:
                                case 7:
                                case 8:
                                case 10:
                                case 12:
                                    ngayCuaBao = quanLySach.checkInt(1, 31,
                                            "Tháng " + thangCuaBao + " có 31 ngày. Vui lòng nhập lại:");
                                    break;
                                case 4:
                                case 6:
                                case 9:
                                case 11:
                                    ngayCuaBao = quanLySach.checkInt(1, 30,
                                            "Tháng " + thangCuaBao + " có 30 ngày. Vui lòng nhập lại:");
                                    break;
                                case 2:
                                    ngayCuaBao = quanLySach.checkInt(1, 28,
                                            "Tháng " + thangCuaBao + " có 28 ngày. Vui lòng nhập lại:");
                                    break;
                            }
                            maTaiLieu++;
                            TaiLieu bao = new Bao(maTaiLieu, nhaXuatBan, soBanPhatHanh, ngayCuaBao + "/" + thangCuaBao);
                            quanLySach.themTaiLieu(bao);
                    }
                    break;

                case 2:
                    System.out.println("Nhập mã tài liệu cần xóa:");
                    int maTaiLieuCanXoa = quanLySach.checkInt(1, "Vui lòng nhập đúng mã tài liệu:");
                    quanLySach.xoaTaiLieu(maTaiLieuCanXoa);
                    break;

                case 3:
                    quanLySach.hienThiTaiLieu();
                    break;
                case 4:
                    System.out.println("Vui lòng chọn loại tài liệu tìm:");
                    System.out.println("Phím 1: Sách, phím 2: Tạp chí, phím 3: Báo");
                    int choice3 = quanLySach.checkInt(1, 3, "Vui lòng chọn lại. " +
                            "Phím 1: Sách, phím 2: Tạp chí, phím 3: Báo");
                    switch (choice3) {
                        case 1:
                            quanLySach.hienThiCuThe("sách", "Sach");
                            break;
                        case 2:
                            quanLySach.hienThiCuThe("tạp chí", "TapChi");
                            break;
                        case 3:
                            quanLySach.hienThiCuThe("báo", "Bao");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Thoát chương trình...");
                    isQuit = true;
            }
        }
    }
}
