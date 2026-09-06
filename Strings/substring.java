class substring{
    public static void main(String[] args) {
        String str="Hemansu";
        System.out.println(str.substring(0,1));//Start to end-1 like python
        System.out.println(str.substring(4));//Starting index to end-1
        
        String str1="abcd";
        for(int i=0;i<str1.length();i++){
           for(int j=i+1;j<=str1.length();j++){
            System.out.println(str1.substring(i,j)); 
        } 
        }
    }
}