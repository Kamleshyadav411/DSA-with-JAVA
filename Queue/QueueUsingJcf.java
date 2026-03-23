import java.util.*;

public class QueueUsingJcf{  //O(n)
    public static void main(String args[]) {
       Queue<Integer> q = new LinkedList<>(); // ArrayDeque ,  enhi dono se ham java mein QUEUE  implement kar sakte h kyu queue k koi object nhi hota ye yek interface hota h in java 

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}