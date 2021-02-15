import java.util.*;

class Test
{
	int roll,age;
	String name;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name ,Roll Number And Age");
		String name=sc.nextLine();
		int roll=sc.nextInt();
		int age=sc.nextInt();

		System.out.println("Name is: "+name);
		System.out.println("Roll Number is:" +roll);
		System.out.println("Age is : "+age);
	}
}