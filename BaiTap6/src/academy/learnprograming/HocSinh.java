package academy.learnprograming;

public class HocSinh {

    private String hoTen;
    private int tuoi;
    private String queQuan;

    public HocSinh(String hoTen, int tuoi, String queQuan) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getQueQuan() {
        return queQuan;
    }

    @Override
    public String toString() {
        return "Họ tên: " + hoTen + ". Tuổi:" + tuoi + ". Quê quán: " + queQuan;
    }
}
