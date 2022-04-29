package academy.learnprograming;

public class PhongChoThue {
    private int soNgayThue;
    private String loaiPhong;
    private Nguoi nguoiThue;
    private int tienPhong;

    public PhongChoThue(int soNgayThue, String loaiPhong, String hoTen, int tuoi, String soCMND) {
        this.soNgayThue = soNgayThue;
        this.loaiPhong = loaiPhong;
        nguoiThue = new Nguoi(hoTen, tuoi, soCMND);

        if(loaiPhong.equals("A")) { tienPhong = 500; }
        else if(loaiPhong.equals("B")) { tienPhong = 300; }
        else if(loaiPhong.equals("C")) { tienPhong = 100; }
    }

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public Nguoi getNguoiThue() {
        return nguoiThue;
    }

    public int getTienPhong() {
        return tienPhong;
    }

    @Override
    public String toString() {
        return "Phòng loại " + loaiPhong + " - số ngày thuê: " + soNgayThue +
                 "\nSố CMND người thuê: " + nguoiThue.getSoCMND() + "\n";
    }
}
