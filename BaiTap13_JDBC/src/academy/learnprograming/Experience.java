package academy.learnprograming;

public class Experience extends Employee {

    private int expInYear;
    private String proSkill;

    public Experience(int employee_type, String fullName, String birthDay,
                      String phone, String email, int expInYear, String proSkill) {
        super(employee_type, fullName, birthDay, phone, email);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }



    @Override
    public void showInfo() {
        System.out.println("\nMã nhân viên: " + id +
                "\nNhân viên có kinh nghiệm " + expInYear + " năm, kỹ năng chuyên môn " + proSkill +
                "\nHọ tên: " + fullName + ". Ngày sinh: " + birthDay +
                "\nSố điện thoại: " + phone + ". Email: " + email);
    }


    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }
}
