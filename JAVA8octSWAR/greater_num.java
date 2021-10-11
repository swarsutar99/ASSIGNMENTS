public class greater_num{
	public static void main(String Args[])
	{
		int a=10,b=20,c=30;
		if(a>b && a>c)
		{
			System.out.println("a is greater than b and c");
		}
		else if(b>a && b > c)
		{
			System.out.println("b is greater than c and a");
		}
		else
		{
			System.out.println("c is greater than b and a ");
		}
	}
}