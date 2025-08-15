import java.util.*;



//Print maxSubarray sum... Brute force approach..

public class MaxSubArray_Brute{
    public static void maxSubarraySum(int num[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum;

        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += num[k];
                }
                
                if (currSum > maxSum) {
                    maxSum = currSum;
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








