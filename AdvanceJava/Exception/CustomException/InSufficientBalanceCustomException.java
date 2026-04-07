package Exception.CustomException;

public class InSufficientBalanceCustomException extends Exception{
    private double balance;
    public InSufficientBalanceCustomException(double balance){
        super("You don't have sufficient money ......what you want ???");
        this.balance=balance;
    }

    public double getBalanace() {
        return balance;
    }



    //If you don't want to pass message on the super then use toString
//    @Override
//    public String toString() {
//        return "You don't have sufficient money ......what you want ???";
//    }
}
