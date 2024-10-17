package package1;

import java.util.Scanner;

class ageexception extends Exception{
	private int age;

	public ageexception(int age) {
		super();
		this.age = age;
	}
	
	public String tostring()
	{
		return age+"is an invalid age";
	}
}
class employees
{
	String name;
	int age;
	void getdetails() throws ageexception
	{
		System.out.println("Enter your name: ");
		Scanner sk=new Scanner(System.in);
		name=sk.nextLine();
		System.out.println("Enter your age: ");
		age=sk.nextInt();
		if(age<16)
		{
			throw new ageexception(age);
		}
		
	}
}

public class TC024_AgeException {
	public static void main(String args[])
	{
		try {
			employees emp=new employees();
			emp.getdetails();
		}
		catch(ageexception e)
		{
			System.out.println("Age Exception: "+e.tostring());
		}
	}

}
