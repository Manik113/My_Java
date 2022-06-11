package Open_Browser;

public class Return_method2
{

	public static void main(String[] args) 
	{
		String Str2="velocity";
		String STR3=Name(Str2);
		
		System.out.println(STR3);

	}
	public static String Name(String S1)
	{
		String S2=S1.toUpperCase();  //VELOCITY
		return S2;
	}

}
