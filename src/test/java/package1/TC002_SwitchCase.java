package package1;

public class TC002_SwitchCase {
	public static void main(String args[])
	{
		for(int i=0;i<=4;i++)
		{
			switch(i)
			{
			case 0:
				System.out.println("i is zero");
				break;
			case 1: 
				System.out.println("i is one");
				break;
			case 2:
			    System.out.println("i is two");
			    break;
		    default: 
				System.out.println("i is nothing");
				break;
			}
		}
		int i=3;
		while(i<=4)
		{
			System.out.println("i value is"+ i);
			i++;
		}
		
		int k=4;
		do
		{
			System.out.println("Do while working");
		}while(k>4);
		
		for(int l=6;l>=1;l--)
		{
			System.out.println(l+" ");
		}
	}

}
