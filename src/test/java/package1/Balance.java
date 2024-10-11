//Balance question step 1
package package1;


public class Balance {
	String name;
	double bal;
	public Balance(String n,double b)
	{
		name=n;
		bal=b;
	}
	public void show()
	{
		if(bal<0)
		{
			System.out.println("Balance of"+name+"is:"+bal);
		}
	}
}
