import java.util.*;
class Test
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		int [][][][]s=new int[3][4][2][3];

		System.out.println("Eneter the Array Values:");
		for(int i=0;i<3;i++)
		{
			System.out.println("The marks of students "+(i+1)+" is :");
			for(int j=0;j<4;j++)
			{
				System.out.println("The marks of Subject "+(j+1)+" is :");
				for(int k=0;k<2;k++)
				{
					System.out.println("The Semister  "+(k+1)+" is :");
					for(int l=0;l<3;l++)
					{
						System.out.println("The Class Test marks "+(l+1)+" is :");
						s[i][j][k][l]=sc.nextInt();

					}
				}
			}
		}
		

		System.out.println("The Entered Array is :");

		for(int i=0;i<3;i++)
		{
			System.out.println("The marks of students "+(i+1)+" is :");
			for(int j=0;j<4;j++)
			{
				System.out.println("The marks of Subject "+(j+1)+" is :");
				for(int k=0;k<2;k++)
				{
					System.out.println("The Semister  "+(k+1)+" is :");
					for(int l=0;l<3;l++)
					{
						System.out.println("The Class Test marks "+(l+1)+" is :");
						System.out.println("  "+s[i][j][k][l]);
					}
				}
			}
		}
		
	}
}
