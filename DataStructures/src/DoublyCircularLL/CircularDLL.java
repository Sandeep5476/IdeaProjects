package DoublyCircularLL;

public class CircularDLL {
    private Node head,tail;
    private int size;

    Node insertAtBegin(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=newNode;
            tail=newNode;
            head.next=head;
            head.prev=head;
            size++;
            return head;
        }
        newNode.next=head;
        newNode.prev=tail;
        head.prev=newNode;
        tail.next=newNode;
        head=newNode;
        size++;
        return head;
    }
    Node insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=newNode;
            tail=newNode;
            head.next=head;
            head.prev=head;
            size++;
            return head;
        }
        newNode.next=head;
        newNode.prev=tail; //newNode.prev=head.prev;
        tail.next=newNode; //head.prev.next=newNode;
        head.prev=newNode;
        tail=newNode;      //comment this line
        size++;
        return head;
    }
    Node insertAtPosition(int data,int pos){
        if(pos <= 0){
            System.out.println("position is not valid. So cannot insert.");
            return head;
        }
        if(pos == 1){
            return insertAtBegin(data);
        }
        Node temp=head;
        Node newNode = new Node(data);
        int curPos=1;
        do{
            if(curPos == pos){
                break;
            }
            temp=temp.next;
            curPos++;
        }while(temp!=head);
        if(temp == head){
            System.out.println("Position is not valid. so cannot insert.");
            return head;
        }
        Node prevNode=temp.prev;
        newNode.next=temp;
        newNode.prev=prevNode;
        prevNode.next=newNode;
        temp.prev=newNode;
        size++;
        return head;
    }
    Node insertAfterValue(int data, int value){
        Node newNode = new Node(data);
        if(head == null){
            System.out.println("No such value exists. so cannot insert.");
            return head;
        }
        if(head.data == value){
            //Node nextNode = head.next;
            newNode.next=head.next;
            newNode.prev=head;
            head.next.prev=newNode;
            head.next=newNode;
            size++;
            return head;
        }
        Node temp=head;
        boolean found = false;
        do{
            if(temp.data == value){
                found=true;
                break;
            }
            temp=temp.next;
        }while(temp != head);

        if (!found) {
            System.out.println("Value " + value + " not found. Cannot insert.");
            return head;
        }
        Node nextNode=temp.next;
        newNode.next=nextNode;
        newNode.prev=temp;
        temp.next=newNode;
        nextNode.prev=newNode;
        size++;
        return head;
    }

    Node DeleteAtBegin(Node head){
        if(head == null){
            System.out.println("List is empty so you cannot delete.");
            return head;
        }
        if(head.next == head){ //list containing only one node
            head.next=null;
            head.prev=null;
            head=null;
            tail=null;
            size--;
            return head;
        }
        Node temp=head;
        head=head.next;
        head.prev=temp.prev;
        temp.prev.next=head;
        temp.next=null;
        temp.prev=null;
        size--;
        return head;
    }
    Node deleteAtEnd(Node head){
        if(head == null){
            System.out.println("List is empty so you cannot delete.");
            return head;
        }
        if(head.next == head){ //list containing only one node
            head.next=null;
            head.prev=null;
            head=null;
            tail=null;
            size--;
            return head;
        }
        Node temp=head.prev;
        temp.prev.next=head;
        head.prev=temp.prev;
        tail=temp.prev;//if tail is present
        temp.next=null;
        temp.prev=null;
        size--;
        return head;
    }
    Node deleteAtPosition(Node head,int pos){
        if(head == null){
            System.out.println("List is empty so you cannot delete.");
            return null;
        }
        if(pos == 1){
            return DeleteAtBegin(head);
        }
        if(pos <= 0 || pos > size){
            System.out.println("Invalid position");
            return head;
        }
        Node temp=head;
        int curPos=1;
        do{
            if(curPos == pos){
                break;
            }
            temp=temp.next;
            curPos++;
        }while(temp != head);
        if(temp == head){
            System.out.println("Invalid position.");
        }
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
        temp.prev=null;
        temp.next=null;
        size--;
        return head;
    }
    Node deleteByValue(Node head,int value){
        if(head == null){
            System.out.println("List is empty so you cannot delete.");
            return null;
        }
        if(head.data==value){
            return DeleteAtBegin(head);
        }
        Node temp=head;
        do{
            if(temp.data == value){
                break;
            }
            temp=temp.next;
        }while(temp != head);
        if(temp == head){
            System.out.println("Given value is not present in the list.");
            return head;
        }
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
        temp.prev=null;
        temp.next=null;
        size--;
        return head;
    }

    void traverseCDLL(Node head){
        if(head == null){
            System.out.println("List is empty.");
            return;
        }
        Node temp=head;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        }while(temp != head);
        System.out.println();
    }
    void reverseTraverseCDLL(Node head){
        if(head == null){
            System.out.println("List is empty.");
            return;
        }
        Node temp=head.prev;
        do{
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }while(temp != head.prev);
        System.out.println();
    }
    public static void main(String[] args) {
        Node head=null;
        CircularDLL cdll = new CircularDLL();
        head=cdll.insertAtEnd(100);
        head=cdll.insertAtEnd(200);
        head=cdll.insertAtEnd(300);
        cdll.traverseCDLL(head);
//        head=cdll.deleteAtPosition(head,4);
//        cdll.traverseCDLL(head);
        head=cdll.deleteByValue(head,300);
        cdll.traverseCDLL(head);
//        head=cdll.deleteAtEnd(head);
//        cdll.traverseCDLL(head);
//        head=cdll.DeleteAtBegin(head);
//        cdll.traverseCDLL(head);
       // head=cdll.insertAtPosition(555,4);
//        cdll.traverseCDLL(head);
//        head=cdll.insertAfterValue(666,400);
//        cdll.traverseCDLL(head);

    }
}
