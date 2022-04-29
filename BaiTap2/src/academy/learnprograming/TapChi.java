package academy.learnprograming;

public class TapChi extends TaiLieu {

    private int soPhatHanh;
    private int thangPhatHanh;

    public TapChi(int maTaiLieu, String nhaXuatBan, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
        super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return "Mã tài liệu: " + getMaTaiLieu() + " - Tạp chí" + ". Nhà xuất bản: " + getNhaXuatBan() +
                ". Số bản: " + getSoBanPhatHanh() + "\nSố phát hành: "
                + soPhatHanh + ". Tháng phát hành: " + thangPhatHanh + "\n";
    }
}
