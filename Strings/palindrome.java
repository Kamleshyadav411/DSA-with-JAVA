import java.util.*;

class palindrome{
    public static boolean ispalindrome(String str){
        int n= str.length();
        for(int i=0; i<=n/2;i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                // not palindrome..
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        String str = "abca";
        System.out.println(ispalindrome(str));
    }
}