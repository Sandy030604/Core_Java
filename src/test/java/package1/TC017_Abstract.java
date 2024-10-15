package package1;

abstract class Shape{
	//abstract class can have both abstract and non abstract methods
	//abstract class can have both implemented and non implemented methods 
	abstract void draw();
	abstract void paint();
	
	void drink()
	{
		System.out.println("Drunk");
	}
}

class rect extends Shape{
	@Override
	void draw()
	{
		System.out.println("Rectangle");
	}
	void paint()
	{
		System.out.println("Painted");
	}
}

public class TC017_Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rect r1=new rect();
		r1.draw();
		r1.paint();
		r1.drink();
	}

}
