class Fib_num{
    public static int fib(int n){
        if(n==0 || n==1) return n;

        int f=fib(n-1);
        int fn=fib(n-2);
        int fibb=f+fn;
        return fibb;
    }
    public static void main(String args[]){
        System.out.println(fib(6));
    }
}


