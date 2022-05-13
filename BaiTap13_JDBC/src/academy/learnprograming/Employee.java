package academy.learnprograming;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
    private static IdGenerator idGenerator = new IdGenerator();

    protected int employee_type;

    protected String id;
    protected String fullName;
    protected String birthDay;
    protected String phone;
    protected String email;

    protected List<Certificate> certificates = new ArrayList<>();

    public Employee(int employee_type, String fullName, String birthDay, String phone, String email) {
        this.employee_type = employee_type;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;

        id = idGenerator.generateId();
    }


    public abstract void showInfo();


    public void themBangCap(String certificatedID, String certificateName, String certificateRank, String certificatedDate) {

        certificates.add(new Certificate(certificatedID, certificateName, certificateRank, certificatedDate));

        System.out.println("Thêm bằng cấp thành công!");
    }


    public String getId() {
        return id;
    }

    public int getEmployee_type() {
        return employee_type;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public List<Certificate> getCertificates() {
        return certificates;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEmployee_type(int employee_type) {
        this.employee_type = employee_type;
    }

    public void setId(String id) {
        this.id = id;
    }
}
