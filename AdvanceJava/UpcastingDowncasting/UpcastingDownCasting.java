package UpcastingDowncasting;
class A{
    void show1(){
        System.out.println("This is class A show1 method");
    }
}
class B extends A{
    void show2(){
        System.out.println("This is class B show2 method");
    }
}
public class UpcastingDownCasting {
    public static void main(String[] args) {

        //upcasting
        A obj=(A) new B();
        obj.show1();
        //obj.show2(); can't access the show2() now
        //created the object of B but using upcasting I converted to super class object
        //You are telling Java, I want to refer to this B object using a reference of type A.

        //Downcasting
        B newObj = (B) obj; // Downcasting
        newObj.show2();     // Now this works!
        //Converting a superclass reference back into a subclass reference
    }
}
