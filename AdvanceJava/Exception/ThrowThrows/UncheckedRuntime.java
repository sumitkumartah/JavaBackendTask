package Exception.ThrowThrows;

public class UncheckedRuntime {
    public static void main(String[] args) {
        method1();
    }

    public static  void method1(){
       method2();
    }

    public static  void method2(){
        throw new NullPointerException("Null value found!");  //here I throw unchecked exception so throws in not mandetory
    }
}

/*
Note - : throws is not mandatory for unchecked exceptions(Runtime exception), even if you use throw inside the method.
--> - Unchecked exceptions (RuntimeException, NullPointerException): throws is optional, even if you use throw.
--> - Checked exceptions:(FileNotFoundException) throws is mandatory if you don’t catch them inside the method.
 */