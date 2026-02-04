import java.util.*;

public class recursiveSrch{
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
   public int helper(Node head , int key){
    if(head == null){
        return -1;
    }
    if(head.data==key){
        return 0;
    }

    int idx = helper(head.next  , key);

    if(idx == -1){
        return -1;
    }
    return idx+1;
   }


   public int recSearch(int key){
    return helper(head , key);
   }







    public static void main(String args[]){
        recursiveSrch ll = new recursiveSrch();
        ll.addfirst(2);
        ll.addfirst(1);
         ll.addfirst(0);
         ll.printll();
         System.out.println(ll.recSearch(5));

}
}



//ye bhi O(n) mein hi chlta h but space jyda leta h esiliye iterative method accha hota in compare of it 