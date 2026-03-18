package AnonymousObject;

import java.sql.SQLOutput;

//anonymous object is an object that is created but not assigned to a reference variable
class A{

    //constructor
    A(){
        System.out.println("Constructor Called....");
    }

    //method
    void show(){
        System.out.println("This is show method under A class");
    }
}
public class Anonymous {

    public static void main(String[] args) {

        //anonymous object created
        new A().show();
        new A().show();

        //both are different object not same object
    }
}
