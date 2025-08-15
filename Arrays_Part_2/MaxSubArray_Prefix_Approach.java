import java.util.*;



// Max sub array sum.... Prefix Approach it has best tc than brute force approach.


public class MaxSubArray_Prefix_Approach{
    public static void maxSubarraySum(int num[]) {
        int currSum=0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[]= new int[num.length];

        prefix[0] = num[0];

        // calculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + num[i];
            }
            for(int i=0; i<num.length;i++){
                int start =i;
                for(int j=i; j<num.length;j++){
                    int end=j;
                    currSum=start ==0 ? prefix[end] : prefix[end]-prefix[start-1];

                    if(maxSum<currSum){
                        maxSum=currSum;
                    }
                }
            }
            System.out.println("Maximum subarray sum is: " + maxSum);
        }
    public static void main(String args[]) {
        int num[] = {1, -2, 6, -1, 3};
        maxSubarraySum(num);
    }
}
