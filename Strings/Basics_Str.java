import java.util.*;


public class Basics_Str
    {
    public static void printletters(String str){  // print each char seprately
        for(int i =0; i< str.length();i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }
    


    public static void main(String args[]){
        char arr[]={ 'a' , 'b'};

        String str="abc";

        String str2=new String("abcd");

        // String are immutable

        Scanner sc= new Scanner(System.in);   // input through user
        String name; // type declarations..

        name= sc.nextLine();  // take input we use nextline instead of next because it takes only words but nextline takes whole line.
        System.out.println(name);


        System.out.println(name.length());  // dekho yaha length yek function hai esiliye double perenethesis laga hai but in array we use only .length beacuse where it is only property..



        // concatenation of string means 2 string ko add karna 
        String n="A";
        String m="B";
        System.out.println(n + " "+ m);

        System.out.println(name.charAt(1));

        printletters(name);

    }
}
