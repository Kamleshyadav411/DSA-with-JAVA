public class BinaryStrings{
    public static void binary(int n, int lastplace, String str){


        //base case

        if(n==0){
            System.out.println(str);
            return;
        }
    
    // kaam

        binary(n-1,0,str+"0");
        if(lastplace == 0){
            binary(n-1,1,str+"1");
        }
    }


    public static void main(String args[]){
        binary(2,0,"");

    }
   }
