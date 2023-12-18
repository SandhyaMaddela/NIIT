package com.jap;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class DeleteUpdateStudentData
{

    public Connection getConnection(){
        Connection connection=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","Sanju@14");
        } catch (ClassNotFoundException  | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public void deleteStudentData(){
      // call getConnection() method
        Connection connection=getConnection();
        //execute delete query
        try {
            Statement st=connection.createStatement();
            String delete="delete from student where roll_no=104";
            int r=st.executeUpdate(delete);
            ResultSet result= st.executeQuery("select * from student");
            System.out.println("Name      Roll no      Grade       Marks");
            while (result.next()){
                String studentName=result.getString("name");
                int studentRollNo=result.getInt("roll_no");
                String studentGrade=result.getString("grade");
                int studentMarks=result.getInt("total_marks");
                System.out.println(studentName+"      "+studentRollNo+"            "+studentGrade+"         "+studentMarks);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateStudentData(){
        // call getConnection() method
        Connection connection=getConnection();
        //execute update query
        try {
            Statement st=connection.createStatement();
            String update="update student set total_marks=567 where total_marks=678 and roll_no=105";
            int r=st.executeUpdate(update);
            System.out.println("Student table after updating the values");
            ResultSet result= st.executeQuery("select * from student");
            System.out.println("Name      Roll no      Grade       Marks");
            while (result.next()){
                String studentName=result.getString("name");
                int studentRollNo=result.getInt("roll_no");
                String studentGrade=result.getString("grade");
                int studentMarks=result.getInt("total_marks");
                System.out.println(studentName+"      "+studentRollNo+"            "+studentGrade+"         "+studentMarks);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        DeleteUpdateStudentData salesDataDemo = new DeleteUpdateStudentData();
        salesDataDemo.getConnection();
        salesDataDemo.deleteStudentData();
        salesDataDemo.updateStudentData();
    }
}
