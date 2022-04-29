package academy.learnprograming;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TinhToanSoPhuc tinhToanSoPhuc = new TinhToanSoPhuc();

        System.out.println("Phím 1: Cộng số phức");
        System.out.println("Phím 2: Nhân số phức");


        String choice = "";
        boolean found = false;
        while (!found) {
            if (!choice.equals("1") && !choice.equals("2")) {
                choice = scanner.nextLine();
            } else {
                found = true;
            }
        }

        double phanThuc1 = tinhToanSoPhuc.checkDouble("Nhập phần thực số thứ nhất:");
        double phanAo1 = tinhToanSoPhuc.checkDouble("Nhập phần ảo số thứ nhất:");

        SoPhuc soPhuc1 = new SoPhuc(phanThuc1, phanAo1);

        double phanThuc2 = tinhToanSoPhuc.checkDouble("Nhập phần thực số thứ hai:");
        double phanAo2 = tinhToanSoPhuc.checkDouble("Nhập phần ảo số thứ hai:");

        SoPhuc soPhuc2 = new SoPhuc(phanThuc2, phanAo2);

        switch (choice) {
            case "1":
                SoPhuc ketquaCong = tinhToanSoPhuc.congSoPhuc(soPhuc1, soPhuc2);
                System.out.println(soPhuc1 + " + " + soPhuc2 + " = " + ketquaCong);
                break;

            case "2":
                SoPhuc ketquaNhan = tinhToanSoPhuc.nhanSoPhuc(soPhuc1, soPhuc2);
                System.out.println(soPhuc1 + " * " + soPhuc2 + " = " + ketquaNhan);
                break;
        }
    }
}
