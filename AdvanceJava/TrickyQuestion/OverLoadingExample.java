package TrickyQuestion;
class A{
    void method(Object o) {
        System.out.println("Object argument");
    }

    void method(String s) {
        System.out.println("String argument");
    }

    void method() {
        System.out.println("No argument");
    }
}
public class OverLoadingExample {
    public static void main(String[] args) {
        A obj=new A();
        obj.method(null); //Guess the output ????
    }
}




//Output -->  String argument

//- null is a literal in Java that represents “no object reference.”
//In Java, when multiple overloaded methods match a call, the compiler always picks the most specific one.
//null can be assigned to both Object and String.
//However, String is a subclass of Object. Therefore, String is more specific than Object.
//The compiler chooses method(String s) over method(Object o)




