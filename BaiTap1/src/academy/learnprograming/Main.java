package academy.learnprograming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyCanBo quanLyCanBo = new QuanLyCanBo();
        boolean isQuit = false;

        while (!isQuit) {
            System.out.println("\nPhần mềm quản lý cán bộ");
            System.out.println("Bấm phím 1: Thêm cán bộ");
            System.out.println("Bấm phím 2: Tìm kiếm theo tên cán bộ");
            System.out.println("Bấm phím 3: Thông tin danh sách cán bộ");
            System.out.println("Bấm phím 4: Thoát chương trình");
            int choice = quanLyCanBo.checkInt(1,4, "Vui lòng nhập phím từ 1-4:");

            switch (choice) {
                case 1:
                    System.out.println("Chọn loại cán bộ muốn thêm vào: ");
                    System.out.println("Phím 1: Công nhân, phím 2: Kỹ sư, phím 3: Nhân viên");
                    int choice2 = quanLyCanBo.checkInt(1,3, "Vui lòng chọn lại: Phím 1: Công nhân, phím 2: Kỹ sư, phím 3: Nhân viên");

                    System.out.println("Nhập họ tên:");
                    String hoTen = scanner.nextLine();

                    System.out.println("Nhập tuổi:");
                    int tuoi = quanLyCanBo.checkInt(18,70, "Tuổi phải từ 18 đến 70. Vui lòng nhập lại:");

                    System.out.println("Chọn giới tính:");
                    System.out.println("Phím 1: Nam, Phím 2: Nữ, Phím 3: Khác");
                    String gioiTinh = "";
                    int choice3 = quanLyCanBo.checkInt(1,3, "Vui lòng chọn lại: Phím 1: Nam, Phím 2: Nữ, Phím 3: Khác ");
                    switch (choice3) {
                        case 1:
                            gioiTinh = "Nam";
                            break;
                        case 2:
                            gioiTinh = "Nữ";
                            break;
                        case 3:
                            gioiTinh = "Khác";
                            break;
                    }

                    System.out.println("Nhập địa chỉ:");
                    String diaChi = scanner.nextLine();

                    switch (choice2) {
                        case 1:
                            System.out.println("Nhap bac cong nhan");
                            int bacCongNhan = quanLyCanBo.checkInt(1,10, "Bậc công nhân từ 1 đến 10. Vui lòng chọn lại:");
                            CanBo congNhan = new CongNhan(tuoi, hoTen, gioiTinh, diaChi, bacCongNhan);
                            quanLyCanBo.themCanBo(congNhan);
                            System.out.println("Đã thêm 1 cán bộ công nhân");
                            break;
                        case 2:
                            System.out.println("Nhập ngành đào tạo Kỹ sư:");
                            String nganhDaotao = scanner.nextLine();
                            CanBo kySu = new KySu(tuoi, hoTen, gioiTinh, diaChi, nganhDaotao);
                            quanLyCanBo.themCanBo(kySu);
                            System.out.println("Đã thêm 1 cán bộ kỹ sư");
                            break;
                        case 3:
                            System.out.println("Nhập công việc Nhân viên:");
                            String congViec = scanner.nextLine();
                            CanBo nhanVien = new NhanVien(tuoi, hoTen, gioiTinh, diaChi, congViec);
                            quanLyCanBo.themCanBo(nhanVien);
                            System.out.println("Đã thêm 1 cán bộ nhân viên");
                            break;

                    }
                    break;
                case 2:
                    System.out.println("Nhập tên muốn tìm: ");
                    String tenTimKiem = scanner.nextLine();
                    quanLyCanBo.timCanBo(tenTimKiem);
                    break;
                case 3:
                    System.out.println("Danh sách cán bộ:");
                    quanLyCanBo.thongTinCanBo();
                    break;
                case 4:
                    System.out.println("Thoát chương trình...");
                    isQuit = true;
                    break;
            }
        }
    }



}
