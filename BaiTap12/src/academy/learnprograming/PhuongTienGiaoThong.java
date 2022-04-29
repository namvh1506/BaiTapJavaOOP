package academy.learnprograming;

public class PhuongTienGiaoThong {
//    ID, Hãng sản xuất, năm sản xuất, giá bán và màu xe.
    private static MayTaoBienSoXe mayTaoBienSoXe = new MayTaoBienSoXe();

    private String id;
    private String hangSanXuat;
    private int namSanxuat;
    private int giaBan;
    private String mauXe;

    public PhuongTienGiaoThong(String hangSanXuat, int namSanxuat, int giaBan, String mauXe) {
        id = mayTaoBienSoXe.taoBienSoXe();
        this.hangSanXuat = hangSanXuat;
        this.namSanxuat = namSanxuat;
        this.giaBan = giaBan;
        this.mauXe = mauXe;
    }

    public String getId() {
        return id;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public int getNamSanxuat() {
        return namSanxuat;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public String getMauXe() {
        return mauXe;
    }


}
