package Exception.CustomException;

public class BankAccount {
   private double balance;
   public BankAccount(double balance){
       this.balance=balance;
   }

   public void withDraw(double amount) throws InSufficientBalanceCustomException{
       if(balance>amount){
           balance-=amount;
           System.out.println("Your Current bank Balance= "+balance);
       }else{
           throw new InSufficientBalanceCustomException(balance);
       }
   }
}
