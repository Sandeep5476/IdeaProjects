package Stacks;

public class StackUsingArray {
    protected int[] stackArray;
    protected int top;
    protected int maxSize;

    public StackUsingArray(int size){
        maxSize=size;
        stackArray = new int[size];
        top=-1;
    }
    public void resize(){
        maxSize=maxSize*2;
        int[] newArray = new int[maxSize];
        for(int i=0;i<stackArray.length;i++){
            newArray[i]=stackArray[i];
        }
        stackArray=newArray;
    }
    public void push(int element){
        if(isFull()){
            resize();
//            System.out.println("cannot insert because stack is full.");
//            return;
        }
        top++;
        stackArray[top]=element;
    }
    boolean isFull(){
        if(top==stackArray.length-1){
            return true;
        }
        return false;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot pop because stack is empty.");
//            System.out.println("Cannot pop because stack is empty.");
//            return -1;
        }
        int x=stackArray[top];
        top--;
        return x;
    }
    boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }
    int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot peak because stack is empty.");
        }
        int x=stackArray[top];
        return x;
    }
}
