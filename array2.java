import java.util.*;
 class Test
{
	public static void main(String[] args) 
	{
		int []s=new int[5];
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Array Values:");

		for(int i=0;i<5;i++)
		{
			 s[i]=sc.nextInt();
		}

		Arrays.sort(s);
		for(int i=0;i<5;i++)
		{
			System.out.println("The Array "+(i+1)+" is:"+s[i]);
		}

		
	}

}