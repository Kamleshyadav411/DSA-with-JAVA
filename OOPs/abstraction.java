import java.util.*;


// Abstract class..

public class abstraction{
    public static void main(String args[]){
        Horse h = new Horse();
        h.eat();
        h.walk();

    Mustang myhorse= new Mustang();
    //Animal -> Horse -> Mustang
       

        chicken c= new chicken();
        c.walk();
        c.eat();
    }
}

abstract class Animal{
    String color;

    Animal(){
        System.out.println("animal constructor called");
    }

    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
}


class Horse extends Animal{
    Horse(){
        System.out.println("horse constructor called");
    }

    void changeColor(){
        color="darks black";
    }

    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("mustang constructor called");
    }
}


class chicken extends Animal{
    void changeColor(){
        color="yelow";
    }
        void walk(){
            System.out.println("walks on 2 legs");
        }
}
