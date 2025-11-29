// class Power{
//     public static int pow(int x, int n){
//         if(n==0) return 1;

//         // int xnm1=pow(x,n-1);
//         // int xn=x*xnm1;
//         // return xn;
//         return x*pow(x,n-1);

//     }
//     public static void main(String args[]){
//         System.out.println(pow(2,5));
//     }
// }









//Optimized Code with TC is O(log n)...

class Power{
    public static int pow(int a,int n ){
        if(n == 0) return 1;
        int b=pow(a,n/2);

        // n is even
        int halfPower= b*b;

        // n is odd
        if(n%2 != 0){
            halfPower = a*halfPower;
        }
        return halfPower;
    }
    public static void main(String args[]){
        System.out.println(pow(2,-2));
    }
}