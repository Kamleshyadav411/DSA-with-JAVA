import java.util.*;


class basic{
    public static void main(String args[]){
        pen p1= new pen(); // constructor ,,, we have created a pen obj called p1
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.settip(4);
         System.out.println(p1.getTip());

         p1.setColor("blue");
        System.out.println(p1.getColor());
    }
}

class pen{
   private String color;
    private int tip;  // ye pen ke ander ki tipp hai 

    String getColor(){  // getter 
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){  // setter
       this.color= newColor;
    }
    void settip(int tip){  // yha pr new tip hai 
        this.tip = tip;
    }
}


class Student{
    String name;
    int age;
    float percentage;

    void calPercentage(int phy,int math,int chem){
        percentage=(phy+chem+math)/3;
    }
}