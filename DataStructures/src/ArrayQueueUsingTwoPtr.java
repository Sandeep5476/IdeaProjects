public class ArrayQueueUsingTwoPtr {
    private int[] queue;
    private int rear,front;

    public ArrayQueueUsingTwoPtr(int size){
        this.queue=new int[size];
        front=-1;
        rear=-1;
    }
    boolean isFull(){
        return rear == queue.length-1;
    }

    public void enqueue(int x){
        if(isFull()){
            System.out.println("Queue is full cannot insert.");
            return;
        }
        rear++;
        queue[rear]=x;
        if(front==-1){
            front++;
        }
    }


    public int dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty so cannot delete.");
        }
        if(front == rear){
          int removedElement = queue[front];
          front=-1;
          rear=-1;
          return removedElement; //printing removed element.
        }
        int removedElement=queue[front];
        front++;
        return removedElement; //printing removed element.
    }
    public boolean isEmpty(){
        return rear == -1 || front>rear;
    }

    //printing the front most element.
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("cannot peek the element.");
        }
        int i = queue[front];
        return i;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty.");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.print(queue[i]+" ");
        }
    }

    public static void main(String[] args) {
        try {
            ArrayQueueUsingTwoPtr queue = new ArrayQueueUsingTwoPtr(5);
            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);
            queue.enqueue(4);
            queue.enqueue(5);
            System.out.println();
            queue.display();
            queue.dequeue();
            queue.dequeue();
            queue.dequeue();
            queue.dequeue();
            queue.dequeue();
            queue.dequeue();
            queue.display();
        }catch(Exception e){
            System.out.println("Queue is empty so cannot delete.");
        }
    }



}
