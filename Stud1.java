class Person
{
	private int Age;
	private String Name;

	public void setAge(int a)
	{
		Age=a;
	}
	public void setName(String n)
	{
		Name=n;
	}
	public int getAge()
	{
		return(Age);
	}
	public String getName()
	{
		return(Name);
	}
}

 class Student1 extends Person  
{
	private int Rollno;
	public void setRollno(int r)
	{
		Rollno=r;
	}

	public int getRollno()
	{
		return(Rollno);
	}

}
public class Stud1
{
	public static void main(String[] args) 
	{
		Student1 s1=new Student1();
		s1.setRollno(51106);
		s1.setName("Sumit");
		s1.setAge(25);

		System.out.println("Roll no : "+s1.getRollno());
		System.out.println("Name : "+s1.getName());
		System.out.println("Age : "+s1.getAge());

		
	}
}