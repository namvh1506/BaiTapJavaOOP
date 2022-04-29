package academy.learnprograming;

public class SinhVien {
    private String hoTen;
    private int tuoi;
    private String lop;

    public SinhVien(String hoTen, int tuoi, String lop) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.lop = lop;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getLop() {
        return lop;
    }
}
