package package1;

import java.util.*;

public class Practice004_Question09 {
	public static String validcheck(String a,int b)
	{
		String c=null;
	    switch(b)
	    {
	    	case 1:
	    		c=a+a;
	    		break;
	    	case 2:
	    		
	    }
	    return c;
	}
	public static void main(String args[])
	{
		Scanner sk=new Scanner(System.in);
		String a=sk.nextLine();
		int b=sk.nextInt();
		System.out.println(validcheck(a,b));
		
		
	}

}