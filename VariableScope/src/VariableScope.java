
// static variables are shared but instance variables are unique to each object
public class VariableScope {
    static double accountBalance = 0;
    String name;

    void setBalance(double balance){
        accountBalance = balance;
    }

    void getBalance(){
        System.out.println(name);
        System.out.println(accountBalance);
    }
    public static void main(String[] args) {
      VariableScope obj1 = new VariableScope();
      VariableScope obj2 = new VariableScope();
      obj1.name = "sandeep";
      obj2.name = "jiya";
      obj1.setBalance(100000.987);
      obj2.setBalance(200000.99);
      obj1.getBalance();
      obj2.getBalance();
    }
}
