package academy.learnprograming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ValidInputChecker validInputChecker = new ValidInputChecker();
        QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVien();
        Scanner scanner = new Scanner(System.in);
        boolean isQuit = false;

        while (!isQuit) {
            System.out.println("\nPhần mềm quản lý nhân viên");
            System.out.println("Phím 1: Thêm nhân viên mới");
            System.out.println("Phím 2: Sửa thông tin cá nhân");
            System.out.println("Phím 3: Xóa nhân viên");
            System.out.println("Phím 4: Đổi loại nhân viên, sửa thông tin làm việc");
            System.out.println("Phím 5: Hiển thị danh sách nhân viên");
            System.out.println("Phím 6: Thoát chương trình");

            int choice = validInputChecker.checkInt(1,6,"Vui lòng nhập phím chọn 1 - 6:");
            switch (choice) {
                case 1:
                    System.out.println("Chọn loại nhân viên cần thêm \nPhím 1: Nhân viên có kinh nghiệm" +
                            "\nPhím 2: Nhân viên mới ra trường \nPhím 3: Nhân viên thực tập");

                    int choice2 = validInputChecker.checkInt(1,3,"Vui lòng nhập phím chọn 1 - 3:");

                    System.out.println("Nhập họ tên nhân viên:");
                    String hoTen = scanner.nextLine();
                    while (!validInputChecker.checkHoTen(hoTen)) {
                        System.out.println("Họ tên không đúng định dạng. Vui lòng nhập lại:");
                        hoTen = scanner.nextLine();
                    }

                    System.out.println("Nhập ngày tháng năm sinh nhân viên" +
                            "\nVui lòng nhập đúng định dạng dd/MM/YYYY hoặc dd-MM-YYYY:");
                    String ngaySinh = scanner.nextLine();
                    while (!validInputChecker.checkNgayThangNam(ngaySinh)) {
                        ngaySinh = scanner.nextLine();
                    }

                    System.out.println("Nhập số điện thoại nhân viên:");
                    String soDienThoai = scanner.nextLine();
                    while (!validInputChecker.checkSoDienThoai(soDienThoai)) {
                        System.out.println("Sđt không đúng định dạng. Vui lòng nhập lại:");
                        soDienThoai = scanner.nextLine();
                    }

                    System.out.println("Nhập email nhân viên:");
                    String email = scanner.nextLine();
                    while (!validInputChecker.checkEmail(email)) {
                        System.out.println("Email không đúng định dạng. Vui lòng nhập lại:");
                        email = scanner.nextLine();
                    }

                    switch (choice2) {
                        case 1:
                            System.out.println("Nhập số năm kinh nghiệm:");
                            int soNamKinhNghiem = validInputChecker.checkInt(1,100,
                                    "Số năm kinh nghiệm lớn hơn 1 và bé hơn 100, vui lòng nhập lại:");

                            System.out.println("Nhập kỹ năng chuyên môn:");
                            String kyNang = scanner.nextLine();

                            Employee experience = new Experience(0, hoTen.trim(), ngaySinh,
                                    soDienThoai, email, soNamKinhNghiem, kyNang);
                            quanLyNhanVien.themNhanVien(experience);
                            break;

                        case 2:
                            System.out.println("Nhập trường tốt nghiệp:");
                            String truongTotNghiep = scanner.nextLine();

                            System.out.println("Nhập ngày tốt nghiệp:");
                            String ngayTotnghiep = scanner.nextLine();
                            while (!validInputChecker.checkNgayThangNam(ngayTotnghiep)) {
                                System.out.println("Không đúng định dạng. Vui lòng nhập lại:");
                                ngayTotnghiep = scanner.nextLine();
                            }

                            System.out.println("Nhập loại tốt nghiệp:");
                            String loaiTotNghiep = scanner.nextLine();

                            Employee fresher = new Fresher(1, hoTen.trim(), ngaySinh,
                                    soDienThoai, email, ngayTotnghiep, loaiTotNghiep, truongTotNghiep);

                            quanLyNhanVien.themNhanVien(fresher);
                            break;

                        case 3:
                            System.out.println("Nhập trường đang học:");
                            String truongDangHoc = scanner.nextLine();

                            System.out.println("Nhập chuyên ngành:");
                            String chuyenNganh = scanner.nextLine();

                            System.out.println("Nhập học kỳ đang học:");
                            int hocKy = validInputChecker.checkInt(1,20, "Vui lòng nhập học kỳ lớn hơn hoặc bằng 1:");

                            Employee intern = new Intern(2, hoTen.trim(), ngaySinh,
                                    soDienThoai, email, chuyenNganh, hocKy, truongDangHoc);

                            quanLyNhanVien.themNhanVien(intern);
                            break;

                    }
                    break;

                case 2:
                    System.out.println("Nhập ID nhân viên cần sửa thông tin cá nhân:");
                    String id = scanner.nextLine();
                    if (quanLyNhanVien.timNhanVien(id) == null) { break;};

                    boolean done = false;

                    while (!done) {
                        quanLyNhanVien.timNhanVien(id).showInfo();

                        System.out.println("\nPhím 1: Sửa họ tên nhân viên");
                        System.out.println("Phím 2: Sửa ngày sinh nhân viên");
                        System.out.println("Phím 3: Sửa số điện thoại nhân viên");
                        System.out.println("Phím 4: Sửa email nhân viên");
                        System.out.println("Phím 5: Thêm bằng cấp");
                        System.out.println("Phím 6: Hiển thị danh sách bằng cấp");
                        System.out.println("Phím 7: Thoát ra menu chính");

                        int choice3 = validInputChecker.checkInt(1,7,"Vui lòng nhập phím chọn 1 - 7:");
                        switch (choice3) {

                            case 1:
                                System.out.println("Nhập họ tên mới nhân viên:");
                                String hoTenMoi = scanner.nextLine();
                                while (!validInputChecker.checkHoTen(hoTenMoi)) {
                                    System.out.println("Họ tên không đúng định dạng. Vui lòng nhập lại:");
                                    hoTenMoi = scanner.nextLine();
                                }
                                quanLyNhanVien.suaThongTin(id,1,hoTenMoi.trim());
                                break;

                            case 2:
                                System.out.println("Nhập ngày sinh mới nhân viên:");
                                String ngaySinhMoi = scanner.nextLine();
                                while (!validInputChecker.checkNgayThangNam(ngaySinhMoi)) {
                                    ngaySinhMoi = scanner.nextLine();
                                }
                                quanLyNhanVien.suaThongTin(id,2,ngaySinhMoi);
                                break;


                            case 3:
                                System.out.println("Nhập sđt mới nhân viên:");
                                String sdtMoi = scanner.nextLine();
                                while (!validInputChecker.checkSoDienThoai(sdtMoi)) {
                                    System.out.println("Sđt không đúng định dạng. Vui lòng nhập lại:");
                                    sdtMoi = scanner.nextLine();
                                }
                                quanLyNhanVien.suaThongTin(id,3,sdtMoi);
                                break;

                            case 4:
                                System.out.println("Nhập email mới nhân viên:");
                                String emailMoi = scanner.nextLine();
                                while (!validInputChecker.checkEmail(emailMoi)) {
                                    System.out.println("Email không đúng định dạng. Vui lòng nhập lại:");
                                    emailMoi = scanner.nextLine();
                                }
                                quanLyNhanVien.suaThongTin(id,4,emailMoi);
                                break;


                            case 5:
                                System.out.println("Nhập ID ghi trên bằng cấp:");
                                String certificatedID = scanner.nextLine();

                                System.out.println("Nhập tên bằng cấp:");
                                String certificatedName = scanner.nextLine();

                                System.out.println("Nhập xếp loại bằng cấp:");
                                String certificateRank = scanner.nextLine();

                                System.out.println("Nhập ngày cấp bằng:");
                                String certificatedDate = scanner.nextLine();
                                while (!validInputChecker.checkNgayThangNam(certificatedDate)) {
                                    certificatedDate = scanner.nextLine();
                                }

                                quanLyNhanVien.timNhanVien(id).themBangCap(certificatedID, certificatedName, certificateRank, certificatedDate);
                                break;

                            case 6:
                                quanLyNhanVien.hienThiBangCap(id);
                                break;

                            case 7:
                                done = true;
                                break;
                        }
                    }
                    break;



                case 3:
                    System.out.println("Nhập id nhân viên muốn xóa:");
                    String idCanXoa = scanner.nextLine();

                    quanLyNhanVien.xoaNhanVien(idCanXoa);
                    break;

                case 4:
                    System.out.println("Nhập id nhân viên cần chuyển đổi:");
                    String idCanDoi = scanner.nextLine();

                    if (quanLyNhanVien.timNhanVien(idCanDoi) == null) { break;};

                    quanLyNhanVien.timNhanVien(idCanDoi).showInfo();


                    System.out.println("\nNhập dạng nhân viên cần chuyển sang (chọn loại cũ để cập nhật mới thông tin)");
                    System.out.println("Chọn loại nhân viên cần thêm \nPhím 1: Nhân viên có kinh nghiệm" +
                            "\nPhím 2: Nhân viên mới ra trường \nPhím 3: Nhân viên thực tập");
                    int choice4 = validInputChecker.checkInt(1,3,"Vui lòng nhập lựa chọn 1 - 3:");

                    switch (choice4) {
                        case 1:
                            quanLyNhanVien.chuyenDangNhanVien(idCanDoi, 0);

                            System.out.println("Nhập số năm kinh nghiệm:");
                            int soNamKinhNghiem = validInputChecker.checkInt(1,100,
                                    "Số năm kinh nghiệm lớn hơn 1 và bé hơn 100, vui lòng nhập lại:");

                            System.out.println("Nhập kỹ năng chuyên môn:");
                            String kyNang = scanner.nextLine();

                            Experience ex = (Experience) quanLyNhanVien.timNhanVien(idCanDoi);
                            ex.setExpInYear(soNamKinhNghiem);
                            ex.setProSkill(kyNang);

                            break;
                        case 2:
                            quanLyNhanVien.chuyenDangNhanVien(idCanDoi, 1);

                            System.out.println("Nhập trường tốt nghiệp:");
                            String truongTotNghiep = scanner.nextLine();

                            System.out.println("Nhập ngày tốt nghiệp:");
                            String ngayTotnghiep = scanner.nextLine();
                            while (!validInputChecker.checkNgayThangNam(ngayTotnghiep)) {
                                ngayTotnghiep = scanner.nextLine();
                            }

                            System.out.println("Nhập loại tốt nghiệp:");
                            String loaiTotNghiep = scanner.nextLine();

                            Fresher fr = (Fresher) quanLyNhanVien.timNhanVien(idCanDoi);
                            fr.setEducation(truongTotNghiep);
                            fr.setGraduation_date(ngayTotnghiep);
                            fr.setGraduation_rank(loaiTotNghiep);

                            break;
                        case 3:
                            quanLyNhanVien.chuyenDangNhanVien(idCanDoi, 2);

                            System.out.println("Nhập trường đang học:");
                            String truongDangHoc = scanner.nextLine();

                            System.out.println("Nhập chuyên ngành:");
                            String chuyenNganh = scanner.nextLine();

                            System.out.println("Nhập học kỳ đang học:");
                            int hocKy = validInputChecker.checkInt(1,20, "Vui lòng nhập học kỳ lớn hơn hoặc bằng 1:");

                            Intern in = (Intern) quanLyNhanVien.timNhanVien(idCanDoi);
                            in.setUniversity_name(truongDangHoc);
                            in.setMajors(chuyenNganh);
                            in.setSemester(hocKy);

                            break;
                    }
                    System.out.println("Chuyển đổi thành công!");
                    quanLyNhanVien.timNhanVien(idCanDoi).showInfo();
                    break;


                case 5:
                    System.out.println("Chọn loại nhân viên cần hiển thị danh sách \nPhím 1: Nhân viên có kinh nghiệm" +
                            "\nPhím 2: Nhân viên mới ra trường \nPhím 3: Nhân viên thực tập");

                    int choice5 = validInputChecker.checkInt(1,3,"Vui lòng nhập lựa chọn 1 - 3:");

                    switch (choice5) {
                        case 1:
                            quanLyNhanVien.hienThiNhanVien("Experience");
                            break;
                        case 2:
                            quanLyNhanVien.hienThiNhanVien("Fresher");
                            break;
                        case 3:
                            quanLyNhanVien.hienThiNhanVien("Intern");
                            break;
                    }
                    break;

                case 6:
                    System.out.println("Thoát chương trình...");
                    isQuit = true;
                    break;
            }
        }
    }
}
