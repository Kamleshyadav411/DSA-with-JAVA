import java.util.*;

public class removeCycle{
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

// detect cycle
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



//   remove function  O(n)
    public static void removecycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                cycle = true;
                break;

            }
        }
        if( cycle =false){
            return;
        }

        // find meeting point 
        slow = head;
        Node prev = null; // last node

        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next.next;
        }

        // remove cycle
        prev.next = null;
    }






    public static void main(String args[]){
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        //1>2>3>2
        System.out.println(Detect());
        removecycle();
        System.out.println(Detect());

}
}