package MyPackage1;

public class BankAccountMain {
    public static void main(String[] args){
     BankAccount SandeepAccount = new BankAccount();
     SandeepAccount.setAccountName("Sandeep Korrapati");
     SandeepAccount.setAccountNumber("icici-12345");
     SandeepAccount.setPhoneNumber(9381574396L);

     SandeepAccount.displayDetails();
     SandeepAccount.deposit(1000);
     SandeepAccount.withdraw(500);
    }
}
