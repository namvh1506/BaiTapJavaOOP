package academy.learnprograming;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        QuanLyPTGT quanLyPTGT = new QuanLyPTGT();
        boolean isQuit = false;

        while (!isQuit) {
            System.out.println("\nPhần mềm quản lý phương tiện giao thông");
            System.out.println("Bấm phím 1 để thêm phương tiện");
            System.out.println("Bấm phím 2 để xóa phương tiện theo ID");
            System.out.println("Bấm phím 3 để tìm phương tiện theo hãng và màu xe");
            System.out.println("Bấm phím 4 để thoát chương trình");

            int choice = quanLyPTGT.checkInt(1, 4, "Vui lòng nhập lại tùy chọn từ 1 - 4:");
            switch (choice) {

                case 1:
                    System.out.println("Vui lòng chọn loại phương tiện muốn thêm");
                    System.out.println("Phím 1: Ôtô, phím 2: Xe máy, phím 3: xe tải");
                    int choice2 = quanLyPTGT.checkInt(1, 3, "Vui lòng nhập lại - Phím 1: Ôtô, phím 2: Xe máy, phím 3: xe tải");

                    System.out.println("Nhập hãng sản xuất: ");
                    String hangSanXuat = scanner.nextLine();

                    System.out.println("Nhập năm sản xuất:");
                    int namSanXuat = quanLyPTGT.checkInt(1990, 2022, "Năm hợp lệ từ 1990 đến 2022. Vui lòng nhập lại:");

                    System.out.println("Nhập giá bán (đơn vị nghìn đồng):");
                    int giaBan = quanLyPTGT.checkInt(1000, 50000000, "Giá hợp lệ từ 1.000.000 đến 50.000.000.000 đ. Vui lòng nhập lại:");

                    System.out.println("Nhập màu xe:");
                    String mauXe = scanner.nextLine();

                    switch (choice2) {
                        case 1:
                            System.out.println("Nhập số chỗ ngồi ôtô:");
                            int soChoNgoi = quanLyPTGT.checkInt(4, 50, "Vui lòng nhập từ 4 đến 50 chỗ:");

                            System.out.println("Nhập kiểu động cơ ôtô:");
                            String kieuDongCo = scanner.nextLine();

                            quanLyPTGT.themPhuongTien(new Oto(hangSanXuat, namSanXuat, giaBan, mauXe, soChoNgoi, kieuDongCo));
                            break;

                        case 2:
                            System.out.println("Nhập công suất xe máy:");
                            String congSuat = scanner.nextLine();

                            quanLyPTGT.themPhuongTien(new XeMay(hangSanXuat, namSanXuat, giaBan, mauXe, congSuat));
                            break;

                        case 3:
                            System.out.println("Nhập trọng tải xe tải:");
                            String trongTai = scanner.nextLine();

                            quanLyPTGT.themPhuongTien(new XeTai(hangSanXuat, namSanXuat, giaBan, mauXe, trongTai));
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Nhập id phương tiện cần xóa:");
                    String id = scanner.nextLine();

                    quanLyPTGT.xoaPhuongTien(id);
                    break;

                case 3:
                    System.out.println("Nhập hãng sản xuất của xe cần tìm:");
                    String hangSanXuatCanTim = scanner.nextLine();

                    System.out.println("Nhập màu của xe cần tìm:");
                    String mauXeCanTim = scanner.nextLine();

                    quanLyPTGT.timPhuongTien(hangSanXuatCanTim, mauXeCanTim);
                    break;

                case 4:
                    System.out.println("Thoát chương trình...");
                    isQuit = true;
                    break;
            }
        }
    }
}
