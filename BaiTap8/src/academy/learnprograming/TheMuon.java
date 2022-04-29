package academy.learnprograming;

public class TheMuon {
    private static MayTaoMaTheMuon mayTaoMaTheMuon = new MayTaoMaTheMuon();

    private String maTheMuon;
    private String ngayMuon;
    private String hanTra;
    private String soHieuSach;
    private SinhVien sinhVien;


    public TheMuon(String ngayMuon, String hanTra, String soHieuSach,
                   String hoTen, int tuoi, String lop) {
        maTheMuon = mayTaoMaTheMuon.taoMaTheMuon();
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.soHieuSach = soHieuSach;
        sinhVien = new SinhVien(hoTen, tuoi, lop);
    }

    public String getMaTheMuon() {
        return maTheMuon;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public String getHanTra() {
        return hanTra;
    }

    public String getSoHieuSach() {
        return soHieuSach;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    @Override
    public String toString() {
        return "Mã thẻ mượn: " + maTheMuon + ". Ngày mượn: " + ngayMuon + ", hạn trả: " + hanTra +
                "\nSinh viên mượn: " + sinhVien.getHoTen() + ", " + sinhVien.getTuoi()
                + " tuổi, lớp: " + sinhVien.getLop();
    }
}
