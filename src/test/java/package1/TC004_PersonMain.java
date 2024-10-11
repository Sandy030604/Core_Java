package package1;

public class TC004_PersonMain {

	String firstname;
	String lastname;
	int num;
	int newnum;
	gender g;
	enum gender{
		Male,Female;
	}
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public int newnumsk()
	{
		return 90005462;
	}
	
	
	public TC004_PersonMain(String firstname, String lastname,int num) {
		// TODO Auto-generated constructor stub
		this.firstname=firstname;
		this.lastname=lastname;
		this.num=num;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public gender getGender() {
		return g;
	}
	public void setGender(gender g) {
		this.g =g;
	}
	
	public static void main(String args[])
	{
	     TC004_PersonMain sk=new TC004_PersonMain("Santhosh","Krishnan",900023456);
	     sk.setGender(gender.Male);
	     System.out.println("Firstname: "+sk.getFirstname()+"\n"+"Lastname: "+sk.getLastname()+"\n"+"Gender: "+sk.getGender());
	     
	     System.out.println("My phone number is: "+sk.getNum());
	     
	     
	     System.out.println(sk.newnumsk());
	     
	}

}
