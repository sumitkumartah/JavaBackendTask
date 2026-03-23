package AnonymousInnerClass;

class A{
    void method(){
        System.out.println("This is a method under");
    }
    void method2(){
        System.out.println("Another method");
    }
}
public class Main {
    public static void main(String[] args) {
        A obj=new A(){
            @Override
            void method() {
                System.out.println("This is overriding method");
            }
            @Override
            void method2(){
                System.out.println("This is overriding method2");
            }
        };

        //here insted of creating subclass we override inside the object
        obj.method();
        obj.method2();
    }
}
