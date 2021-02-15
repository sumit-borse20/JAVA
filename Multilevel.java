class Person
{
	private int Age;
	public void setAge(int a)
	{
		Age=a;
	}
	
	public int getAge()
	{
		return(Age);
	}
	
}

 class Stud1 extends Person  
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

 class Stud2 extends Stud1
{
	String Name;
	public void setName(String n)
	{
		Name=n;
	}
	public String getName()
	{
		return(Name);
	}
}



class Student5
{
	public static void main(String[] args) 
	{
		Stud2 s1=new Stud2();
		s1.setRollno(999);
		s1.setName("Sumit");
		s1.setAge(20);

		System.out.println("Roll no : "+s1.getRollno());
		System.out.println("Name : "+s1.getName());
		System.out.println("Age : "+s1.getAge());

		
	}
}