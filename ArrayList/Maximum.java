import java.util.ArrayList;

class Maximum{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(4);

        int min = Integer.MIN_VALUE;

        for(int i = 0;i<list.size();i++){
            if(list.get(i)>min){
                min=list.get(i);
            }
        }
        System.out.print(min);

    }
}