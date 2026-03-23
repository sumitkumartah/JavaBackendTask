package InnerClass;
class A{
    void show(){
        System.out.println("This is show method");
    }

    class InnnerClas {
        void method(){
            System.out.println("This is inner class method");
        }
    }
}

public class InnerClassMain {
    public static void main(String[] args) {
        A obj=new A();
        obj.show();

        //by using obj.methodname you access non static members
        //same like obj.new InnerClass() you can access the innerclass
        A.InnnerClas obj1=obj.new InnnerClas();
        obj1.method();

    }
}
