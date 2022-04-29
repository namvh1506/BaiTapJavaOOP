package academy.learnprograming;

public class ThiSinh {

    private String soBaoDanh;
    private String hoTen;
    private String diaChi;
    private String mucUuTien;
    private String khoiThi;

    public ThiSinh(String soBaoDanh, String hoTen, String diaChi, String mucUuTien, String khoiThi) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.mucUuTien = mucUuTien;
        this.khoiThi = khoiThi;
    }

    public String getSoBaoDanh() {
        return soBaoDanh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getMucUuTien() {
        return mucUuTien;
    }

    @Override
    public String toString() {
        return "Thí sinh sbd " + soBaoDanh + " - họ tên: " + hoTen + " .Khối thi " + khoiThi +
                "\nĐịa chỉ: " + diaChi + ". Mức ưu tiên: " + mucUuTien + "\n";
    }
}
