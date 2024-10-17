package package1;

public class TC025_Array1 {
	public static void main(String args[])
	{
		int a[]=new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		String b[]=new String[2];
		b[0]="apple";
		b[1]="orange";
		
		System.out.println("the value is:"+(a[0]+a[1]));//the value is: 300
		
		
		int c[][]=new int[1][2];
		c[0][0]=1000;
		c[0][1]=2000;
		System.out.println("The value is: "+(c[0][0]+c[0][1]));
	}
}