class A
{
	int a;
	public A(int x)
	{
		a=x;
		System.out.println("A");
	}
}

class B extends A
{
	int b;
	

	public B()
	{
		super(4);
		System.out.println("B");
	}
}

class Test
{
	public static void main(String[] args) 
	{
		B obj=new B();

		//System.out.println
	}
}