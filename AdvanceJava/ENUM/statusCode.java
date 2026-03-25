package ENUM;

import java.util.Scanner;

enum HttpStatus{
    OK(200, "Success"),
    BAD_REQUEST(400, "Bad Request"),
    UNAUTHORIZED(401, "Unauthorized"),
    NOT_FOUND(404, "Resource Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error"),
    BAD_GATEWAY(502, "Bad Gateway"),
    SERVICE_UNAVAILABLE(503, "Service Unavailable"),

    //here is no statuscode and message (for calling non parameterize constructor)
    NO_STATUS;

    private int code;
    private String message;


    HttpStatus() {
        code=33333;
        message="Its no status bro";
    }

    HttpStatus(int code, String message){
        this.code=code;
        this.message=message;
    }

    public int getCode(){
        return code;
    }
    public  String getMessage(){
        return message;
    }
}
public class statusCode {
    public static void  statusMessage(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter status code: ");
        int n=sc.nextInt();
        for(HttpStatus hs: HttpStatus.values()){
            if(hs.getCode()==n){
                System.out.println("Yahh!!   got the status message-->");
                System.out.println(hs.getMessage());
            }
        }
    }
    public static void main(String[] args) {

        statusMessage();//tsking input and print the status message
        System.out.println();
        System.out.println("Printing all status code: ");
        for(HttpStatus hs: HttpStatus.values()){
            System.out.println(hs.getCode()+ "  "+ hs.getMessage());
        }
    }
}
