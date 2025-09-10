import java.util.*;


class Compare{
    public static void main(String srgs[]){
        String s1="Tony";
        String s2="Tony";
        String s3= new String("Tony");

        if(s1 == s2){    // yaha pe out put eql ayega kyuki yaha new keyword nahi use huaa hai esiliye yaha purani string hi consider ho rhi hai
            System.out.println("Eql");
        }else{
            System.out.println("not eql");
        }
        if(s1 == s3){ // not wql bcz yhaa new keyword use huaa hai 
            System.out.println("Eql");
        }else{
            System.out.println("not eql");
        }
        
       
   
//  but yaha == use ye check karta hai object level pe but hame value check karni hai toh use karna hoga equal() functions
// That concept is ..... interning concept





 if(s1.equals(s3)){ // yaha eql hoga kuki value check ho rhi hai jo store hai 
            System.out.println("Eql");
        }else{
            System.out.println(" not Eql");
     }



 }

}
