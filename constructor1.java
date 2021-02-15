class A
{
	public A()
	{
		System.out.println("A1");
	}
}
class B extends A
{
	public B()
	{
		this(5);
		System.out.println("B1");
	}

	public B(int y)
	{
		System.out.println("B2");
		
	}
}