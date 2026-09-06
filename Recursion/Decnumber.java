
public class Decnumber {
   
    public static void main(String[] args) {
     //System.out.println("main here"+" "+number(10));
     number(1000);
     }
     public static int number(int n){
      if(n==0){
         return 0;
      }
      System.out.println(n);
     return number(n-1);
     }
    
}

