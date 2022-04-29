package academy.learnprograming;

import java.util.Scanner;

public class TinhToanSoPhuc {



    public SoPhuc congSoPhuc(SoPhuc s1, SoPhuc s2) {
        double phanThuc = s1.getPhanThuc() + s2.getPhanThuc();
        double phanAo = s1.getPhanAo() + s2.getPhanAo();

        return new SoPhuc(phanThuc, phanAo);
    }


// (a + a'i)(b + b'i) = ab - a'b' + (ab' + a'b)i

    public SoPhuc nhanSoPhuc(SoPhuc s1, SoPhuc s2) {
        double phanThuc = s1.getPhanThuc() * s2.getPhanThuc() - s1.getPhanAo() * s2.getPhanAo();
        double phanAo = s1.getPhanThuc() * s2.getPhanAo() + s1.getPhanAo() * s2.getPhanThuc();

        return new SoPhuc(phanThuc, phanAo);
    }


    //check dữ liệu đầu vào
    Scanner scanner = new Scanner(System.in);
    public double checkDouble(String message) {
        System.out.println(message);
        while (!scanner.hasNextDouble()) {
            System.out.println("Vui lòng nhập lại dữ liệu kiểu double:");
            scanner.nextLine();
        }
        return scanner.nextDouble();
    }
}
