package package1;

class parent{
	void tv()
	{
		System.out.println("This is parent Tv");
	}
}
class child extends parent{
	@Override 
	//this means that we are overriding the parent 
	void tv()
	{
		System.out.println("This is child Tv");
	}
}

public class TC016_OverridingAnnotation {
	public static void main(String args[])
	{
		child obj=new child();
		obj.tv();
	}

}
