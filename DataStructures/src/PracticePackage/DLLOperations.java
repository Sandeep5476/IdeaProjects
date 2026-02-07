package PracticePackage;

public class DLLOperations {
    static Node head;
    static Node tail;
    static int size;
    static Node insertAtBegin(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=newNode;
            tail=newNode;
            size++;
            return head;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        size++;
        return head;
    }
    static Node insertAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
           head=newNode;
           tail=newNode;
           size++;
           return head;
        }
        Node temp=head;
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
        size++;
        return head;
    }
    static Node insertBeforePosition(int data,int pos){
        Node newNode = new Node(data);
        if(pos <= 0){
            System.out.println("Position is not valid.");
            return head;
        }
        if(pos == 1){
           return insertAtBegin(data);
        }
        int curPos=1;
        Node temp=head;
        while(temp != null){
            if(curPos == pos){
                break;
            }
            temp=temp.next;
            curPos++;
        }
        if(temp == null){
            System.out.println("Position is not valid.");
            return head;
        }
        Node prevNode=temp.prev;
        newNode.prev=prevNode;
        prevNode.next=newNode;
        newNode.next=temp;
        temp.prev=newNode;
        size++;
        return head;
    }
    static Node insertAfterPosition(int data, int pos) {
        if (pos <= 0) {
            System.out.println("Position is not valid");
            return head;
        }

        if (head == null) {
            System.out.println("List is empty");
            return head;
        }

        Node temp = head;
        int curPos = 1;

        // Move temp to the node at position 'pos'
        while (temp != null && curPos < pos) {
            temp = temp.next;
            curPos++;
        }

        if (temp == null) {
            System.out.println("Position is not valid");
            return head;
        }

        Node newNode = new Node(data);
        Node next = temp.next;

        // Insert after temp
        newNode.prev = temp;
        newNode.next = next;
        temp.next = newNode;

        // If not inserting after last node
        if (next != null) {
            next.prev = newNode;
        }

        size++;
        return head;
    }
    static Node insertAfterValue(int data,int val){
        Node newNode = new Node(data);
        if(head == null){
            System.out.println("NO such element is found cannot insert.");
            return head;
        }
        Node temp=head;
        while(temp != null && temp.data != val){
            temp=temp.next;
        }
        if(temp == null){
            System.out.println("element is not found. cannot insert");
            return head;
        }
        Node next=temp.next;
        newNode.prev=temp;
        temp.next=newNode;
        newNode.next=next;
        next.prev=newNode;
        size++;
        return head;
    }


    static void traverseDll(Node head){
        Node temp=head;
        if(head == null){
            System.out.println("LIst is empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        head=insertAtEnd(88);
        head=insertAtEnd(98);
        head=insertAtEnd(108);
        head=insertAtEnd(118);
        head=insertAfterValue(888,88);
        traverseDll(head);



    }
}
