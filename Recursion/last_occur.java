class last_occur{
    public static int last(int arr[] , int key , int i){
        if(i == arr.length) return -1;

        int isfound = last(arr,key,i+1);

        if(isfound == -1 && arr[i]== key) return i;

        return isfound;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,4,5,5,6};
        System.out.println(last(arr,5,0));
    }
}