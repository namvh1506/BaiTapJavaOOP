package academy.learnprograming;

public class Intern extends Employee {

    private String majors;
    private int semester;
    private String university_name;

    public Intern(int employee_type, String fullName, String birthDay, String phone,
                  String email, String majors, int semester, String university_name) {
        super(employee_type, fullName, birthDay, phone, email);
        this.majors = majors;
        this.semester = semester;
        this.university_name = university_name;
    }


    @Override
    public void showInfo() {
        System.out.println("\nMã nhân viên: " + id +
                "\nNhân viên đang học tại trường: " + university_name +
                "\nChuyên ngành: " + majors + ". Học kỳ hiện tại: " + semester +
                "\nHọ tên: " + fullName + ". Ngày sinh: " + birthDay +
                "\nSố điện thoại: " + phone + ". Email: " + email );
    }


    public String getMajors() {
        return majors;
    }

    public int getSemester() {
        return semester;
    }

    public String getUniversity_name() {
        return university_name;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setUniversity_name(String university_name) {
        this.university_name = university_name;
    }
}
