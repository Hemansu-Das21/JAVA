class TwoDMatrix{
    public static void main(String[] args) {
        int[][] matrix = {{0,1,1},{1,0,1},{1,1,0}};
        int[] arr=new int[3];
        int c;
        int row=matrix.length;
        int column=matrix[0].length;
        /*System.out.println(row+" "+column);*/

        for (int i=0;i<row;i++){
            c=0;
            for(int j=0;j<column;j++){
                if(matrix[i][j]==1){
                    c++;
                }
                arr[i]=c;
            }
        }
        System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);

    }
   
}