package package1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TC019_Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputstr="Mango";
		String pattern="Apple";
		boolean patternmatchsk=Pattern.matches(pattern, inputstr);
		System.out.println(patternmatchsk); //true (as both String are same Apple,Apple) 
		
		System.out.println(patternmatchsk);//false (as first string is Mango and second string is Apple)
		
		boolean patternmatchsk1=Pattern.matches("Santhosh","Santhosh");
		System.out.println(patternmatchsk1);//true
		
		
		String input="welcome santhosh";
		Pattern p1=Pattern.compile("santhosh");
		Matcher m1=p1.matcher(input);
		
		while(m1.find())
		{
			System.out.println(m1.group()+":"+m1.start()+":"+m1.end());
		}
		
		
		
		//finding email
		String email="santh_os.hs8483@gmail.co.in";
		Pattern p3=Pattern.compile("^[\\w._]+@[\\w]+\\.[\\w.]{3,6}$"
				+ "");
		Matcher m3=p3.matcher(email);
		if(m3.find())
		{
			System.out.println("Valid email");//Found
			System.out.println(m3.group()+":"+m3.start()+":"+m3.end());
		}
		else
		{
			System.out.println("Not email Found");
		}
		
		
		
		String input3="welcome santhosh";
		Pattern p2=Pattern.compile("welcome .*");
		Matcher m2=p2.matcher(input3);
		if(m2.find())
		{
			System.out.println("Found");//Found
		}
		
		
		
		
		
		// \d for finding digit pattern
		String int1="755034320";
		Pattern p4=Pattern.compile("^\\d{9}$"); //9 represents how many digits
		Matcher m4=p4.matcher(int1);
		if(m4.find())
		{
			System.out.println("Valid number");//Found
		}
		else
		{
			System.out.println("Invalid number");
		}
		
		
		
		
		// \D = for a non digit
		String int2="abcdefghi";
		Pattern p5=Pattern.compile("^\\D{9}$"); //9 represents how many digits
		Matcher m5=p4.matcher(int1);
		if(m5.find())
		{
			System.out.println("Valid Non Digit");//Found
		}
		else
		{
			System.out.println("Invalid number");
		}
		
		
		
		
		// white space check
		String int3="welcome karthik";
		Pattern p6=Pattern.compile(".*\\s.*");
		Matcher m6=p6.matcher(int3);
		if(m6.find())
		{
			System.out.println("There is white space");//O/p:there is white space
		}
		else
		{
			System.out.println("There is no white space");
		}
		
		
		
		
		
		//non-white space check
		String int4="welcome karthik";
		Pattern p7=Pattern.compile("\\S");
		Matcher m7=p7.matcher(int4);
		while(m7.find())
		{
			System.out.println(m7.group()+":"+m7.start());
		}
//		w:0
//		e:1
//		l:2
//		c:3
//		o:4
//		m:5
//		e:6
//		k:8
//		a:9
//		r:10
//		t:11
//		h:12
//		i:13
//		k:14
		//7 is missing so there is a white space 
		
		
		
		
		//Beginning of the line
		//I want beginning to be welcome 
		String int5="hello karthik";
		Pattern p8=Pattern.compile("^hello.*karthik$"); //ending of the line also done here 
		Matcher m8=p8.matcher(int5);
		if(m8.find())
		{
			System.out.println(m8.group()+":"+m8.start());
			System.out.println("Beginning of the line matched");
		}
		else 
		{
			System.out.println("Beginning of the line not matched");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
