import static org.testng.Assert.assertEquals;

import java.util.Iterator;

import org.testng.Assert;

class New 
{

	public static void main(String ar[]) 
	{
		String s = "Dhiraj";
		String b = "";
		for (int i = s.length()-1; i >=  0; i--) 
		{
			b = b + s.charAt(i);
		}
		System.out.println(b);
		
	}
} 