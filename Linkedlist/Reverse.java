import java.util.*;

public class Reverse{
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


// reverse function  O(n)
   
public void reverse(){
    Node prev = null;
    Node curr = tail = head;  // jaava mein hamesha assignment right to left hota h esiliye pelhe head fir tail ayega
    Node next;

    while(curr != null){
        next = curr.next;
        curr.next = prev;   // yhi se reverse hoga mainly
        prev = curr;
        curr = next;
    }
    head = prev;

}






    public static void main(String args[]){
        Reverse ll = new Reverse();
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addfirst(0);
        ll.printll();
        ll.reverse();
        ll.printll();
         

}
}



