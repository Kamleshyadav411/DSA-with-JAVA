public class Remove_Duplicate{
public static void Remove_Duplicates(String str, int idx, StringBuilder newStr,boolean map[] ){
    if(idx==str.length()){
        System.out.println(newStr);
        return;
    }

    char currChar = str.charAt(idx);
    if(map[currChar-'a'] == true){
        //dublicate
        Remove_Duplicates(str,idx+1,newStr,map);
    }else{
        map[currChar-'a' ]= true;
        Remove_Duplicates(str,idx+1, newStr.append(currChar) ,map);
    }
}
public static void main(String args[]){
    String str="appnnacollege";
    Remove_Duplicates(str,0,new StringBuilder(""), new boolean[26]);
}
}