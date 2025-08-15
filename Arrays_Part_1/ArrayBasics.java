import java.util.*;


public class ArrayBasics{
    public static void main(String args[]){
        int marks[]=new int[50];
        System.out.print("Enter your marks:");
        Scanner s= new Scanner(System.in);  //input
        marks[0]=s.nextInt(); //phy
        marks[1]=s.nextInt();//chem
        marks[2]=s.nextInt();//maths

        System.out.println("phy :" + marks[0]);
        System.out.println("chem :" + marks[1]);
        System.out.println("maths :" + marks[2]);


        marks[2]=98;
        System.out.println(marks[2]);  //updated value

        marks[1]=marks[1]+2;
        System.out.println(marks[1]); // update value

        int len;
        len= marks.length;   //length
        System.out.println(len);
    
    }
}

