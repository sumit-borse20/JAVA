import java.util.*;
class Test
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter first array size:");
		int a=sc.nextInt();
		System.out.println("Enter Second array size:");
		int b=sc.nextInt();

		int s[][]= new int[a][b];

		System.out.println("Enter the values in array:");
		
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				s[i][j]=sc.nextInt();
			}
		}

		System.out.println("The Enterd Array is ");

		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				System.out.println("  "+i+j+"=="+s[i][j]);

				//System.out.println(" ");
			}
		}			
			

	}
}