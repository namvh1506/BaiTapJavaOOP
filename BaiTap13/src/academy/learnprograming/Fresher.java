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


    public Fresher(int employee_type, String fullName, String birthDay, String phone,
                   String email, String id) {
        super(employee_type, fullName, birthDay, phone, email, id);
        this.graduation_date = null;
        this.graduation_rank = null;
        this.education = null;
    }

    @Override
    public void showInfo() {
        System.out.println("\nMã nhân viên: " + id +
                "\nNhân viên mới tốt nghiệp trường: " + education +
                "\nThời gian tốt nghiệp: " + graduation_date + ". Loại tốt nghiệp: " + graduation_rank +
                "\nHọ tên: " + fullName + ". Ngày sinh: " + birthDay +
                "\nSố điện thoại: " + phone + ". Email: " + email );
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
