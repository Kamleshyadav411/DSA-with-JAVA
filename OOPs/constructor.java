import java.util.*;

class constructor{
    public static void main(String args[]){
        Student s1= new Student(); // by default
        Student s2= new Student("kamlesh");  // param....  const..
        Student s3= new Student(123);
    }
}


class Student{
    String name;
    int roll;

    Student(){  // mannualy  and this is non parameterized constructor
        System.out.println("constructor is called..");
    }

    Student(String name){  // parametrized constructor
        this.name= name;
    }

    Student(int roll){  // yek class mein multiple const... ba sakte hai
        this.roll=roll;
    }
}

// AGar ham constructor n create kare toh java by default constructor bna leta hai
// yaha pr apne hisab se constructor call ho jata and es phenomenon ko ham construcot overloading kahte hai okh... and this is example of polymorphism