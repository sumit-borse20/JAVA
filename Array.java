import java.io.*;
class Demo
{
	public static void main(String args[]) throws NumberFormatException,IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number of Student :");
		int n=Integer.parseInt(br.readLine());
		int []s = new int[n];

		for(int i=0;i<n;i++)
		{
			System.out.print("Enter Marks of Student"+(i+1)+"::");
			s[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("Marks of student:"+(i+1)+"is::"+s[i]);
		}
	}
}