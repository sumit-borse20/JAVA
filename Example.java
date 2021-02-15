package pack1;
import pack2.Student;
public class Example
{
	public static void main(String args[])
	{
		Student s1=new Student();
		s1.setRollno(53106);
		s1.setName("Sumit");

		System.out.println("Roll NO = "+s1.setRollno());
		System.out.println("Name = "+s1.setName());

	}
}