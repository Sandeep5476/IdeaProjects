package MyPackage1;

public class BankAccount {
    private String accountNumber;
    private String accountName;
    private double balance;
    private long phoneNumber;

    public void deposit(double howMuchMoney){
       if(howMuchMoney>0){
           this.balance += howMuchMoney;
           System.out.println("Deposited Rs. "+howMuchMoney+"\nCurrent Balance is: "+this.balance);
       }
       else{
           System.out.println("Please enter a valid amount!!!");
       }
    }
    public void withdraw(double howMuchMoney){
      if(howMuchMoney>=0){
          if(this.balance-howMuchMoney >= 0){
              this.balance -= howMuchMoney;
              System.out.println("withdraw amount is: "+howMuchMoney+"\nRemaining balance is: "+this.balance);
          }
          else{
              System.out.println("Insufficient Funds ... and your current balance is: "+this.balance);
          }
      }
      else{
          System.out.println("Please enter a valid amount!! and try again");
      }
    }
    //creating getter and setter methods for each field
    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }
    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountName(String accountName){
        this.accountName=accountName;
    }
    public String getAccountName(){
        return accountName;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }

    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public long getPhoneNumber(){
        return phoneNumber;
    }
    //displaying details
    public void displayDetails(){
        System.out.println("Account Holder name: "+this.accountName);
        System.out.println("Account Number: "+this.accountNumber);
        System.out.println("Phone No. : "+this.phoneNumber);
    }
}
