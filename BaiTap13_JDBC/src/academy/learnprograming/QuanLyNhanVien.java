package academy.learnprograming;


public class QuanLyNhanVien {


    public void themNhanVien(Employee employee) {
        JDBC.addEmployee(employee);
        switch (employee.getEmployee_type()) {
            case 1:
                JDBC.addExperienceInFo(employee);
                break;
            case 2:
                JDBC.addFresherInFo(employee);
                break;
            case 3:
                JDBC.addInternInFo(employee);
                break;
        }

        System.out.println("Thêm thành công nhân viên!");
        JDBC.viewTable(employee.getId());
    }



    public void suaThongTin(String id, int loaiThongTin, String thongTinCanSua) {

            switch (loaiThongTin) {
                case 1:
                    JDBC.updateInFo(id, "fullName", thongTinCanSua);
                    break;
                case 2:
                    JDBC.updateInFo(id, "birthDay", thongTinCanSua);
                    break;
                case 3:
                    JDBC.updateInFo(id, "phone", thongTinCanSua);
                    break;
                case 4:
                    JDBC.updateInFo(id, "email", thongTinCanSua);
                    break;

            }

    }



    public void chuyenDangNhanVien(Employee employee, int employee_newtype, String id) {
        JDBC.deleteInFo(id);
        switch (employee_newtype) {
            case 1:
                JDBC.addExperienceInFo(employee);
                break;
            case 2:
                JDBC.addFresherInFo(employee);
                break;
            case 3:
                JDBC.addInternInFo(employee);
                break;
        }

        JDBC.updateInFo(id, "employee_type", String.valueOf(employee_newtype));

        JDBC.viewTable(id);
    }



    public void xoaNhanVien(String id) {
        JDBC.deleteEmployee(id);
    }



    public void hienThiNhanVien(int loaiNhanVien) {
        JDBC.viewTable(loaiNhanVien);
    }



    public void themBangCap(String id, String certificatedID, String certificatedName,
                            String certificateRank, String certificatedDate) {

        JDBC.addCertificate(id, certificatedID, certificatedName,
                certificateRank, certificatedDate);
    }


    public void hienThiBangCap(String id) {
        JDBC.showCerticates(id);
    }


}
