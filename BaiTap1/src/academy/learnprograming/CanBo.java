package academy.learnprograming;

public class CanBo {

    private int tuoi;
    private String hoTen;
    private String gioiTinh;
    private String diaChi;

    public CanBo(int tuoi, String hoTen, String gioiTinh, String diaChi) {
        this.tuoi = tuoi;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }
}
