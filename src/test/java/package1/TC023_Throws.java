package package1;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TC023_Throws {
	
	static void fileopen1() throws FileNotFoundException
	{
		System.out.println("Inside the method");
		FileReader fd=new FileReader("text.txt");   //step 2:it will search for text.txt file but it is not found so it will search for try catch but there is no try catch but there is "throws"
	}
	
    public static void main(String args[])
    {
         try {
    		 fileopen1(); //step 1: it will go to fileopen1() method
    	 }
    	 catch(FileNotFoundException e)
    	 {
    		 System.out.println(e.getMessage()); //step 3: It throws the exception so we should handle it here
    	 }
     }
}
