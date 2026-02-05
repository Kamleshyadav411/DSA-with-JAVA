import java.util.*;

public class DetectaCycle{
    public static class Node{
        int data;
        Node next;

        public Node (int data){
            this.data=data;
            this.next=null;
    }
    
}

public static Node head;
public static Node tail;




public void addfirst(int data){  //O(1) - TC
        //create new node 
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }
        
        //newNode next = head
        newNode.next = head; //link

        //head = newNode
        head= newNode;

 }

 public void printll(){
        //base case
        if(head == null){
            System.out.println("ll is empty");
            return;
        }

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }


// search function  O(n)
    public static boolean Detect(){  // floyd cycle finding algo
        Node slow = head;  
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        if(slow == fast){
            return true;
        }
        
        }
        return false;
    }







    public static void main(String args[]){
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        System.out.println(Detect());

}
}