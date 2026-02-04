import java.util.*;

public class createll{
    public static class Node{
        int data;
        Node next;

        public Node (int data){
            this.data=data;
            this.next=null;
        }
    }

    // Static variables....
    public static Node head;
    public static Node tail;
    public static int size;


    //methods

    //Add first

    public void addfirst(int data){  //O(1) - TC
        //create new node 
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }
        
        //newNode next = head
        newNode.next = head; //link

        //head = newNode
        head= newNode;

    }




    // Add last
    public void addlast(int data){
        // create new node 
        Node newNode = new Node(data);
        size++;
        
        if(head == null){
            head = tail = newNode;
            return;
        }

        //tail.next - newnode
        tail.next = newNode;

        //tail= newNode
        tail=newNode;
    }



    //print ll function

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




    //Add in middle
    public void add(int idx, int data){
        //agr ham idx 0 pe add krna chahate h toh yek tarike se ham add firts krna chahate hai eisilye
        if(idx == 0){
            addfirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        //i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;


    }



// Remove first
    public int removeFirst(){
        //Special case
        if(size==0){
            System.out.println("empty ll");
            return Integer.MIN_VALUE; // -infinity value return karne ke liye  jab empty rhe toh
        } else if(size == 1){
            int val = head.data;
            head = tail =null;
            size=0;
            return val;
        }


        int val = head.data;
        head = head.next;
        size--;
        return val;
    }


    //remove last
    public int removelast(){
        if(size==0){
            System.out.println("empty ll");
            return Integer.MIN_VALUE; // -infinity value return karne ke liye  jab empty rhe toh
        } else if(size == 1){
            int val = head.data;
            head = tail =null;
            size=0;
            return val;
        }
        //prev : i = size-2
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data; // or tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }




    public static void main(String args[]){
        createll ll = new createll();
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(4);
        ll.addlast(5);
        ll.add(2,3);

        ll.printll();
        System.out.println(ll.size);

        ll.removeFirst();
        ll.printll();
        System.out.println(ll.size);

        ll.removelast();
        ll.printll();
        System.out.println(ll.size);



    }
}