package academy.learnprograming;

public class Fresher extends Employee {

    private String graduation_date;
    private String graduation_rank;
    private String education;

    public Fresher(int employee_type, String fullName, String birthDay, String phone,
                   String email, String graduation_date, String graduation_rank, String education) {
        super(employee_type, fullName, birthDay, phone, email);
        this.graduation_date = graduation_date;
        this.graduation_rank = graduation_rank;
        this.education = education;
    }



    @Override
    public void showInfo() {
        System.out.println("\nMã nhân viên: " + id +
                "\nNhân viên mới tốt nghiệp trường: " + education +
                "\nThời gian tốt nghiệp: " + graduation_date + ". Loại tốt nghiệp: " + graduation_rank +
                "\nHọ tên: " + fullName + ". Ngày sinh: " + birthDay +
                "\nSố điện thoại: " + phone + ". Email: " + email );
    }

    public String getGraduation_date() {
        return graduation_date;
    }

    public String getGraduation_rank() {
        return graduation_rank;
    }

    public String getEducation() {
        return education;
    }

    public void setGraduation_date(String graduation_date) {
        this.graduation_date = graduation_date;
    }

    public void setGraduation_rank(String graduation_rank) {
        this.graduation_rank = graduation_rank;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}
