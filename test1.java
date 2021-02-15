class Box
{
	private int length,breadth,height;

	public void setDiamension(int l,int b,int h)
	{
		 length=l; breadth=b; height=h; 
	}
	public void showDiamension()
	{
		System.out.println("length ="+length);

		System.out.println("breadth ="+breadth);

		System.out.println("height ="+height);
	}
}
class Example
{
	public static void main(String [] args) 
	{

		Box smallbox = new Box();
		smallbox.setDiamension(10,11,12);
		smallbox.showDiamension();
	}
}