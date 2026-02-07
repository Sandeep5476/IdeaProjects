package JLJavaCollections;

import java.util.HashSet;
import java.util.Objects;

class Customer{
    String name;
    int id;
    Customer(String name,int id){
        this.id=id;
        this.name=name;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof Customer)) return false;
        Customer that = (Customer) o;
        return this.name.equals(that.name) && this.id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return name + '-' + id ;
    }
}
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Customer> set = new HashSet<>();
        Customer c1 = new Customer("Sandeep",21);
        Customer c2 = new Customer("Mahesh",22);
        Customer c3 = new Customer("Randy Orton",11);
        Customer c4 = new Customer("Sandeep",21);
        String str = "sandeep";
        System.out.println(c1.equals(str));
        set.add(c1);
        set.add(c2);
        set.add(c3);
        set.add(c4);//since it is a duplicate element though it was printing to overcome this, we need to override
                    //both hashcode and equals methods which are in object class
        System.out.println(set);
    }
}
