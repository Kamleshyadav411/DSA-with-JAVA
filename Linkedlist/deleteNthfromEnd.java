import java.util.*;

public class deleteNthfromEnd{
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


// deleteNthfromEnd function  O(n)
   
public void deleteNthfromEnds(int n){
    int sz = 0;
    Node temp = head;
    while (temp != null){
        temp = temp.next;
        sz++;
    }
    if( n == sz){
        head = head.next; // remove First
        return ; 
    }

    //sz-n
    int i=1;
    int itofnd  = sz -n;
    Node prev = head;
    while (i < itofnd){
        prev = prev.next;
        i++;
    }
    prev.next = prev.next.next;
    return ;

    
}






    public static void main(String args[]){
        deleteNthfromEnd ll = new deleteNthfromEnd();
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addfirst(0);
        ll.printll();
        ll.deleteNthfromEnds(2);
        ll.printll();
         

}
}



