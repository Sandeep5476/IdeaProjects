package Stacks;

public class StackUsingArrayMain {
    public static void main(String[] args)  {
        try {
            StackUsingArray stack = new StackUsingArray(1);
            stack.push(10);
            stack.push(20);
            stack.push(30);
            //traversing the elements
            while(!stack.isEmpty()){
                System.out.println(stack.pop());
            }
            System.out.println(stack.pop());
            System.out.println(stack.pop());
//            System.out.println(stack.pop());
//            System.out.println(stack.pop());
            System.out.println(stack.peek());
            System.out.println(stack.pop());
            System.out.println(stack.peek());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
