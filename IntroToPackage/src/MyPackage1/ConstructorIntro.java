package MyPackage1;

public class ConstructorIntro {
    private String accountNumber;
    private String accountName;
    private double balance;
    private long phoneNumber;

    //Constructor overloading
    //creating default constructor
    public ConstructorIntro(){
        this("accountnumber","Sandeep vanga",0.0,1234567890L);
        System.out.println("default constructor is being called");
//        this.accountNumber="UNKNOWN";
//        this.accountName="Unknown";
//        this.balance=123455;
//        this.phoneNumber=1234567890;
    }
    //creating  four parametrized constructor
    public ConstructorIntro(String accountNumber,String accountName,double balance,long phoneNumber){

        this.accountNumber=accountNumber;
        this.accountName=accountName;
        this.balance=balance;
        this.phoneNumber=phoneNumber;
        System.out.println("four parametrized constructor is being called ");
    }
    //creating three parametrized constructor
    public ConstructorIntro(String accountNumber,String accountName,double balance){
        this.accountNumber=accountNumber;
        this.accountName=accountName;
        this.balance=balance;
        System.out.println("Three parametrized constructor is being called");

    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void displayDetails(){
        System.out.println("Account Number: "+this.phoneNumber);
        System.out.println("Account Name: "+this.accountName);
        System.out.println("Balance: "+this.balance);
        System.out.println("Phone Number: "+this.phoneNumber);
    }

}
