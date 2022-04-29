package academy.learnprograming;

public class Oto extends PhuongTienGiaoThong {

    private int soChoNgoi;
    private String kieuDongCo;

    public Oto(String hangSanXuat, int namSanXuat, int giaBan, String mauXe, int soChoNgoi, String kieuDongCo) {
        super(hangSanXuat, namSanXuat, giaBan, mauXe);
        this.soChoNgoi = soChoNgoi;
        this.kieuDongCo = kieuDongCo;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + "\nÔtô " + soChoNgoi + " chỗ ngồi, động cơ " + kieuDongCo +
                "\nHãng sx: " + getHangSanXuat() + ". Năm sx: " + getNamSanxuat() +
                "\nGiá bán: " + getGiaBan()/1000 + "." + getGiaBan()%1000 + ".000 đ" + ". Màu xe: " + getMauXe();
    }
}
