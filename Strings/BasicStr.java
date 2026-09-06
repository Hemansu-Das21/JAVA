
import java.util.Scanner;

class BasicStr{
    public static void main(String[] args) {
        //Dclare and Intilization
        String str="Hemansu Das";
        System.out.println(str);

        //User Input
        Scanner sc1=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);

        //for character
        String str1=sc1.next();
        System.out.println("String Value for only one text is"+" "+ str1);

        String str2=sc2.nextLine();
        System.out.println("String Value take all"+" "+ str2);

        System.out.println(str1.charAt(3));

        
    }
}