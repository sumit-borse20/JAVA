import java.util.*;
class Test
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		int temp;
		System.out.println("Enter the size of Array :");
		int x=sc.nextInt();

		int k[]=new int[x];

		System.out.println("Eneter the values in Array :");
		for(int i=0;i<x;i++)
		{
			k[i]=sc.nextInt();

			for(int j=i;j>0;j--)
			{
				if(k[j] < k[j-1])
				{
					temp=k[j];
					k[j]=k[j-1];
					k[j-1]=temp;
				}
			}

		}

		for(int i=0;i<x;i++)
		{
			System.out.println("Array valuse of "+(i+1)+ "is:"+k[i]);
		}
		
	}
	
}