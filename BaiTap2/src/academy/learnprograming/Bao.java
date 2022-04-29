package academy.learnprograming;

public class Bao extends TaiLieu {

    private String ngayPhatHanh;

    public Bao(int maTaiLieu, String nhaXuatBan, int soBanPhatHanh, String ngayPhatHanh) {
        super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Mã tài liệu: " + getMaTaiLieu() + " - Báo" + ". Nhà xuất bản: " + getNhaXuatBan() +
                ". Số bản: " + getSoBanPhatHanh() + "\nNgày xuất bản: " + ngayPhatHanh + "\n";
    }
}
