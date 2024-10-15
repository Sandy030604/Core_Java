package learningpackage;

import java.util.Scanner;

public class Learning5Lab1Q9 {
	public static String Stringoperation(String a,int b)
	{
		String c="";
		switch(b)
		{
			case 1:
				 c=a+a;
				 break;
			case 2:
				char[] d=a.toCharArray();
				for(int i=0;i<d.length;i++)
				{
					if(i%2 != 0)
					{
						d[i]='#';
					}
				}
				c=new String(d);
				break;
			case 3:
				for(int i=0;i<a.length();i++)
				{
					if(c.indexOf(a.charAt(i))==-1)
					{
						c+=a.charAt(i);
					}
				}
				break;
			case 4:
				for(int i=0;i<a.length();i++)
				{
					if(i%2!=0)
					{
						c+=Character.toUpperCase(a.charAt(i));
					}
					else
					{
						c+=a.charAt(i);
					}
				}
				
				
		}
		return c;
	}
	public static void main(String args[])
	{
		Scanner sk=new Scanner(System.in);
		String a=sk.nextLine();
		int b=sk.nextInt();
		System.out.println(Stringoperation(a,b));
		
		
	}

}
