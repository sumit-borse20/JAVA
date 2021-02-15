import java.util.*;

class Fibonaci
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=0,b=1,c;

		System.out.println("Enter the Number To print the Fibonacci Series :");
		int s=sc.nextInt();

		System.out.println("The Fibonacci series of "+s+" Number is :");
		System.out.print(a+" "+b);

		for(int i=2;i<=s;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}	
	}
	
}