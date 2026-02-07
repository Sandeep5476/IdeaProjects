package LeetCode;

public class PalindromeLL {
    static Node head;
    static Node convertToLL(int[] arr){
        head = new Node(arr[0]);
        Node temp=head;
        for(int i=1;i<arr.length;i++){
            Node newNode = new Node(arr[i]);
            temp.next=newNode;
            temp=newNode;
        }
        return head;
    }
    static void traversal(Node head){
        if(head == null){
            //System.out.println("List is empty");
            return;
        }
        Node temp;
        temp=head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("end");

    }
    static Node middle(Node head){
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    static Node reverse(Node head){
        Node prev=null;
        Node cur=head;
        Node nextNode=null;
        while(cur != null){
            nextNode=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nextNode;
        }
        return prev;
    }
    static boolean palindrome(Node head){
        //reverse the second half
        Node secondHead=reverse(middle(head));
        //make reference on first half
        Node firstHead=head;
        while(secondHead != null){
            if(firstHead.data != secondHead.data){
                return false;
            }
            firstHead=firstHead.next;
            secondHead=secondHead.next;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,2,1};
        Node head= convertToLL(arr);
        traversal(head);
        System.out.println(palindrome(head));
    }
}
