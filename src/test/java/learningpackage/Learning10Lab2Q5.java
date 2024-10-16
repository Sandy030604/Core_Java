package learningpackage;

class Person7{
	private String name;
	private int age;
	
	public Person7(String name, int age) {
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
abstract class Account1 extends Person7{
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
	public Account1(String name,int age,long accNum, double balance) {
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
	abstract public double withdrawAmount(int withdrawbalance);
	
	
	
	@Override
    public String toString() {
        return "Account Holder: " + getName() +
               ", Age: " + getAge() +
               ", Account Number: " + getAccNum() +
               ", Balance: " + getBalance();
    }
	
	
}

class SavingsAccount1 extends Account1 {
    public SavingsAccount1(String name, int age, long accNum, double balance) {
        super(name, age, accNum, balance);
    }

    @Override
    public double withdrawAmount(int withdrawbalance) {
        double balance = getBalance();
        if (balance >= withdrawbalance) {
            setBalance(balance - withdrawbalance);
            return getBalance();
        } else {
            System.out.println("Insufficient balance");
            return balance;
        }
    }
}

public class Learning10Lab2Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount1 Santhosh=new SavingsAccount1("Santhosh",21,Account.generateAccNumber(),2000.00);
		SavingsAccount1 Krishnan=new SavingsAccount1("Krishnan",21,Account.generateAccNumber(),3000.00);
		Santhosh.depositAmount(2000);
		Krishnan.withdrawAmount(2000);
		System.out.println(Santhosh.toString());
		System.out.println(Krishnan.toString());
		
		
	}

}

