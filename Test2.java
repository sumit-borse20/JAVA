public class Test2
{
	private int x;

	{
		System.out.println("Instance Intialization x="+x);
		x=10;
	}	
	
	public Test2()
	{
		System.out.println("Constructor : x="+x);
	}

	public static void main (String args[])
	{
		Test2 t1=new Test2();
		Test2 t2=new Test2();
	}
}

