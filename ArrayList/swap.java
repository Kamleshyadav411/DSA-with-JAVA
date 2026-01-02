import java.util.ArrayList;
import java.util.Collections;

public class swap{

    public static void Swap(ArrayList<Integer> l , int idx1 , int idx2){
        int temp = l.get(idx1);
        l.set(idx1 , l.get(idx2));
        l.set(idx2 , temp);
    }
    public static void main(String args[]){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(3);
        l.add(4);

        int idx1= 1 , idx2 = 2;
        System.out.println(l);
        Swap(l , idx1 , idx2 );
        System.out.print(l);
    }
}