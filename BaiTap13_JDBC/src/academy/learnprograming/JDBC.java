package academy.learnprograming;

import java.sql.*;

public class JDBC {

    private static Connection connection;
    private static Statement statement;
    private static PreparedStatement preparedStatement;

    public static void setUpStatement() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management",
                    "root", "1805");

            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        } catch (SQLException ex) {
            System.out.println("Error:" + ex);
        }  catch (ClassNotFoundException ex) {
            System.out.println("Error:" + ex);
        }
    }



    public static void closeConnection() {
        try {
            connection.close();
        } catch (SQLException ex) {
            System.out.println("Error:" + ex);
        }
    }



    public static void viewTable(int employee_type) {
        String query = null;

        switch (employee_type) {
            case 1:
                query = "SELECT * FROM employee JOIN experience ON experience.employee_id = employee.employee_id;";
            break;
            case 2:
                query = "SELECT * FROM employee JOIN fresher ON fresher.employee_id = employee.employee_id;";
                break;
            case 3:
                query = "SELECT * FROM employee JOIN intern ON intern.employee_id = employee.employee_id;";
                break;
        }

        try {
            ResultSet rs = statement.executeQuery(query);

            if (rs.next() == false) {
                System.out.println("Chưa có nhân viên nào trong danh sách!");
            }

            rs.beforeFirst();

            while (rs.next()) {

                String id = rs.getString("employee_id");
                String fullName = rs.getString("fullName");

                String birthDay = rs.getString("birthDay");
                birthDay = chuyenDoiNgayThang(birthDay);

                String phone = rs.getString("phone");
                String email = rs.getString("email");


                switch (employee_type) {
                    case 1:
                        int expInYear = rs.getInt("expInYear");
                        String proSkill = rs.getString("proSkill");

                        System.out.println("\nMã nhân viên: " + id +
                                "\nNhân viên có kinh nghiệm " + expInYear + " năm, kỹ năng chuyên môn " + proSkill +
                                "\nHọ tên: " + fullName + ". Ngày sinh: " + birthDay +
                                "\nSố điện thoại: " + phone + ". Email: " + email);
                        break;


                    case 2:
                        String education = rs.getString("education");
                        String graduation_date = chuyenDoiNgayThang(rs.getString("graduation_date"));
                        String graduation_rank = rs.getString("graduation_rank");

                        System.out.println("\nMã nhân viên: " + id +
                                "\nNhân viên mới tốt nghiệp trường: " + education +
                                "\nThời gian tốt nghiệp: " + graduation_date + ". Loại tốt nghiệp: " + graduation_rank +
                                "\nHọ tên: " + fullName + ". Ngày sinh: " + birthDay +
                                "\nSố điện thoại: " + phone + ". Email: " + email);
                        break;


                    case 3:

                        String university_name = rs.getString("university_name");
                        int semester = rs.getInt("semester");
                        String majors = rs.getString("majors");

                        System.out.println("\nMã nhân viên: " + id +
                                "\nNhân viên đang học tại trường: " + university_name +
                                "\nChuyên ngành: " + majors + ". Học kỳ hiện tại: " + semester +
                                "\nHọ tên: " + fullName + ". Ngày sinh: " + birthDay +
                                "\nSố điện thoại: " + phone + ". Email: " + email);
                        break;

                }
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }




    public static boolean viewTable(String id) {
        String query1 = "SELECT employee_type FROM employee WHERE employee_id = '" + id + "';";
        String query2 = null;
        int employee_type = 0;
        try {
            ResultSet rs = statement.executeQuery(query1);
            if (rs.next()) {
                employee_type = rs.getInt("employee_type");
                switch (employee_type) {
                    case 1:
                        query2 = "SELECT * FROM employee JOIN experience " +
                                "ON experience.employee_id = employee.employee_id WHERE employee.employee_id = '" + id + "';";
                        break;
                    case 2:
                        query2 = "SELECT * FROM employee JOIN fresher " +
                                "ON fresher.employee_id = fresher.employee_id WHERE employee.employee_id = '" + id + "';";
                        break;
                    case 3:
                        query2 = "SELECT * FROM employee JOIN intern " +
                                "ON intern.employee_id = intern.employee_id WHERE employee.employee_id = '" + id + "';";
                        break;
                }

            } else {
                System.out.println("Không tìm thấy nhân viên có id: " + id);
                return false;
            }

            if (query2 != null) {
                rs = statement.executeQuery(query2);
                rs.first();

                String fullName = rs.getString("fullName");
                String birthDay = rs.getString("birthDay");
                birthDay = chuyenDoiNgayThang(birthDay);
                String phone = rs.getString("phone");
                String email = rs.getString("email");

                switch (employee_type) {
                    case 1:
                        int expInYear = rs.getInt("expInYear");
                        String proSkill = rs.getString("proSkill");

                        System.out.println("\nMã nhân viên: " + id +
                                "\nNhân viên có kinh nghiệm " + expInYear + " năm, kỹ năng chuyên môn " + proSkill +
                                "\nHọ tên: " + fullName + ". Ngày sinh: " + birthDay +
                                "\nSố điện thoại: " + phone + ". Email: " + email);
                        break;


                    case 2:
                        String education = rs.getString("education");
                        String graduation_date = chuyenDoiNgayThang(rs.getString("graduation_date"));
                        String graduation_rank = rs.getString("graduation_rank");

                        System.out.println("\nMã nhân viên: " + id +
                                "\nNhân viên mới tốt nghiệp trường: " + education +
                                "\nThời gian tốt nghiệp: " + graduation_date + ". Loại tốt nghiệp: " + graduation_rank +
                                "\nHọ tên: " + fullName + ". Ngày sinh: " + birthDay +
                                "\nSố điện thoại: " + phone + ". Email: " + email );
                        break;


                    case 3:

                        String university_name = rs.getString("university_name");
                        int semester = rs.getInt("semester");
                        String majors = rs.getString("majors");

                        System.out.println("\nMã nhân viên: " + id +
                                "\nNhân viên đang học tại trường: " + university_name +
                                "\nChuyên ngành: " + majors + ". Học kỳ hiện tại: " + semester +
                                "\nHọ tên: " + fullName + ". Ngày sinh: " + birthDay +
                                "\nSố điện thoại: " + phone + ". Email: " + email );
                        break;

                }
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return true;
    }



    public static void addEmployee(Employee employee) {
        String query = "INSERT INTO employee VALUES (?, ?, ?, ?, ?, ?);";
        try {
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, employee.getId());
            preparedStatement.setString(2, employee.getFullName());
            preparedStatement.setString(3, employee.getBirthDay());
            preparedStatement.setString(4, employee.getPhone());
            preparedStatement.setString(5, employee.getEmail());
            preparedStatement.setInt(6, employee.getEmployee_type());

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    

    public static void addExperienceInFo(Employee employee) {
        Experience experience = (Experience) employee;
        String query = "INSERT INTO experience VALUES (?, ?, ?);";

        try {
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, experience.getId());
            preparedStatement.setInt(2, experience.getExpInYear());
            preparedStatement.setString(3, experience.getProSkill());

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }


    public static void addFresherInFo(Employee employee) {
        Fresher fresher = (Fresher) employee;
        String query = "INSERT INTO fresher VALUES (?, ?, ?, ?);";

        try {
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, fresher.getId());
            preparedStatement.setString(2, fresher.getGraduation_date());
            preparedStatement.setString(3, fresher.getGraduation_rank());
            preparedStatement.setString(4, fresher.getEducation());

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }


    public static void addInternInFo(Employee employee) {
        Intern intern = (Intern) employee;
        String query = "INSERT INTO intern VALUES (?, ?, ?, ?);";
        try {
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, intern.getId());
            preparedStatement.setString(2, intern.getMajors());
            preparedStatement.setInt(3, intern.getSemester());
            preparedStatement.setString(4, intern.getUniversity_name());

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }



    public static void updateInFo(String id, String InFo, String updatedInFo) {
        String query = "UPDATE employee SET " + InFo + " = ? WHERE employee_id = ?;" ;
        try {
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, updatedInFo);
            preparedStatement.setString(2, id);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }


    public static void deleteEmployee(String id) {
        if (JDBC.viewTable(id)) {

            String query1 = "DELETE FROM certificates WHERE employee_id = '" + id + "';";
            String query2 = "DELETE FROM experience WHERE employee_id = '" + id + "';";
            String query3 = "DELETE FROM fresher WHERE employee_id = '" + id + "';";
            String query4 = "DELETE FROM intern WHERE employee_id = '" + id + "';";
            String query5 = "DELETE FROM employee WHERE employee_id = '" + id + "';";

            try {
                statement.executeUpdate(query1);
                statement.executeUpdate(query2);
                statement.executeUpdate(query3);
                statement.executeUpdate(query4);
                statement.executeUpdate(query5);


            } catch (SQLException ex) {
                System.out.println(ex);
            }
            System.out.println("\nĐã xóa nhân viên!");
        } else {
            System.out.println("Không tìm thấy nhân viên có id: " + id);
        }
    }


    public static void deleteInFo(String id) {
        String query1 = "DELETE FROM experience WHERE employee_id = '" + id + "';";
        String query2 = "DELETE FROM fresher WHERE employee_id = '" + id + "';";
        String query3 = "DELETE FROM intern WHERE employee_id = '" + id + "';";

        try {
            statement.executeUpdate(query1);
            statement.executeUpdate(query2);
            statement.executeUpdate(query3);


        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }





    public static void addCertificate(String id, String certificatedID, String certificatedName,
                                      String certificateRank, String certificatedDate) {

        String query = "INSERT INTO certificates VALUES (DEFAULT, ?, ?, ?, ?, ?);";

        try {
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, id);
            preparedStatement.setString(2, certificatedID);
            preparedStatement.setString(3, certificatedName);
            preparedStatement.setString(4, certificateRank);
            preparedStatement.setString(5, certificatedDate);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        System.out.println("\nThêm bằng cấp thành công!");
    }


    public static void showCerticates(String id) {
        String query = "SELECT * FROM certificates WHERE employee_id = '" + id + "';";
        try {
            ResultSet rs = statement.executeQuery(query);

            if (rs.next() == false) {
                System.out.println("Nhân viên hiện tại chưa có bằng cấp nào!");
            } else {
                System.out.println("Danh sách bằng cấp của nhân viên id " + id + " :");
            }

            rs.beforeFirst();

            while (rs.next()) {
                String certificatedID = rs.getString("certificatedID");
                String certificateName = rs.getString("certificateName");
                String certificateRank = rs.getString("certificateRank");
                String certificatedDate = chuyenDoiNgayThang(rs.getString("certificatedDate"));

                System.out.println("\nBằng cấp ID: " + certificatedID + "\nTên bằng cấp: " + certificateName +
                                    "\nXếp loại: " + certificateRank + ". Ngày cấp: " + certificatedDate);

            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }



    public static String chuyenDoiNgayThang(String input) {
        String[] inputSplit = input.split("-");

        int year = Integer.valueOf(inputSplit[0]);
        int month = Integer.valueOf(inputSplit[1]);
        int day = Integer.valueOf(inputSplit[2]);

        return day + "/" + month + "/" + year;
    }
}

