package InnerClass;
class B{
    void show(){
        System.out.println("This is show method");
    }

    static class InnnerClass {
        void method(){
            System.out.println("This is inner class  static method");
        }
    }
}
public class StaticInnerClassMain {

    public static void main(String[] args) {
        //for accessing class A -> show method
        B ob=new B();
        ob.show();

        //For accessing static inner class
        // we don’t need an Outer object here
        B.InnnerClass ob2=new B.InnnerClass();
        ob2.method();
    }
}
