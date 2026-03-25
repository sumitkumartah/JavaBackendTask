package Interface;

@FunctionalInterface
interface  A{
    int add(int i, int j);
}
public class FunctionalInterfaceEx {
    public static void main(String[] args) {

        //using anonymous class
//        A obj=new A(){
//           public int add(int i, int j){
//                return i+j;
//            }
//
//        };


        //using lamda expression
        A obj=(i,  j)-> i+j;

        System.out.println(obj.add(8,9));
    }
}
