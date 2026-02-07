package CircularLinkedLists;

public class CircularLL {
    private Node head;
    private Node tail;
    private int size;

    Node insertAtBegin(int data){
        Node newNode = new Node(data);
//        if(head == null){
//           head=newNode;
//           tail=newNode;
//           head.next=head;
//           size++;
//           return head;
//        }

        //case 1: both tail and head exist
       /* tail.next=newNode;
        newNode.next=head;
        head=newNode;
        size++;
        return head;*/

        //case 2: having only head
        /*Node temp=head;
        do{
            temp=temp.next;
        }while(temp.next != head);

        temp.next=newNode;
        newNode.next=head;
        head=newNode;
        size++;
        return head;*/

        //case3: having only tail
        if(tail == null){
            tail=newNode;
            tail.next=tail;
            size++;
            return tail;
        }
        head=tail.next;
        newNode.next=head;
        tail.next=newNode;
        head=newNode;
        size++;
        return head;
    }
    Node insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            head.next=head;
            size++;
            return head;
        }
        //having both tail and head
        tail.next=newNode;
        newNode.next=head;
        tail=newNode;
        size++;
        return head;
    }
    Node insertBeforePosition(int data,int pos){
        Node newNode = new Node(data);
        if(pos <= 0){
            System.out.println("Invalid position and insertion is not possible.");
            return head;
        }
        if(pos == 1){
            return insertAtBegin(data);
        }
        Node temp=head;
        Node prevNode=null;
        int curPos=1;
        do{
            if(curPos == pos){
                break;
            }
            prevNode=temp;
            temp=temp.next;
            curPos++;
        }while(temp != head);
        if(temp == head){
            System.out.println("Not a valid position So can not insert.");
            return head;
        }
        newNode.next=prevNode.next;
        prevNode.next=newNode;
        size++;
        return head;
    }
    Node AfterValue(int data,int value){
        Node newNode = new Node(data);
        if(head == null){
            System.out.println("No such value exists.");
            return head;
        }
        if(head.data == value){
            newNode.next=head.next;
            head.next=newNode;
            size++;
            return head;
        }
        Node temp=head;
        do{
            if(temp.data == value){
                break;
            }
            temp=temp.next;
        }while(temp != head);
        if(temp == head){
            System.out.println("No such value exists.");
            return head;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        size++;
        return head;
    }

    Node deleteFromHead(Node head){
        if(head == null){
            System.out.println("List is empty so you cannot delete.");
            return head;
        }
        if(head.next==head){
            head.next=null;
            head=null;
            tail=null;
            size--;
            return head;
        }
        //case1: having both tail and head
        /* Node temp=head;
        tail.next=head.next;
        head=head.next;
        temp.next=null;
        size--;
        return head; */

        //case 2: we have only head
        Node temp=head;
        while(temp.next != head){
            temp=temp.next;
        }
        temp.next=head.next;
        head.next=null;
        head=temp.next;
        size--;
        return head;
    }
    Node deleteFromEnd(Node head){
        if(head == null){
            System.out.println("List is empty so you cannot delete.");
            return head;
        }
        if(head.next == head){
            head.next=null;
            head=null;
            tail=null;
            size--;
            return head;
        }
        //case1: we have both tail and head
        /* Node temp=head;
        Node prevNode=null;
        do{
            prevNode=temp;
            temp=temp.next;
        }while(temp.next != head);
        prevNode.next=temp.next;
        tail=prevNode;
        temp.next=null;
        size--;
        return head;*/

        //you can also write  following code instead of above
        Node temp=head;
        while(temp.next.next != head){
            temp=temp.next;
        }
        Node nextNode=temp.next;
        temp.next=nextNode.next;
        nextNode.next=null;
        tail=temp;
        size--;
        return head;
    }
    Node deleteFromPos(Node head,int pos){
        if(head == null){
            System.out.println("List is empty so you cannot delete.");
            return head;
        }
        if(pos == 1){
            return deleteFromHead(head);
        }
        Node temp=head;
        Node prevNode=null;
        int curPos=1;
        do{
            if(curPos == pos){
                break;
            }
            prevNode=temp;
            temp=temp.next;
            curPos++;
        }while(temp != head);
        if(temp == head){
            System.out.println("Not a valid position so you cant delete.");
            return head;
        }
        prevNode.next=temp.next;
        temp.next=null;
        size--;
        return head;
    }
    Node deleteByValue(Node head,int value){
        if(head == null){
            System.out.println("List is empty so you cannot delete.");
            return head;
        }
        if(head.data == value){
            return deleteFromHead(head);
        }
        Node temp=head;
        Node prevNode=null;
        do{
            if(temp.data == value){
                break;
            }
            prevNode=temp;
            temp=temp.next;
        }while (temp != head);
        if(temp == head){
            System.out.println("No such value exist so deletion is not possible.");
            return head;
        }
        prevNode.next=temp.next;
        temp.next =null;
        size--;
        return head;
    }

    int countNodes(Node head){
        if(head == null){
            return 0;
        }
        Node temp=head;
        int count=0;
        do{
            count++;
            temp=temp.next;
        }while (temp!=head);
        return count;
    }
    boolean SearchNode(Node head,int value){
        if(head == null){
            return false;
        }
        Node temp=head;
        do{
            if(temp.data == value){
                return true;
            }
            temp=temp.next;
        }while(temp != head);
        return false;
    }
    int SearchPosition(Node head,int value){
        if(head == null){
            return -1;
        }
        Node temp=head;
        int position=1;
        do{
            if(temp.data == value){
                return position;
            }
            temp=temp.next;
            position++;
        }while(temp != head);
        return -1;
    }

    //use singly linked list traverse method.
    Node convertToNormal(Node head){
        if(head == null){
            return head;
        }
        Node temp=head;
        while(temp.next != head){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    Node reverseCLL(Node head){
        if(head == null || head.next == head){
            return head;
        }
        Node temp=head;
        Node prevNode=null;
        Node nextNode=null;
        do{
            nextNode=temp.next;
            temp.next=prevNode;
            prevNode=temp;
            temp=nextNode;

        }while(temp != head);
        head.next=prevNode;
        head=prevNode;
        return head;
    }
    //traversal for sll
    void traversalsll(){
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
    //traversal for cll
    void traversal(Node head){
        if(head==null){
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

    public static void main(String[] args) {
        CircularLL cll = new CircularLL();
        Node head=null;
        head=cll.insertAtEnd(18);
        head=cll.insertAtEnd(19);
        head=cll.insertAtEnd(20);
        head=cll.insertAtEnd(21);
        cll.traversal(head);
        head=cll.AfterValue(222,22);
        cll.traversal(head);
//        System.out.println(cll.head.data);
//        System.out.println(cll.tail.data);
//        head=cll.insertAtBegin(8);
//        head=cll.insertAtEnd(100);
//        cll.traversal(head);
//        head=cll.reverseCLL(head);
//        cll.traversal(head);
//        head=cll.convertToNormal(head);
//        cll.traversalsll();
//        int result = cll.SearchPosition(head,1001);
//        System.out.println(result);
//        boolean result=cll.SearchNode(head,88);
//        System.out.println(result);
//        int result=cll.countNodes(head);
//        System.out.println(result);
//        head=cll.insertBeforePosition(108,5);
//        cll.traversal(head);
//        cll.AfterValue(88,9);
//        cll.traversal(head);
//        head=cll.deleteFromHead(head);
//        cll.traversal(head);
//        head=cll.deleteFromEnd(head);
//        cll.traversal(head);
//        head=cll.deleteFromPos(head,2);
//        cll.traversal(head);
//        head=cll.deleteByValue(head,8);
//        cll.traversal(head);
    }
}
