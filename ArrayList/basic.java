import java.util.ArrayList;
import java.util.Collections;

public class basic{
    public static void main(String args[]){
    //ClassName objectname = new classname();
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<String> list2 = new ArrayList<>();
    ArrayList<Boolean> list3 = new ArrayList<>();

    // operations on arraylist
    list.add(1); //O(1)
    list.add(2);
    list.add(3);
    list.add(6);
    list.add(5);

    list.add(1,18); //O(n)

    Collections.sort(list);  // Collections is class and collection is interface 

    System.out.println(list);

    System.out.println(list.get(2)); //O(1)

    System.out.println(list.remove(0)); //O(n)
    System.out.println(list);

    System.out.println(list.set(2,10)); //O(n)
    System.out.println(list);

    System.out.println(list.size());

    System.out.println(list.contains(18)); //O(n)
}
}