import java.util.*;

public class IterativeSearch{
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
    public int itrSearch(int key){    
        Node temp = head;
        int i= 0;
        while(temp != null){
            if(temp.data == key){ // found
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;  // not found
    }







    public static void main(String args[]){
        IterativeSearch ll = new IterativeSearch();
        ll.addfirst(2);
        ll.addfirst(1);
         ll.addfirst(0);
         ll.printll();
         System.out.println(ll.itrSearch(2));

}
}