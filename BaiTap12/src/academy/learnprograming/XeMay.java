package academy.learnprograming;

public class XeMay extends PhuongTienGiaoThong {

    private String congSuat;

    public XeMay(String hangSanXuat, int namSanXuat, int giaBan, String mauXe, String congSuat) {
        super(hangSanXuat, namSanXuat, giaBan, mauXe);
        this.congSuat = congSuat;
    }


    public String getCongSuat() {
        return congSuat;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + "\nXe máy công suất " + congSuat +
                "\nHãng sx: " + getHangSanXuat() + ". Năm sx: " + getNamSanxuat() +
                "\nGiá bán: " + getGiaBan()/1000 + "." + getGiaBan()%1000 + ".000 đ" + ". Màu xe: " + getMauXe();
    }
}
