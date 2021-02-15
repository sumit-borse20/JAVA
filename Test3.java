public class Test3
{
	private static int a;

	static
	{
		System.out.println("Static Initialization Block : a="+a);
		a=8;

	}
	public static void main(String[] args) 
	{
		Test3 t1=new Test3();
		Test3 t2=new Test3();
	}
}