public class Substes{
    public static void subsets(String s, String ans, int i  ){
        //base case

        if(i== s.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }
            System.out.println(ans);
            return;
        }
        //yes 
        subsets(s, ans+s.charAt(i), i+1);


        //no 
        subsets(s,ans,i+1);

    }
    public static void main(String args[]){
        String s= "abc";
        subsets(s,"",0);
    }
}