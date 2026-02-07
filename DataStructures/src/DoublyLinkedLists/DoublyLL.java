package DoublyLinkedLists;

public class DoublyLL {
    private Node head;
    private Node tail;
    private int size;

    Node insertAtBeginning(int data){
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

    Node insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=newNode;
            tail=newNode;
            size++;
            return head;
        }
        //case1: when we have tail
//        tail.next=newNode;
//        newNode.prev=tail;
//        tail=newNode;
//        size++;
//        return head;

        //case 2: if tail is not present
        Node temp=head;
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
        size++;
        return head;
    }

    Node insertBeforePosition(int data,int pos){
        if(pos <= 0){
            System.out.println("Position is not valid. So cannot insert.");
            return head;
        }
        if(pos == 1){
            return insertAtBeginning(data);
        }
        Node newNode= new Node(data);
        Node temp=head;
        int curPos=1;
        while(temp != null){
            if(curPos == pos){
                break;
            }
            temp=temp.next;
            curPos++;
        }
        if(temp == null){
            System.out.println("position is not valid");
            return head;
        }
        Node prevNode;
        prevNode = temp.prev;
        newNode.next=temp;
        temp.prev=newNode;
        newNode.prev=prevNode;
        prevNode.next=newNode;
        size++;
        return head;
    }

    Node insertAfterValue(int data,int val){
        if(head == null){
            System.out.println("No such value exists so cannot insert");
            return head;
        }
        Node newNode = new Node(data);
        Node temp = head;
        while(temp != null && temp.data != val){
            temp=temp.next;
        }
        if(temp == null){
            System.out.println("No such value exists so cannot insert");
            return head;
        }
        Node nextNode=temp.next;
        newNode.next=nextNode;
        newNode.prev=temp;
        temp.next=newNode;
        if(nextNode != null){
            nextNode.prev = newNode;
        }
        size++;
        return head;
    }

    Node deleteFromBeginning(){
        if(head == null){
            System.out.println("List is empty.");
            return head;
        }
        if(head.next == null){ //list containing only one element
            head=null;
            tail=null;
            size--;
            return head;
        }
        Node prevNode;
        prevNode = head;
        head=head.next;
        head.prev=null;
        prevNode.next=null;
        size--;
        return head;
    }

    Node deleteFromEnd(){
        if(head == null){
            System.out.println("List is empty.");
            return head;
        }
        if(head.next==null){ //list containing single node
            head=null;
            tail=null;
            size--;
            return head;
        }
        Node temp=head;
        while(temp.next != null){
            temp=temp.next;
        }
        Node prevNode;
        prevNode=temp.prev;
        prevNode.next=null;
        temp.prev=null;
        size--;
        return head;
    }

    Node deleteFromPosition(int pos){
        if(head == null){
            System.out.println("List is empty. so cannot delete.");
            return head;
        }
        if(pos <= 0){
            System.out.println("Position is not valid.");
            return head;
        }
        if(pos == 1){
            return deleteFromBeginning();
        }
        Node temp=head;
        int curPos=1;
        while (temp != null){
            if(curPos == pos){
                break;
            }
            temp=temp.next;
            curPos++;
        }
        if(temp == null){ // if position is last one
            System.out.println("Given position is not valid so cannot delete.");
            return head;
        }
        Node prevNode,nextNode;
        prevNode=temp.prev;
        nextNode=temp.next;
        prevNode.next=temp.next;
        if(nextNode != null){ //if position is last one
            nextNode.prev=prevNode;
            temp.next=null;
        }
        temp.prev=null;
        size--;
        return head;
    }

    Node deleteValue(int val){
        if(head == null){
            System.out.println("List is empty deletion is not possible.");
            return head;
        }
        if(head.data == val){
            return deleteFromBeginning();
        }
        Node temp=head;
        while(temp != null && temp.data != val){
            temp=temp.next;
        }
        if(temp == null){
            System.out.println("NO such value exist in the list.");
            return head;
        }
        Node prevNode=temp.prev;
        prevNode.next=temp.next;
        if(temp.next != null){
            temp.next.prev=prevNode;
            temp.next=null;
        }
        temp.prev=null;
        size--;
        return head;
    }

    void reverseTraverse(Node head){
        Node temp=head;
        if(head == null){
            System.out.println("List is empty.");
        }
        else{
            while(temp.next != null){
                temp=temp.next;
            }
        }
        while(temp != null){
            System.out.print(temp.data+" ");
            temp=temp.prev;

        }
    }

    //coding exercises
    int countNodes(Node head){
        if(head == null){
            return 0;
        }
        int count=0;
        Node temp=head;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    boolean searchDll(Node head,int value){
        if(head == null){
            return false;
        }
        //case 1: we have only head
       /* Node temp=head;
        while(temp != null){
            if(temp.data == value){
                return true;
            }
            temp=temp.next;
        }
        return false;*/

        //case 2: having tail and head
        while(head != tail && head.prev != tail){
            if(head.data == value || tail.data == value){
                return true;
            }
            head=head.next;
            tail=tail.prev;
        }
        if(head == tail && head.data == value){
            return true;
        }
        return false;
    }
    Node reverseDll(Node head){ //work fine for morethan one element
        if(head == null){
            System.out.println("list is empty.");
        }
        Node temp=head;
        Node current=null;
        while(temp != null){
            current=temp.prev;
            temp.prev=temp.next;
            temp.next=current;
            temp=temp.prev;
        }
        head=current.prev;
        return head;
    }
    boolean isPalindrome(Node head){
        if(head == null){
            return false;
        }
        while (head.prev != tail && head != tail){
            if(head.data != tail.data){
                return false;
            }
            head=head.next;
            tail=tail.prev;
        }
        return true;
    }

    void traversalDLL(Node head){
        if(head == null){
            System.out.println("List is empty.");
        }else{
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        Node head;
        head=dll.insertAtEnd(9);
        head=dll.insertAtEnd(10);
        head=dll.insertAtEnd(11);
        head=dll.insertAtEnd(12);
        dll.traversalDLL(head);
        head=dll.insertAfterValue(555,12);
        dll.traversalDLL(head);
       // System.out.println( dll.isPalindrome(head));
//        head=dll.reverseDll(head);
//        dll.traversalDLL(head);
        //System.out.println(dll.searchDll(head,7));

//        dll.reverseTraverse(head);
//        System.out.println();
//        System.out.println(dll.countNodes(head));
//        head=dll.insertAtEnd(11);
//        dll.traversalDLL(head);
//        head=dll.insertBeforePosition(33,3);
//        dll.traversalDLL(head);
//        head=dll.insertAfterValue(120,8);
//        dll.traversalDLL(head);
//        dll.reverseTraverse(head);
//        head=dll.deleteFromBeginning();
//        dll.traversalDLL(head);
//        head=dll.deleteFromEnd();
//        dll.traversalDLL(head);
//        head=dll.deleteFromPosition(1);
//        dll.traversalDLL(head);
//        head=dll.deleteValue(10);
//        dll.traversalDLL(head);
    }
}
