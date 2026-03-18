package UpcastingDowncasting;

public class Typecasting {
    public static void main(String[] args) {
        double d=4.5;
        int a=(int) d;

        //I can't convert double to int directly so I use (int) to forcefully do that
        //(int) d  -> here forcefully I  convert double to integer as a result
        // d was 4.5 but after converting output will be 4

        System.out.println(a);

    }
}
