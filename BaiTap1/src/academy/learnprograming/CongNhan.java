package academy.learnprograming;

public class CongNhan extends CanBo {

    private int bacCongNhan;

    public CongNhan(int tuoi, String hoTen, String gioiTinh, String diaChi, int bacCongNhan) {
        super(tuoi, hoTen, gioiTinh, diaChi);
        this.bacCongNhan = bacCongNhan;
    }

    @Override
    public String toString() {
        return "Công nhân bậc " + bacCongNhan + ", họ tên: " + getHoTen() + ", tuổi: "
                + getTuoi() + ", giới tính: " + getGioiTinh() + "\nĐịa chỉ: " + getDiaChi() + "\n";
    }

}
