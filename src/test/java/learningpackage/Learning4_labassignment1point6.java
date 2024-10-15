package learningpackage;
class Person1{
	private String firstname1;
	private String lastname1;
	private char gender1;
	private int number1;
	
	public Person1(String firstname1, String lastname1, char gender1,int number1) {
		super();
		this.firstname1 = firstname1;
		this.lastname1 = lastname1;
		this.gender1 = gender1;
		this.number1=number1;
	}
	public String getFirstname1() {
		return firstname1;
	}
	public void setFirstname1(String firstname1) {
		this.firstname1 = firstname1;
	}
	public String getLastname1() {
		return lastname1;
	}
	public void setLastname1(String lastname1) {
		this.lastname1 = lastname1;
	}
	public char getGender1() {
		return gender1;
	}
	public void setGender1(char gender1) {
		this.gender1 = gender1;
	}
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	public void personalDetails()
	{
		System.out.println("Personal Details:");
		System.out.println("First Name: "+firstname1);
		System.out.println("First Name: "+lastname1);
		System.out.println("First Name: "+gender1);
		System.out.println("First Name: "+number1);
		
	}

	
}

public class Learning4_labassignment1point6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 obj=new Person1("Sk","Pk",'M',764323452);
		obj.personalDetails();

	}

}
