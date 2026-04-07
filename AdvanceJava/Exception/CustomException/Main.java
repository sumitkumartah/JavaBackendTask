package Exception.CustomException;

public class Main {
    public static void main(String[] args) {
        BankAccount ba=new BankAccount(3000);
        try {
            ba.withDraw(9000);
        } catch (InSufficientBalanceCustomException e) {
            System.out.println(e);
            System.out.println("Your total balance= "+e.getBalanace());
        }
    }
}
