import java.util.*;

public class multilevel{
    public static void main(String args[]){
        dog dobby= new dog();
        dobby.eat();
        dobby.type();
    }
}

//base class

class animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breath");
    }

    
    }

// derived class
class mammals extends animal{
    String property;

    void bark(){
        System.out.println("barking");
    }

}

class dog extends mammals{
    String type;

    void type(){
        System.out.println("XYZ");
    }

}
