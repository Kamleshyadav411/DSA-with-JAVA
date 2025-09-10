class Static {
    public static void main(String args[]){
        students s1= new students();

        s1.school ="JNV";

        students s2= new students();
        System.out.println(s2.school);

        students s3= new  students();
        s3.school="JMV";
       



    }
}

class students{
    String name;
    int roll;

    static String school;

    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}