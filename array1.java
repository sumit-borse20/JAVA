import java.util.*;

class Test
{
	public static void main(String[] args) 
	{
		int []A =new int[5];
		A[0]=3;
		A[1]=4;
		A[2]=6;
		A[3]=8;
		A[4]=5;

		Arrays.sort(A);
		System.out.println("The Array Value is");
		System.out.println("A[0]="+A[0]);
		System.out.println("A[1]="+A[1]);
		System.out.println("A[2]="+A[2]);
		System.out.println("A[3]="+A[3]);
		System.out.println("A[4]="+A[4]);
	}
}