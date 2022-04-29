package academy.learnprograming;

public class BienLai {

    private int chiSoDienCu;
    private int chiSoDienMoi;
    private long soTienPhaiTra;


    public BienLai(int chiSoDienCu, int chiSoDienMoi) {
        this.chiSoDienCu = chiSoDienCu;
        this.chiSoDienMoi = chiSoDienMoi;
        soTienPhaiTra = 5000 * (chiSoDienMoi - chiSoDienCu);
    }

    public int getChiSoDienCu() {
        return chiSoDienCu;
    }

    public int getChiSoDienMoi() {
        return chiSoDienMoi;
    }

    public long getSoTienPhaiTra() {
        return soTienPhaiTra;
    }

    @Override
    public String toString() {
        return "Biên lai thu tiền [" +
                "Số điện cũ: " + chiSoDienCu +
                ", số điện mới: " + chiSoDienMoi +
                ". Số tiền phải trả: " + soTienPhaiTra +
                "đ ]";
    }
}
