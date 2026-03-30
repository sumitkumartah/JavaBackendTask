package com.DAO;

import com.DBCONNECTION.DBConnecttion;
import com.Entry.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class StudentDao {

    public void insertStudent(Student s){
        String query="insert into student values(?,?,?);";
        try {
            Connection con=DBConnecttion.establishConection();
            if(con==null){
                System.out.println("Connection Failed!");
                return;
            }
            PreparedStatement ps=con.prepareStatement(query);
            ps.setInt(1, s.getId());
            ps.setString(2,s.getName());
            ps.setInt(3, s.getMarks());
            System.out.println("Data insrted in table succesfully");
            ps.execute();//execute the query
            con.close();//close the connection
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void readStudent(Scanner sc){
        String query="Select * from student";
        try{
            Connection con=DBConnecttion.establishConection();
            if(con==null){
                System.out.println("Connection Failed!");
                return;
            }

            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                System.out.print(rs.getInt("id")+" - ");
                System.out.print(rs.getString("name")+" - ");
                System.out.println(rs.getInt("marks"));
            }
            con.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }




    public void updateStudent(Scanner sc){
        String UPDATE_NAME="update student set name=? where id=?";
        String UPDATE_MARKS="update student set marks=? where id=?";
        try {
          Connection con=DBConnecttion.establishConection();
          if(con==null){
            System.out.println("Connection Failed!");
            return;
          }

          System.out.print("Enter your id: ");
          int id=sc.nextInt();
          System.out.println("\n1. Update name\n2. Update marks");
          System.out.print("Enter your choice:  ");
          int choice =sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter new name: ");
                    String name = sc.nextLine();
                    PreparedStatement ps=con.prepareStatement(UPDATE_NAME);
                    ps.setString(1,name);
                    ps.setInt(2,id);
                    int rows = ps.executeUpdate();
                    if (rows > 0)
                        System.out.println("Name updated successfully for id " + id);
                    else
                        System.out.println("ID not found!");

                    break;
                case 2:
                    System.out.print("Enter new marks: ");
                    int marks = sc.nextInt();
                    PreparedStatement pss=con.prepareStatement(UPDATE_MARKS);
                    pss.setInt(1,marks);
                    pss.setInt(2,id);
                    int rows1 = pss.executeUpdate();  //check changes are done or not
                    if (rows1 > 0)
                        System.out.println("Marks updated successfully for id " + id);
                    else
                        System.out.println("ID not found!");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    return;

            }
            con.close();//close the connection
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteStudent(Scanner sc){
        String query="DELETE FROM student WHERE id=?";
        System.out.print("Enter the id you want to delete: ");
        int id=sc.nextInt();
        try{
            Connection con=DBConnecttion.establishConection();
            PreparedStatement ps=con.prepareStatement(query);
            ps.setInt(1,id);
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Student deleted successfully for id " + id);
            } else {
                System.out.println("ID not found!");
            }
            con.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }


}
