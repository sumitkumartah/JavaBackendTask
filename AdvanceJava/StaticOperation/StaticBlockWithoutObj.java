package StaticOperation;
class Mobile1{
    String brand;
    int price;
    static  String name;

    //static block called once
    static{
        name="Apple";
        System.out.println(" Within static block");
    }
    //constructor called every time when I create obj
    Mobile1(){
        brand="Mobile";
        price=200;
        System.out.println(" Within constructor");
    }
    public void show(){
        System.out.println(brand+" : "+price+" : "+name);
    }
}
public class StaticBlockWithoutObj {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("StaticOperation.Mobile1");
        //here I am not creating object but the static block will call using this method
    }
}


