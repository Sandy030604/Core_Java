package package1;

import java.util.Arrays;

public class Practice017_Lab3Q4 {
	public static void main(String args[])
	{
		String[] names=new String[4];
		names[0]="Santhosh";
		names[1]="Krishnan";
		names[2]="raja";
		names[3]="sk";
		for(int i=0;i<names.length;i++)
		{
			names[i]=names[i].toLowerCase();
		}
		Arrays.sort(names);
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
	}
}
