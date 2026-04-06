package Exception;

public class StackTrace {
    public static void main(String[] args) {
        try{
            level1();
        } catch (Exception e){
            StackTraceElement[] obj = e.getStackTrace();
            for (int i = 0; i < obj.length; i++) {
                System.out.println(obj[i]);
            }


        }

    }

    public static  void  level1(){
        level2();
    }
    public static  void  level2(){
        level3();
    }
    public static  void  level3(){
       level4();
    }
    public static  void  level4(){

            int arr[]=new int[5];
            arr[5]=100;

    }

}
