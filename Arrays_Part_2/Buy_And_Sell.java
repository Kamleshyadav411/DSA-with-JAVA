import java.util.*;


//Buy and sell stocks...

public class Buy_And_Sell{
    public static int buyandsell(int prices[]){
        int bp=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0; i<prices.length;i++){
            if(bp<prices[i]){   //profit
                int profit=prices[i] - bp; //today's profit
                maxProfit=Math.max(maxProfit,profit);
            }else{
                bp=prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        System.out.println(buyandsell(prices));
    }
}