package package1;

public class TC014_Overloading {
	TC014_Overloading()
	{
		System.out.println("Constructor without parameter");
	}
	TC014_Overloading(int value)
	{
		System.out.println("Constructor with parameter");
	}
	public static void main(String args[]) {
		TC014_Overloading obj=new TC014_Overloading();
		TC014_Overloading obj1=new TC014_Overloading(3000);
		//Constructor without parameter
		//Constructor with parameter
	}

}
