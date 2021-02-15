import java.util.*;
class Test
{
	public static void main(String[] args) 
	{
		int [][]s=new int[3][2];

		Scanner sc=new Scanner(System.in);

		for(int i=0;i<3;i++)
		{
			System.out.println("Enter Marks for student "+(i+1)+"is :");
			for(int j=0;j<2;j++)
			{
				System.out.print("Subject :"+(j+1)+"is :");
				s[i][j]=sc.nextInt();

			}
		}



		for(int i=0;i<3;i++)
		{
			System.out.println("Marks of student "+(i+1)+"is :");

			for(int j=0;j<2;j++)
			{
				System.out.print("Subject :"+(j+1)+"is :");
				System.out.println("  "+s[i][j]);			

			}

		}
		
	}
	
}