class BasicInput{
    public static void main(String[] args) {
        String[] word1 = {"ab", "c" };
        String[] word2 = {"a", "bc"};
        StringBuilder str1=new StringBuilder();
        StringBuilder str2=new StringBuilder();
        for(int i=0;i<word1.length;i++){
            str1.append(word1[i]);
            System.err.println(str1);
        }
        for(int j=0;j<word2.length;j++){
            str2.append(word2[j]);
            System.err.println(str2);
        }
        if(str1.equals(str2)){
            System.out.println("T");;
        }
        

    }
}