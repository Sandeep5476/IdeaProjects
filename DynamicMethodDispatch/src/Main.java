public class Main {
    public static void main(String[] args) {
        Person person;
        person = new Employee("joseph Kishore","12345 Assistant Professor");
        person.displayDetails();
        person = new Student("sandeep",5476);
        person.displayDetails();
        person.greet();


    }
}
