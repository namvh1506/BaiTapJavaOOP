package academy.learnprograming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLyNhanVien {

    List<Employee> listNhanVien = new ArrayList<>();

    public void themNhanVien(Employee employee) {
        listNhanVien.add(employee);
        System.out.println("Thêm thành công nhân viên!");
        employee.showInfo();
    }


    public Employee timNhanVien(String id) {
        for (Employee employee : listNhanVien) {
            if (employee.getId().equals(id)) {
                 return employee;
            }
        }
        System.out.println("Không tìm thấy nhân viên có mã id: " + id);
        return null;
    }


    public void suaThongTin(String id, int loaiThongTin, String thongTinCanSua) {
        Employee employee = listNhanVien.stream().filter(o -> o.getId().equals(id)).findFirst().//("null");

        if (employee != null) {
            switch (loaiThongTin) {
                case 1:
                    employee.setFullName(thongTinCanSua);
                    break;
                case 2:
                    employee.setBirthDay(thongTinCanSua);
                    break;
                case 3:
                    employee.setPhone(thongTinCanSua);
                    break;
                case 4:
                    employee.setEmail(thongTinCanSua);
                    break;

            }

        } else {
            System.out.println("Không tìm thấy nhân viên có mã id: " + id);
        }
    }



    public void chuyenDangNhanVien(String id, int employee_newtype) {

        Employee employee = timNhanVien(id);

        if (employee != null) {
            System.out.println("Vui lòng nhập thêm thông tin:");

            String fullName = employee.fullName;
            String birthDay = employee.birthDay;
            String phone = employee.phone;
            String email = employee.email;
            listNhanVien.remove(employee);

            switch (employee_newtype) {
                case 0:
                    listNhanVien.add(new Experience(employee_newtype, fullName, birthDay, phone, email, id));
                    break;
                case 1:
                    listNhanVien.add(new Fresher(employee_newtype, fullName, birthDay, phone, email, id));
                    break;
                case 2:
                    listNhanVien.add(new Intern(employee_newtype, fullName, birthDay, phone, email, id));
                    break;
            }
        }

    }



    public void xoaNhanVien(String id) {
        Employee employee = listNhanVien.stream().filter(o -> o.getId().equals(id)).findFirst().orElse(null);

        if (employee != null) {
            listNhanVien.remove(employee);
            System.out.println("Đã xóa nhân viên có mã id: " + id);
        } else {
            System.out.println("Không tìm thấy nhân viên có mã id: " + id);
        }
    }


    public void hienThiNhanVien(String loaiNhanVien) {
        List<Employee> list = listNhanVien.stream().filter(o -> o.getClass().getSimpleName().
                                equals(loaiNhanVien)).collect(Collectors.toList());

        if (!list.isEmpty()) {
            list.forEach(o -> o.showInfo());
        } else {
            System.out.println("Không có nhân viên nào trong danh sách!");
        }
    }


    public void hienThiBangCap(String id) {
        Employee employee = timNhanVien(id);

        if (employee != null) {
            if (!employee.getCertificates().isEmpty()) {

                System.out.println("Danh sách bằng cấp nhân viên id " + id + ":");
                employee.getCertificates().forEach(o -> System.out.println(o.toString()));

            } else {
                System.out.println("Nhân viên id " + id + " chưa có bằng cấp nào.");
            }
        }
    }


}
