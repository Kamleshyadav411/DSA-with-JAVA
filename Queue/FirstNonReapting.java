import java.util.*;

public class FirstNonReapting {
    public static void main(String[] args) {

        String str = "aabccxb";
        Queue<Character> q = new LinkedList<>();
        int freq[] = new int[26];

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            freq[ch - 'a']++;

            q.add(ch);

            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

            if(q.isEmpty()) {
                System.out.print("-1 ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }
    }
}