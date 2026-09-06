class LastOccurence{
    public static void main(String[] args) {
        int key=2;
        int[]arr={1,3,2,4,5,2,3,4,2,1,3,5};
        int temp=-1;
        System.out.println(checkOccur(arr,key,0,temp));
    }
    public static int checkOccur(int[] arr,int key,int i,int temp){
        if(arr.length==i){
            return temp;
        }
        if(arr[i]==key){
            temp= i;
        }
        return checkOccur(arr, key, i+1,temp);
    }
}