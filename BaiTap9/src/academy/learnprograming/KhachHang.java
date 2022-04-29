package academy.learnprograming;

import java.util.ArrayList;
import java.util.List;

public class KhachHang {

    private static MayTaoMaCongToDien mayTaoMaCongToDien = new MayTaoMaCongToDien();

    private String hoTen;
    private int soNha;
    private String maSoCongto;
    private int chiSoDienHienTai;

    List<BienLai> listBienLai = new ArrayList<>();

    public KhachHang(String hoTen, int soNha, int chiSoDienHienTai) {
        this.hoTen = hoTen;
        this.soNha = soNha;
        maSoCongto = mayTaoMaCongToDien.taoMaCongToDien();
        this.chiSoDienHienTai = chiSoDienHienTai;
    }

    public void tinhTienDien(int chiSoDienMoi) {
        listBienLai.add(new BienLai(chiSoDienHienTai, chiSoDienMoi));
        chiSoDienHienTai = chiSoDienMoi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getSoNha() {
        return soNha;
    }

    public String getMaSoCongto() {
        return maSoCongto;
    }

    public List<BienLai> getListBienLai() {
        return listBienLai;
    }

    public int getChiSoDienHienTai() {
        return chiSoDienHienTai;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }


}

