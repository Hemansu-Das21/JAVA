import java.util.*;
public class Swap
{
     static void swap(int a, int b) 
     {
         int t;
         t=a;
         a=b;
         b=t;
         System.out.println("Value of a is" + a +"Value of b is "+b);
     }
}
public class Test
{
	public static void main(String[] args) 
	{
        Scanner obj = new Scanner(System.in);
		System.out.println("Enter a value");
		int a = obj.nextInt();
		System.out.println("Enter b value");
		int b = obj.nextInt();
		Swap.swap(a,b);

		//System.out.println(demo.add(1,2));//3
		//System.out.println(demo.add(2,3));//5
	}
}
