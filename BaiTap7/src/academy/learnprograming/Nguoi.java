package academy.learnprograming;

public class Nguoi {
    private static MayTaoMaGiaoVien mayTaoMaGiaoVien = new MayTaoMaGiaoVien();

    private String hoTen;
    private int tuoi;
    private String queQuan;
    private String maGiaoVien;

    private int luongCung;
    private int luongThuong;
    private int tienPhat;
    private int luongThucLinh;

    public Nguoi(String hoTen, int tuoi, String queQuan,
                 int luongCung, int luongThuong, int tienPhat) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
        maGiaoVien = mayTaoMaGiaoVien.taoMaGiaoVien();

        this.luongCung = luongCung;
        this.luongThuong = luongThuong;
        this.tienPhat = tienPhat;
        luongThucLinh = luongCung + luongThuong - tienPhat;
    }

    public String getMaGiaoVien() {
        return maGiaoVien;
    }

    public int getLuongCung() {
        return luongCung;
    }

    public int getLuongThuong() {
        return luongThuong;
    }

    public int getTienPhat() {
        return tienPhat;
    }

    public int getLuongThucLinh() {
        return luongThucLinh;
    }
}
