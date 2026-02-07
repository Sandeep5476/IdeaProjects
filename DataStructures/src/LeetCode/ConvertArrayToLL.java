package LeetCode;

public class ConvertArrayToLL {
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
    static void traverse(Node head){
        if(head==null){
            System.out.println("List is empty.");
            return;
        }
        Node temp;
        temp=head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("end");
    }
    public static void main(String[] args) {
        int[] arr = new int[]{10,22,33,55,66,77};
        Node head= convertToLL(arr);
        traverse(head);
    }
}
