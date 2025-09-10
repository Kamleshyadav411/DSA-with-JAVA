import java.util.*;

public class inheritance{
    public static void main(String args[]){
        fish shark= new fish();
        shark.eat();
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
class fish extends animal{
    int fins;

    void swim(){
        System.out.println("swims");
    }

}


// above program is also single level inheritance..