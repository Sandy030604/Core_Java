package package1;


class Base{
	public void basemethod()
	{
		System.out.println("Method from base class");
	}
}
class Derived extends Base{
	public void derivedmethod()
	{
		super.basemethod(); //if i dont use this line we should mention it in the main method using obj.basemethod()
		System.out.println("Method from derived class");
	}
}

public class TC013_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived obj=new Derived();
		obj.derivedmethod();
		obj.basemethod();
//		Method from derived class
//		Method from base class
		
		
		//Instance of - it is used to find the object is of the class type 
		if(obj instanceof Derived)
		{
			System.out.println("True");
		}//True 
		
		if(obj instanceof Base)
		{
			System.out.println("Very true");
		}//Very true 
		
		
		
	}

}
