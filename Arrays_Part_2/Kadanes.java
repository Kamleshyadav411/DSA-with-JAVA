import java.util.*;



// Max sub array sum by kadanes algo....it is optimize approach....

public class Kadanes{
    public static void kadanes(int num[]){
        int cs=0;
        int maxs=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            cs=cs+num[i];
            if(cs<0){
                cs=0;
            }
            maxs=Math.max(cs,maxs);
        }
        System.out.println("Max:" +maxs);
    }
    public static void main(String args[]){
        int num[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(num);
    }
}