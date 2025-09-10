class Super{
    public static void main(String args[]){
        Horse h= new Horse();
        
    }
}

class Animal{ // this is imidiate parent class 
    Animal(){
        System.out.println("animal constructor is called");
    }
}

class Horse extends Animal{
    Horse(){
        super(); // es se direct aniaml class k constructor call ho jayega
        System.out.println("Horse constructor is called");
    }
}