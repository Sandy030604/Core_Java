package package1;

public class TC_20Exception {

	public static void main(String[] args) {
//		String str=null;
//		str.equals("Hello");
		//Provides Null Pointer Exception
		//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "str" is null
		//at package1.TC_20Exception.main(TC_20Exception.java:8)
		//System.out.println("Welcome");
		//even if i try to print welcome which is with no error we cannot print it as there is an error before it. 
		
		
		//For this problem we are going to use Exception 
		try {
			String str=null;
			str.equals("Hello");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage()+"SKEXCEPTION");
		}
		System.out.println("Welcome");
		
		//Cannot invoke "String.equals(Object)" because "str" is nullSKEXCEPTION
		//Welcome
		
		//The Welcome gets executed as we are just using 'try'

	}

}
