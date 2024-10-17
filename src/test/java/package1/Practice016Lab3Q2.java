package package1;

class InvalidAgeException extends Exception{
	public InvalidAgeException()
	{
		
		System.out.println("Bye");
	}
}
class Person0{
	private String name;
	private int age;
	
	public Person0(String name, int age) throws InvalidAgeException {
		super();
		this.name = name;
		if(age<=15)
		{
			throw new InvalidAgeException();
		}
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws InvalidAgeException {
		if(age <= 15)
		{
			throw new InvalidAgeException();
		}
	}
	
	
}
class Accountzz extends Person0{
	private long accNum;
	private double balance;
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public static long generateAccNumber() {
		long number = (long) (Math.random() * 1000000000000L);
        return number;
    }
	public Accountzz(String name,int age,long accNum, double balance) throws InvalidAgeException{
		super(name,age);
		this.accNum = accNum;
		this.balance = balance;
	}
	public void printDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Account Number: " + getAccNum());
        System.out.println("Balance: " + getBalance());
    }
	public double depositAmount(int addbalance)
	{
		balance+=addbalance;
		return balance; 
		
		
	}
	public double withdrawAmount(int withdrawbalance)
	{
		balance-=withdrawbalance;
		return balance;
	}
	@Override
    public String toString() {
        return "Account Holder: " + getName() +
               ", Age: " + getAge() +
               ", Account Number: " + getAccNum() +
               ", Balance: " + getBalance();
    }
	
	
}

public class Practice016Lab3Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Accountzz Santhosh=new Accountzz("Santhosh",14,Accountzz.generateAccNumber(),2000.00);
		Accountzz Krishnan=new Accountzz("Kathy",21,Accountzz.generateAccNumber(),3000.00);
		Santhosh.depositAmount(2000);
		Krishnan.withdrawAmount(2000);
		System.out.println(Santhosh.toString());
		System.out.println(Krishnan.toString());
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
