package package1;

public class TC026_ArrayDemo {
	int intnumbers[];
	TC026_ArrayDemo(int i)
	{
		intnumbers=new int[i];
	}
	void populatearray()
	{
		for(int i=0;i<intnumbers.length;i++)
		{
			intnumbers[i]=i+100;
		}
	}
	void displaycontents()
	{
		for(int i=0;i<intnumbers.length;i++)
		{
			System.out.println("Number"+i+":"+intnumbers[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TC026_ArrayDemo obj=new TC026_ArrayDemo(5);
		obj.populatearray();
		obj.displaycontents();

	}

}
