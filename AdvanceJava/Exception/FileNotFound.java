package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound {
    public static void main(String[] args) {
        try {
            method1();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    public static  void method1()throws FileNotFoundException{
      method2();
    }
    public static  void method2() throws FileNotFoundException{
         method3();
    }
    public static  void method3()throws FileNotFoundException{
      method4();
    }
    public static  void method4()throws FileNotFoundException{
         method5();
    }
    public static  void method5()throws FileNotFoundException {
        FileReader fileReader=new FileReader("A.txt");

    }
}

/*
Note- This is compile time exception(checked exception)  so in method5 exception arise so I use
      throws keyword and pass it to method4. method4 pass exception to method3 using
      throws. Like that I pass it upto main method and there I handle this exception using try-catch.

 ---> For runtime exception you can or can't use throws. Its not mandetory.

 */