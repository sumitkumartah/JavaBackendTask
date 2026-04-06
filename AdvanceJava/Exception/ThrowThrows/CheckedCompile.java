package Exception.ThrowThrows;

import java.io.FileNotFoundException;

public class CheckedCompile {
    public static void main(String[] args) {
           try {
               fun();
           }catch (Exception e){
               System.out.println(e);
           }
    }

    public static  void fun() throws Exception{
        fun2();
    }

    public static  void fun2() throws FileNotFoundException{
        throw new FileNotFoundException("File not found"); //here I throw checked exception so after throws is mandetory
    }
}
/*
Note - : throws is mandatory for checked exceptions(Compiletime exception), even if you use throw inside the method.

--> - Unchecked exceptions (RuntimeException, NullPointerException): throws is optional, even if you use throw.
--> - Checked exceptions:(FileNotFoundException) throws is mandatory if you don’t catch them inside the method.


 */