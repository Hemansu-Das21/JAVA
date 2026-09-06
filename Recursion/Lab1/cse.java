import java.util.Scanner;
class cse{
    public static void main(String[] args) {
        System.out.println("CSE department");
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        System.out.println("Your name is "+str);
        int n1=obj.nextInt();//Sir use parse int
        int n2=obj.nextInt();
        System.out.println("Sum of two no is "+(int)(n1+n2));
        obj.close();

    }
}//Sir said run on command line not use ide