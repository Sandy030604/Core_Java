package package1;

public class TC21Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int res=10/0;//arithmetic error
			int[] number= {1,2,3};
			System.out.println(number[5]);
			
			String text=null;
			System.out.println("Length of the string is: "+text.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Error: "+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("INdex out of bounds error: "+e1.getMessage());
		}
		catch(NullPointerException e2)
		{
			System.out.println("Null pointer error: "+e2.getMessage());
		}
		catch(Exception e3)
		{
			System.out.println("Unexpected error: "+e3.getMessage());
		}
		finally {
			System.out.println("This is the finally block");
		}

	}

}
