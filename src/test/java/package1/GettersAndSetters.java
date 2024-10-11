package package1;

public class GettersAndSetters {
	
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String args[])
	{
		GettersAndSetters obj=new GettersAndSetters();
		obj.setName("Leela");
		System.out.println("Name is:"+obj.getName());
		obj.setAge(25);
		System.out.println("Age is:"+obj.getAge());
		
	}

}
