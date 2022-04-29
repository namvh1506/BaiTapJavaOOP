package academy.learnprograming;

public class Sach extends TaiLieu {

    private String tenTacGia;
    private int soTrang;

    public Sach(int maTaiLieu, String nhaXuatBan, int soBanPhatHanh, String tenTacGia, int soTrang) {
        super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Mã tài liệu: " + getMaTaiLieu() + " - Sách" + ". Nhà xuất bản: " + getNhaXuatBan() +
                ". Số bản: " + getSoBanPhatHanh() + "\nTác giả: " + tenTacGia + ". Số trang: " + soTrang + "\n";
    }
}
