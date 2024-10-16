package learningpackage;

class Person6{
	private String name;
	private int age;
	
	public Person6(String name, int age) {
		super();
		this.name = name;
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
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
class Account extends Person6{
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
	public Account(String name,int age,long accNum, double balance) {
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

public class Learning8Lab2Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account Santhosh=new Account("Santhosh",21,Account.generateAccNumber(),2000.00);
		Account Krishnan=new Account("Kathy",21,Account.generateAccNumber(),3000.00);
		Santhosh.depositAmount(2000);
		Krishnan.withdrawAmount(2000);
		System.out.println(Santhosh.toString());
		System.out.println(Krishnan.toString());
		
		
	}

}
