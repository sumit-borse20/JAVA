import java.util.*;

class Test
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Eneter the first Array size :");
		int a=sc.nextInt();

		System.out.println("Eneter the Second Array size :");
		int b=sc.nextInt();
		
		int [][] s=new int[a][b];

		System.out.println("Enter the value of Array:");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				s[i][j]=sc.nextInt();

			}
		}
		System.out.println("Enter Array by You :");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				System.out.println("The Array is:  "+s[i][j]);
			}
		}
	}
}