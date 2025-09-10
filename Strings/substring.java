import java.util.*;


// SubString matlab kisi string k yek consecutive part.
// substring mein starting index are included but ending are not included.



class substring{
    public static String subString(String str, int strIdx , int endIdx){
        String substr = "";
        for(int i= strIdx; i<endIdx;i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        String str = "KamleshYadav";
        
        System.out.println(str.substring(0,5)); // here use substring function


        // System.out.println(subString(str,0,5));
    }
}


