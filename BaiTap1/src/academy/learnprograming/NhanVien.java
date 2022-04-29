package academy.learnprograming;

public class NhanVien extends CanBo {

    private String congViec;

    public NhanVien(int tuoi, String hoTen, String gioiTinh, String diaChi, String congViec) {
        super(tuoi, hoTen, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return "Nhân viên " + congViec + ", họ tên: " + getHoTen() + ", tuổi: "
                + getTuoi() + ", giới tính: " + getGioiTinh() + "\nĐịa chỉ: " + getDiaChi()+ "\n";
    }
}
