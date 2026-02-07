package Stacks;

public class StacksUsingLL {
  private Node top;
  public StacksUsingLL(){
      this.top=null;
  }

  public void push(int value){
      Node newNode = new Node(value);
      newNode.next=top;
      top=newNode;
  }
  public int pop() throws Exception{
      if (isEmpty()) {
          throw new Exception("Cannot pop because list is empty.");
      }
          int x = top.data;
          top = top.next;
          return x;
      }
      boolean isEmpty(){
        return top==null;
      }

      public int peek() throws Exception{
      if(isEmpty()){
          throw new Exception("Cannot peek list is empty.");
      }
          return top.data;  //int x=top.data;return x;

      }

    public static void main(String[] args) {
        try {
            StacksUsingLL stack = new StacksUsingLL();
            stack.push(12);
//            stack.push(22);
//            stack.push(222);
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.peek());
//            System.out.println(stack.pop());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
