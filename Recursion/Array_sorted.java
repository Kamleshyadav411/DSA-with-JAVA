class Array_sorted{
    public static boolean sorted(int arr[],int i){
        if(i == arr.length-1) return true;

        if(arr[i]>arr[i+1]){
            return false;
        }
        return sorted(arr,i+1);
    }
    public static void main(String args[]){
        int arrr[]={1,2,3,4};
        System.out.println(sorted(arrr,3));
    }
}