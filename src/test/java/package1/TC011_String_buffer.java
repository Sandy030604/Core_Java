package package1;

public class TC011_String_buffer {
	public static void main(String args[])
	{
		StringBuffer sk=new StringBuffer("Hello world");
		System.out.println(sk.append("Welcome to everyone"));
		System.out.println(sk.reverse());
		
		StringBuilder str5=new StringBuilder("Orange");
		System.out.println("String builder: "+str5.reverse());
	}
}
