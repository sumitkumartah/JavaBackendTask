package ENUM;

import java.sql.SQLOutput;

enum Status{
    Running, Failed, Pending, Success;
    //0        1      2         3      --> here follow 0 based
}

public class Demo {
    public static void main(String[] args) {
        Status s=Status.Running;
        System.out.println(s);  //running
        System.out.println(s.ordinal()); //0


        //get all the methods
        Status arr[]=Status.values();
        for(Status n: arr){
            System.out.println(n+"   "+n.ordinal());
        }
    }
}
