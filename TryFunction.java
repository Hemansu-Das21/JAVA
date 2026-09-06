class demo
{
     static int add(int a, int b) {
         int c;
         c=a+b;
         return c;
     }
}
class Test 
{
	public static void main(String[] args) 
	{
		System.out.println(demo.add(1,2));//3
		System.out.println(demo.add(2,3));//5
	}
}
