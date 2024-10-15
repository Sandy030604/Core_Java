package learningpackage;
class Person{
	private String firstname;
	private String lastname;
	private char gender;
	
	
	//default constructor is created because if incase we create an object and assigning values after that line that time this default constructor will support that.
	public Person()
	{
		this.firstname="";
		this.lastname="";
		//always character inside default constructor should have something like below 
		this.gender='U';
	}
	
	public Person(String firstname, String lastname, char gender) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
}

public class Learning3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj=new Person();
		obj.setFirstname("santhosh");
		obj.setLastname("Krishnan");
		obj.setGender('M');
		Person obj2=new Person("Sandy","Krish",'M');
		
		System.out.println(obj.getFirstname()+"\n"+obj.getLastname()+"\n"+obj.getGender());
		
	}

}
