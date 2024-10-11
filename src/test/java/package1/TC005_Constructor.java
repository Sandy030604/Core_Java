package package1;

public class TC005_Constructor {
	int xcor;
	int ycor;
	public TC005_Constructor(int xcor,int ycor)
	{
		this.xcor=xcor;
		this.ycor=ycor;
	}
	
	public void add()
	{
		System.out.println("Addition"+(xcor+ycor));
//		we should mention like this as there is already a string 
	}

}
