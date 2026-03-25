package ENUM;
//Demo.java enum using here as in same package
public class Switch {
    public static void main(String[] args) {

        Status s = Status.Running;

        // Switch case for enum
        switch (s) {
            case Running:
                System.out.println("Application is running...");
                break;

            case Failed:
                System.out.println("Application failed!");
                break;

            case Pending:
                System.out.println("Application is pending...");
                break;

            case Success:
                System.out.println("Application executed successfully!");
                break;

            default:
                System.out.println("Unknown status");
        }
    }
}
