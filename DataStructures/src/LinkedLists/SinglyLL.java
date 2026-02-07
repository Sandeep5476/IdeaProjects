package LinkedLists;

public class SinglyLL {
    private Node head;
    private Node tail;
    private int size;

    void insertAtBegin(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
        if(tail == null){
            tail=newNode;
        }
        size++;
    }

    //insert at end type 1(tail pointer exists)
    void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            insertAtBegin(data);
            return;
        }
        tail.next=newNode;
        tail=newNode;
        size++;
    }
    //insert at end type 2(tail pointer does not exists)
    void insertAtEnd1(int data){
        Node newNode = new Node(data);
        if(head == null){
            insertAtBegin(data);
            return;
        }
        Node temp;
        temp = head;
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next=newNode;
        size++;
    }

    //insert at specific position
    void insertAtPosition(int data,int pos){
        Node newNode = new Node(data);
        if(pos <= 0 || pos > size+1){
            System.out.println("Position is not valid");
            return;
        }
        if(head == null){
            if(pos == 1){
                insertAtBegin(data);
                return;
            }
        }
        int curposition=1;
        Node temp;
        temp=head;
        while(curposition < pos-1){
            temp=temp.next;
            curposition++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        size++;

    }
    void traversal(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp;
        temp=head;
        while(temp != null){
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public static void main(String[] args) {
       SinglyLL obj = new SinglyLL();
       obj.insertAtEnd(14);
       obj.insertAtEnd(10);
       obj.insertAtEnd(100);
       obj.insertAtPosition(2,5);
       obj.traversal();
    }
}
