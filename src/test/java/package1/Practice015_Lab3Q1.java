package package1;
class NameException extends Exception{
	//By extending Exception, your NameException class becomes a checked exception. Checked exceptions in Java are used to signal that something might go wrong (like invalid input, I/O errors, etc.), and they must be either handled with a try-catch block or declared in the method signature with throws. That's why the setFirstname method includes throws NameException.
	public NameException()
	{
//		super(message);
		System.out.println("hi");
	}
//	public String tostring()
//	{
//		return "is an invalid age";
//	}
}
class Personz{
	private String firstname;
	private String lastname;
	private char gender;
	
	
	//default constructor is created because if incase we create an object and assigning values after that line that time this default constructor will support that.
	public Personz()
	{
		this.firstname="";
		this.lastname="";
		//always character inside default constructor should have something like below 
		this.gender='U';
	}
	
	public Personz(String firstname, String lastname, char gender) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
	}
	
	public String getFirstname()  {
		return firstname;
	}
	public void setFirstname(String firstname) throws NameException {
		if(firstname==null || firstname.trim().isEmpty())
		{
			throw new NameException();
		}
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) throws NameException {
		if(lastname==null || lastname.trim().isEmpty())
		{
			throw new NameException();
		}
		this.lastname = lastname;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
}

public class Practice015_Lab3Q1 {

	public static void main(String[] args) {
		try {
		// TODO Auto-generated method stub
		Personz obj=new Personz();
		obj.setFirstname("");
		obj.setLastname("Krishnan");
		obj.setGender('M');
		Personz obj2=new Personz();
		obj2.setFirstname("Sandy");
		obj2.setLastname("");
		obj2.setGender('M');
		
		System.out.println(obj.getFirstname()+"\n"+obj.getLastname()+"\n"+obj.getGender());}
		catch(NameException e)
		{
			System.out.println("Error: "+e.getMessage());
		}
		
	}
    

}
