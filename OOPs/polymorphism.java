// Method overloading

import java.util.*;

public class polymorphism{
    public static void main(String args[]){
        Calculator calc= new Calculator();
        System.out.println(calc.sum(2,4));
        System.out.println(calc.sum(2,4,5));
        System.out.println(calc.sum((float)2.5,(float)4.5));

        Animal cow = new Animal();
        cow.eat();

        Deer d= new Deer();
        d.eat();
        

    }
}

class Animal{   // method overriding or fucntion overriding 
    void eat(){
        System.out.println("eats");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
}


class Calculator {
    int sum(int a , int b){
        return a + b;
    }

    float sum(float a, float b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }
}