import java.util.*;
// imp interview ke liye

class update_ith{
    public static int main1(int n, int i){
        int bitmask= ~(1<<i);
        return n & bitmask;
    }

    public static int set(int n , int i){
        int bitmask= 1<<i;
        return n| bitmask;
    }

    public static int update(int n, int i, int newbit){
        // if(newbit == 0){
        //     return main1(n,i);
        // }else{
        //     return set(n,i);
        // }

    n=main1(n,i);
    int bitmask = newbit<<i;
    return n | bitmask;
    }


    public static void main(String args[]){
        System.out.println(update(10,2,1));
    }
}



