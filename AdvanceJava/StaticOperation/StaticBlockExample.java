package StaticOperation;

class Mobile{
    String brand;
    int price;
    static  String name;

    //static block called once
    static{
        name="Apple";
        System.out.println(" Within static block");
    }
    //constructor called every time when I create obj
    Mobile(){
        brand="Mobile";
        price=200;
        System.out.println(" Within constructor");
    }
    public void show(){
        System.out.println(brand+" : "+price+" : "+name);
    }
}

public class StaticBlockExample {

    public static void main(String[] args) {
        Mobile obj1=new Mobile();
        Mobile obj2=new Mobile();

        obj1.show();
        obj2.show();
    }
}


//Output-->

//Within static block
//Within constructor
//Within constructor
//Mobile : 200 : Apple
//Mobile : 200 : Apple