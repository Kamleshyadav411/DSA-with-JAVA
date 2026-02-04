import java.util.*;

public class Palindrome{
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


// Palindrome function  O(n)
   
//slow fast approach
public Node findMid(Node head){  // helper function to find mid
     Node slow = head;
     Node fast = head;

     while(fast != null && fast.next != null){
        slow = slow.next; // +1
        fast = fast.next.next; //+2

     }
     return slow; // slow is my midNode

}

public boolean checkpalindrom(){
    //base caase
    if(head == null || head.next == null){
        return true;
    }
    //find mid
    Node midNode = findMid(head);
    // reverse 2nd half
    Node prev = null;
    Node curr = midNode;
    Node next ;
    while(curr != null){
        next = curr.next;
        curr.next= prev;
        prev = curr;
        curr= next;
    }
    Node right = prev ; // right half head 
    Node left = head;
    // check left half and right half

    while(right != null){
        if(left.data != right.data){
            return false;
        }
        left = left.next;
        right = right.next;
    }
    return true;
}





    public static void main(String args[]){
        Palindrome ll = new Palindrome();
        ll.addfirst(4);
        ll.addfirst(1);
        ll.addfirst(0);
        ll.printll();
        System.out.println(ll.checkpalindrom());
        ll.printll();
         

}
}



