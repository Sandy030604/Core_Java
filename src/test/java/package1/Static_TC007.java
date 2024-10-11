package package1;

public class Static_TC007 {
	static class Hi{
		static int num4=400;
		int num5=500;
	}
	static int num1=3;
	static int num2;
	
	
	final int a=1000;
	int b=2000;
	
	
	static {
		System.out.println("Static block");
	}
	static void mymethod(int num3)
	{
		System.out.println("Number1: "+num1);
		System.out.println("Number 2: "+num2);
		System.out.println("Number 3: "+num3);
	}
	
	public static void main(String args[])
	{
		System.out.println(Hi.num4);
		Hi objsz=new Hi();
		
		//If there is a non static variable in static class to access it we need to create an object to invoke it 
		System.out.println(objsz.num5);
		mymethod(500);
		
		
		//even it is a main class we should create an object to access the variables which is above main method 
		Static_TC007 objdd=new Static_TC007();
		//objdd.a=1500;//it will show error as it is declared as final
		objdd.b=2500;//normal variable value can be changed as it is not final
		//for calling final variable also we should create an object 
	}

}
