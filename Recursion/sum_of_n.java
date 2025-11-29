class sum_of_n{
    public static int sum(int n){
        if(n==1)  return 1;  // base case

        int s=sum(n-1);  //sum of n-1 hai
        int summ=n+s;
        return summ;
    }
    public static void main(String args[]){
        int n=5;
       System.out.println(sum(n));
    }
}