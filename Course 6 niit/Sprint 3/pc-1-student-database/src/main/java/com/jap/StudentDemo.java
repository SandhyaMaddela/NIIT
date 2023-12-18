package com.jap;

import java.sql.*;

public class StudentDemo
{

    public void getAllStudentDetails(){
      //Load the Drivers
        try {
            // Get the connection from database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","Sanju@14");
            //Create statement object
            Statement statement=connection.createStatement();
            //execute the query
            String getResult="select * from student";
            ResultSet resultSet=statement.executeQuery(getResult);
            //display the ResultSet Data
            System.out.println("Student Details");
            while (resultSet.next()){
                String studentName=resultSet.getString("name");
                int studentRollNo=resultSet.getInt("roll_no");
                String studentGrade=resultSet.getString("grade");
                int studentMarks=resultSet.getInt("total_marks");
                System.out.println("Name :"+studentName);
                System.out.println("Roll no :"+studentRollNo);
                System.out.println("Grade :"+studentGrade);
                System.out.println("Marks :"+studentMarks);
                System.out.println("--------------------------------");
            }

        } catch (ClassNotFoundException|SQLException e) {
            e.printStackTrace();
        }

    }
    public static void main( String[] args ) {
        StudentDemo studentDemo = new StudentDemo();
        studentDemo.getAllStudentDetails();
    }
}
