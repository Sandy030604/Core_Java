package package1;


interface simplecalc
{
	int add(int a,int b);
	int i=10;
//	void multi()
//	{
//		
//	} //we cannot have methods with definition
}

class calc implements simplecalc
{
	public int add(int a,int b)
	{
		return a+b;
	}
}

public class TC018_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc obj=new calc();
		System.out.println("Addition is"+obj.add(10,10));

	}

}
