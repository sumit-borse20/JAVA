import java.util.*;

class Test
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		int [][]a=new int[2][2];

		
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter the first Values:");
			for(int j=0;j<2;j++)
			{
				System.out.println("Enter the Second Array Values:");
				a[i][j]=sc.nextInt();

			}
		}

			System.out.println("The Array Entered by User:");
		for(int i=0;i<2;i++)
		{
			System.out.println(" the first Array Values:");
			for(int j=0;j<2;j++)
			{
				System.out.println("the Second Array Values:");
				System.out.println(" "+a[i][j]);
				
			}
				
		}
}
}