package package1;

public class TC010_Stringsk {
	public static void main(String args[])
	{
		String str1="Santhosh";
		String str2=str1;
		System.out.println(str2);
		str2="Krishnan";
		System.out.println(str2);
		
		String str3="This is a beautiful day";
		System.out.println("core "+str3);
		
		System.out.println("Length of str3: "+str3.length());
		
		System.out.println("Index of a: "+str3.indexOf("a"));
		
		System.out.println("Substring: "+str3.substring(10,20));
		
		System.out.println("value of: "+str3.valueOf(30));
		
		System.out.println("Empty: "+str3.isEmpty());
		

		
	}

}
