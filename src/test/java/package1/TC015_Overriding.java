/**
 * 
 */
package package1;

/**
 * @author santhosh.krishnan
 *
 */

class SwipeMachine1{
	void readcard()
	{
		System.out.println("Readcard from parent");
	}
	void writecard()
	{
		System.out.println("writecard from parent");
	}
}
class ChipcardMachine extends SwipeMachine1{
	void readcard()
	{
		System.out.println("Readcard from child");
	}
	void writecard()
	{
		super.writecard();
		System.out.println("writecard from child");
	}
}
public class TC015_Overriding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChipcardMachine obj1=new ChipcardMachine();
		obj1.readcard(); //readcard from child
		obj1.writecard();
//		Readcard from child
//		writecard from parent
//		writecard from child
		
		SwipeMachine1 obj2=new SwipeMachine1();
		obj2.readcard();//Readcard from parent
		obj2=new ChipcardMachine();
		obj2.readcard();//Readcard from child 
	}

}
