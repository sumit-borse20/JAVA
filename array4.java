import java.util.*;
class Test
{
	public static void main(String[] args) 
	{
		
		int temp;
		Scanner sc=new Scanner(System.in);
		

		System.out.println("Enter the size of Array :");
		int a=sc.nextInt();

		int []s =new int[a];
		


		System.out.println("Enter the Values in Array: ");
		for(int i=0;i<a;i++)
		{
			s[i]=sc.nextInt();
			for (int j = i; j > 0; j--) 
    		{
      		if (s[j] < s[j - 1]) 
      		{
       			temp = s[j];
       			s[j] = s[j - 1];
       			s[j - 1] = temp;
      		}
     		}
		}

		//Arrays.sort(s);

   
    
   
   
		for(int i=0;i<a;i++)
		{
			System.out.println("The Array value "+(i+1)+" is:"+s[i]);
		}
		


		
	}
}