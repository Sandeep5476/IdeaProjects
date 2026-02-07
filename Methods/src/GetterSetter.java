public class GetterSetter {
    String empName;
    int empId;
    void setInfo(String name,int id){
        empName=name;
        empId=id;
    }
    void getInfo(){
        System.out.println("Your name is: "+empName);
        System.out.println("your Id is: "+empId);
    }
    public static void main(String[] args) {
     GetterSetter obj = new GetterSetter();
     obj.setInfo("sandeep",101);
     obj.getInfo();
    }
}
