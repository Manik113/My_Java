package Open_Browser;

public class Return_method1 
{

	public static void main(String[] args) 
	{
		int Num1=addition(10,20);
		System.out.println("Addition is:" +Num1);

	}
	public static int addition(int a, int b)
	{
		int sum=a+b; //10+20
		System.out.println("SUM is:" +sum);
		return sum; //30
	}

}
