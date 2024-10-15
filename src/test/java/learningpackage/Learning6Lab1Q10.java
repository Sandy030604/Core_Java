package learningpackage;

import java.util.Scanner;

public class Learning6Lab1Q10 {
	public static boolean checkstring(String a)
	{
		for(int i=0;i<a.length()-1;i++)
		{
			if(a.charAt(i)<a.charAt(i+1))
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String args[])
	{
		Scanner sk=new Scanner(System.in);
		String a=sk.nextLine();
		System.out.println(checkstring(a));
	}

}
