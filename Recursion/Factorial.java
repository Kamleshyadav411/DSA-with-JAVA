class Factorial{
        public static int fact(int n){
            if(n==0) return 1;

            int f=fact(n-1); // factorial of n-1 hai
            int fn=n*fact(n-1);
            return fn;

        }
        public static void main(String args[]){
        int n=5;
        System.out.print(fact(n));
    }
}