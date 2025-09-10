import java.util.*;




class odd_even{
    public static void oddoreven(int n ){
        int bitmask = 1;

        if((n & bitmask) == 0){
            //even
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void  main(String args[]){
        oddoreven(3);
        oddoreven(4);
    }
}