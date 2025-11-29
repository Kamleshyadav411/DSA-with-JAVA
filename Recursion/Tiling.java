class Tiling{
    public static int tile(int n){
        if(n == 0 || n == 1) return 1;

        //vertical 
        int a= tile(n-1);

        // horizontal
        int b= tile(n-2);

        int totalways=a+b;
        return totalways;
    }
    public static void main(String args[]){
        System.out.println(tile(3));
    }
}