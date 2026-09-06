class FirstOccur{
    public static void main(String[] args) {
        int key=2;
        int[]arr={1,3,2,4,5,2};
        System.out.println(checkOccur(arr,key,0));
    }
    public static int checkOccur(int[] arr,int key,int i){
        if(arr.length-1==i){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return checkOccur(arr, key, i+1);
    }
}