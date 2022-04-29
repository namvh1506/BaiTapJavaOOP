package academy.learnprograming;

public class KySu extends CanBo {

    private String nganhDaoTao;

    public KySu(int tuoi, String hoTen, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(tuoi, hoTen, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return "Kỹ sư ngành " + nganhDaoTao + ", họ tên: " + getHoTen() + ", tuổi: "
                + getTuoi() + ", giới tính: " + getGioiTinh() + "\nĐịa chỉ: " + getDiaChi()+ "\n";
    }
}
