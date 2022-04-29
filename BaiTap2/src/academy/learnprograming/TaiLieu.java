package academy.learnprograming;

public class TaiLieu {
    private int maTaiLieu;
    private String nhaXuatBan;
    private int soBanPhatHanh;

    public TaiLieu(int maTaiLieu, String nhaXuatBan, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.nhaXuatBan = nhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public int getMaTaiLieu() {
        return maTaiLieu;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }
}
