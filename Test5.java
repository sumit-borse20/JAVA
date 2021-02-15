class stringTest1
{
	public static void main(String[] args) 
	{
		
		String s1="Sumit";
		String s2="Sumit";
		String s3=new String("Sumit");

		System.out.println("Result 1: "+(s1==s2));
		System.out.println("Result 2: "+s1.equals(s2));
		System.out.println("Result 1: "+(s1==s3));
		System.out.println("Result 1: "+s1.equals(s3));
		
	}
}