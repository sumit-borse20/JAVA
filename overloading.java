class A
{

}

class B extends A
{
	public void F1(int x)
	{
		System.out.println("Class A");
	}
	public void F1(int x,int y)
	{
		System.out.println("Class B");
	}
}

class overloading
{
	public static void main(String[] args) 
	{
		B obj=new B();
		obj.F1(5);
		obj.F1(5,6);

	}
}