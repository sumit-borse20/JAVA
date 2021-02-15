class A
{
	public void V1(int x)
	{
		System.out.println("Class A");
	}
}

class B extends A
{
	public void V1(int x)
	{
		System.out.println("Class B");

	}
}

class Overriding
{
	public static void main(String[] args) 
	{
		B obj=new B();
		obj.V1(5);
		
		//A obj1=new A();
		//obj1.V1(4);
	}
}