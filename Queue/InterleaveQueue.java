import java.util.*;

public class InterleaveQueue {
    public static void interleave(Queue<Integer> q) {

        int size = q.size();
        Queue<Integer> firstHalf = new LinkedList<>();

        // first half store
        for(int i = 0; i < size/2; i++){
            firstHalf.add(q.remove());
        }

        // interleave
        while(!firstHalf.isEmpty()){
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
        if(size % 2 != 0){  // handle odd case
    q.add(q.remove());
}
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);

        interleave(q);

        System.out.println(q);
    }
}