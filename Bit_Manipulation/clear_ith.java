import java.util.*;


class clear_ith{
    public static int main1(int n, int i){
        int bitmask= ~(1<<i);
        return n & bitmask;
    }
    public static void main(String args[]){
        System.out.println(main1(10,1));
    }
}