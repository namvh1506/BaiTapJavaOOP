package academy.learnprograming;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class ValidInputChecker {

    Scanner scanner = new Scanner(System.in);

    //check số nguyên
    public int checkInt(int min, int max, String message) {
        while (!scanner.hasNextInt()) {
            System.out.println("Vui lòng nhập lại dữ liệu kiểu số:");
            scanner.nextLine();
        }
        int result = scanner.nextInt();
        scanner.nextLine();
        if (result < min || result > max) {
            System.out.println(message);
            result = checkInt(min, max, message);
        }
        return result;
    }


    //check ngày tháng năm định dạng dd/MM/YYYY
    public boolean checkNgayThangNam(String input) {

        String check = "[0-9]{1,2}+\\/[0-9]{1,2}+\\/[0-9]{4}";
        String check2 = "[0-9]{1,2}+\\-[0-9]{1,2}+\\-[0-9]{4}";
        String[] inputSplit = null;

        if (input.matches(check)) {
            inputSplit = input.split("/");
        } else if (input.matches(check2)) {
            inputSplit = input.split("-");
        } else {
            System.out.println("Ngày tháng năm phải theo định dạng dd/MM/YYYY hoặc dd-MM-YYYY");
        }

        try {
            int day = Integer.valueOf(inputSplit[0]);
            int month = Integer.valueOf(inputSplit[1]);
            int year = Integer.valueOf(inputSplit[2]);

            if (year < 1900 || year >= 2022) {
                System.out.println("Năm sinh phải lớn hơn 1900 và bé hơn hoặc bằng 2022. Vui lòng nhập lại: ");
                return false;
            }

            LocalDate.of(year, month, day);

        } catch (NullPointerException e) {
            System.out.println("Định dạng nhập vào sai. Vui lòng nhập lại: ");
            return false;

        } catch (DateTimeException e) {
            System.out.println("Số ngày trong tháng không hợp lệ. Vui lòng nhập lại: ");
            return false;
        }

        return true;

    }


    //check email
    public boolean checkEmail(String email) {
        String check = "[\\w\\.]+@[\\w]+\\.[A-Za-z]{2,6}";
        return email.matches(check);
    }


    //check sđt cần bắt đầu 090, 098, 091, 031, 035 hoặc 038, có 10 số
    public boolean checkSoDienThoai(String sdt) {
        String check = "^0+[90|98|91|31|35|38]{2}+[0-9]{7}";
        return sdt.matches(check);
    }


//    Yêu cầu đê bài: họ tên có chiều dài tối đa là 50 ký tự và tổi thiểu là 10 ký tự.
    public boolean checkHoTen(String hoTen) {

        String check = "[AĂÂÁẮẤÀẰẦẢẲẨÃẴẪẠẶẬĐEÊÉẾÈỀẺỂẼỄẸỆIÍÌỈĨỊOÔƠÓỐỚÒỒỜỎỔỞÕỖỠỌỘỢUƯÚỨÙỪỦỬŨỮỤỰYÝỲỶỸỴ" +
                "aăâáắấàằầảẳẩãẵẫạặậđeêéếèềẻểẽễẹệiíìỉĩịoôơóốớòồờỏổởõỗỡọộợuưúứùừủửũữụựyýỳỷỹỵA-Za-z\\s]{7,50}";

        hoTen = hoTen.trim();

        if (hoTen.contains("  ")) {
            System.out.println("Tên chứa 2 dấu cách liên tiếp.");
            return false;
        } else if (!hoTen.contains(" ")) {
            System.out.println("Tên bắt buộc gồm 2 từ trở lên.");
            return false;
        }
        return hoTen.matches(check);
    }

}
