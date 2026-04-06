package Exception;

public class RunTimeException {
    public static void main(String[] args) {

        //arithmethic exception
        try {
            int i = 10;
            int ans = i / 0;
        }catch (ArithmeticException e){
            System.out.println("Arithmethic exception : You can't divide by zero!: msg:  "+e.getMessage());
           // e.printStackTrace();
        }

        System.out.println();

        //NullPointerException
        try{
            String str=null;
            int n=str.length();
        }catch (NullPointerException e){
            System.out.println("Null Pointer Exception: You tried to use an object that doesn't exist.  ...msg:"+e);
            //e.printStackTrace();
        }

        System.out.println();
        //ArrayIndexOutOfBoundsException

        try{
            int arr[]=new int[3];
            int num=arr[4];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Error: That index is out of range!  .....msg:"+e.getMessage());
            //e.printStackTrace();
        }
    }
}


//sout(e)  --> java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
//whole exception + msg is visible

//sout(e.getMessage())  ->Cannot invoke "String.length()" because "str" is null
//only msg will visible

