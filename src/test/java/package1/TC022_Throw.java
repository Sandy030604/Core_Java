package package1;

import java.io.FileNotFoundException;

public class TC022_Throw {
	//to intentionally create an exception we can use 'throw'
	void proc()
	{
		try {
			throw new FileNotFoundException("From Exception");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Caught inside the demo");
		}
	}
	public static void main(String args[]) 
	{
		TC022_Throw obj=new TC022_Throw();
		obj.proc();
	}

}
