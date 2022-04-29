package academy.learnprograming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class QuanLyKhachHang {

        List<KhachHang> quanLyKhachHang = new ArrayList<>();

        public void themKhachHang(KhachHang khachHang) {
            quanLyKhachHang.add(khachHang);
            System.out.println("Thêm khách hàng thành công, mã công tơ: " + khachHang.getMaSoCongto());
        }

        public KhachHang timKhachHang(String maCongTo) {
            return quanLyKhachHang.stream().filter(o -> o.getMaSoCongto().equals(maCongTo))
                    .findFirst().orElse(null);
        }

        public void xoaKhachHang(String maCongTo) {
            KhachHang khachhang = timKhachHang(maCongTo);

            if (khachhang != null) {
                quanLyKhachHang.remove(khachhang);
                System.out.println("Đã xóa khách hàng với mã công tơ: " + maCongTo);
            } else {
                System.out.println("Không tìm thấy khách hàng với mã công tơ: " + maCongTo);
            }
        }


        public void suaKhachHang(String maCongTo, String hoTen, int soNha) {
            KhachHang khachhang = timKhachHang(maCongTo);

            if (khachhang != null) {
                khachhang.setHoTen(hoTen);
                khachhang.setSoNha(soNha);
                System.out.println("Đã sửa thông tin khách hàng với mã công tơ: " + maCongTo);
            } else {
                System.out.println("Không tìm thấy khách hàng với mã công tơ: " + maCongTo);
            }
        }


        public void themBienLai(String maCongTo, int chiSoDienMoi) {
            KhachHang khachhang = timKhachHang(maCongTo);

            if (khachhang != null) {
                if (chiSoDienMoi > khachhang.getChiSoDienHienTai()) {
                    khachhang.tinhTienDien(chiSoDienMoi);
                    System.out.println("Đã thêm biên lai cho khách hàng với mã công tơ: " + maCongTo);
                } else {
                    System.out.println("Chỉ số điện mới bé hơn chỉ số điện cũ, mã công tơ: " + maCongTo);
                }

            } else {
                System.out.println("Không tìm thấy khách hàng với mã công tơ: " + maCongTo);
            }
        }


        public void thongTinTienDien(String maCongTo) {
            KhachHang khachhang = timKhachHang(maCongTo);

            if (khachhang != null) {
                System.out.println("Thông tin biên lai của khách hàng:");
                khachhang.getListBienLai().forEach(o -> System.out.println("+ " + o.toString()));
            } else {
                System.out.println("Không tìm thấy khách hàng với mã công tơ: " + maCongTo);
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

