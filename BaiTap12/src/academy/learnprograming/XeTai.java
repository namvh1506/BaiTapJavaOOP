package academy.learnprograming;

public class XeTai extends PhuongTienGiaoThong {

    private String trongTai;

    public XeTai(String hangSanXuat, int namSanXuat, int giaBan, String mauXe, String trongTai) {
        super(hangSanXuat, namSanXuat, giaBan, mauXe);
        this.trongTai = trongTai;
    }


    public String getTrongTai() {
        return trongTai;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + "\nXe tải trọng tải " + trongTai +
                "\nHãng sx: " + getHangSanXuat() + ". Năm sx: " + getNamSanxuat() +
                "\nGiá bán: " + getGiaBan()/1000 + "." + getGiaBan()%1000 + ".000 đ" + ". Màu xe: " + getMauXe();
    }
}
