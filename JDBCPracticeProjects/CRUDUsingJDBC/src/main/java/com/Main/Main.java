package com.Main;

import com.DAO.StudentDao;
import com.DBCONNECTION.DBConnecttion;
import com.Entry.Student;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        StudentDao sd=new StudentDao();

       while(true){
           System.out.println("\n1. Insert\n2. Read\n3. Update\n4. Delete\n5. Exit");
           System.out.print("Enter your choice: ");
           int choice=sc.nextInt();

           switch (choice){

               //for insert operation....
               case 1:
                   System.out.println("Insert operation...");
                   System.out.print("Enter your Id: ");
                   int id=sc.nextInt();
                   sc.nextLine();
                   System.out.print("Enter your Name: ");
                   String name=sc.nextLine();
                   System.out.print("Enter your Marks: ");
                   int marks=sc.nextInt();
                    sd.insertStudent(new Student(id, name, marks));
                   break;


                   //for read operation
               case 2:
                   System.out.println("Read operation...");
                   sd.readStudent(sc);
                   break;

              //For update operation....
               case 3:
                   System.out.println("Update operation...");
                   sd.updateStudent(sc);
                   break;

               //For delete operation....
               case 4:
                   System.out.println("Delete operation...");
                   sd.deleteStudent(sc);
                   break;
               default:
                   System.out.println("Invalid choice!  Exiting...");
                   return;

           }


       }
    }
}