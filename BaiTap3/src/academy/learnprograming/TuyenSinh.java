package academy.learnprograming;

import java.util.ArrayList;
import java.util.List;

public class TuyenSinh {

    List<ThiSinh> tuyenSinh = new ArrayList<>();

    public void themThiSinh(ThiSinh thiSinh) {
        tuyenSinh.add(thiSinh);
    }

    public void hienThiDanhSach() {
        tuyenSinh.forEach(o -> System.out.println(o.toString()));
    }

    public void timKiemThiSinh(String sbd) {
        boolean found = false;
        for (ThiSinh element : tuyenSinh) {
            if (element.getSoBaoDanh().equals(sbd)) {
                System.out.println(element.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy thí sinh nào");
        }
    }

}
