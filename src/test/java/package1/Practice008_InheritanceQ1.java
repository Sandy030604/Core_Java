package package1;

class Person{
	private String name;
	private float age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	public Person(String name, float age) {
		super();
		this.name = name;
		this.age = age;
	}
}



class Account extends Person{
	private long accNum;
	private double balance;
	private Person accholder;
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
	public Person getAccholder() {
		return accholder;
	}
	public void setAccholder(Person accholder) {
		this.accholder = accholder;
	}
	public static long generateAccNumber()
	{
		long number=(long)(Math.random()*1000000000000l);
		return number;
	}
	public Account(long accNum, double balance, Person accholder) {
		this.accNum = accNum;
		this.balance = balance;
		this.accholder = accholder;
	}
	public void depositAmount(double amount) {
		
		double temp = balance;
		balance += amount;
		if((balance-temp)>=500) {
			
			System.out.println("amount deposited and maintaining sufficient balance");
		}
		
		else {
			System.out.println("amount deposited but maintain sufficient min balance of 500");
		}
	}
	
	public void withDrawAmount(double amount) {
		
		if((balance-amount)>500) {
			
			balance -=amount;
			
			System.out.println("amount withdrawn successfully with current balance : " + this.balance);
		}
		
		else {
			System.out.println("Insufficient balance");
		}
	}
	@Override
	public String toString() {
		return "Account [accNumber=" + accNum + ", balance=" + balance + ", accHolder=" + accholder.getName() + ", " + accholder.getAge() +"]";
	}
	
	
}
public class Practice008_InheritanceQ1 {

	public static void main(String args[])
	{
		 Account Smith=new Account(Account.generateAccNumber(),2000,new Person("Smith",23));
		 Account kathy=new Account(Account.generateAccNumber(),3000,new Person("Kathy",24));
		
		 Smith.depositAmount(2000);
		 System.out.println("Updated balance for smith: "+Smith.getBalance());
		 
		 kathy.withDrawAmount(3000);
		 System.out.println("Updated balance for kathy: "+kathy.getBalance());
		
	}
}






//
//package package1;
//
//class Person {
//    private String name;
//    private float age;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public float getAge() {
//        return age;
//    }
//
//    public void setAge(float age) {
//        this.age = age;
//    }
//
//    public Person(String name, float age) {
//        this.name = name;
//        this.age = age;
//    }
//}
//
//class Account extends Person {
//    private long accNum;
//    private double balance;
//
//    public long getAccNum() {
//        return accNum;
//    }
//
//    public void setAccNum(long accNum) {
//        this.accNum = accNum;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
//
//    // Generate random account number
//    public static long generateAccNumber() {
//        long number = (long) (Math.random() * 1000000000000L);
//        return number;
//    }
//
//    // Constructor with super call to initialize name and age
//    public Account(long accNum, double balance, String name, float age) {
//        super(name, age); // Call the Person constructor
//        this.accNum = accNum;
//        this.balance = balance;
//    }
//
//    public void depositAmount(double amount) {
//        double temp = balance;
//        balance += amount;
//        if ((balance - temp) >= 500) {
//            System.out.println("Amount deposited and maintaining sufficient balance");
//        } else {
//            System.out.println("Amount deposited but maintain sufficient min balance of 500");
//        }
//    }
//
//    public void withDrawAmount(double amount) {
//        if ((balance - amount) > 500) {
//            balance -= amount;
//            System.out.println("Amount withdrawn successfully with current balance: " + this.balance);
//        } else {
//            System.out.println("Insufficient balance");
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "Account [accNumber=" + accNum + ", balance=" + balance + ", accHolder=" + getName() + ", " + getAge() + "]";
//    }
//}
//
//public class Practice008_Qno12 {
//    public static void main(String[] args) {
//        // Create account objects for Smith and Kathy
//        Account Smith = new Account(Account.generateAccNumber(), 2000, "Smith", 23);
//        Account Kathy = new Account(Account.generateAccNumber(), 3000, "Kathy", 24);
//
//        // Deposit amount for Smith
//        Smith.depositAmount(2000);
//        System.out.println("Updated balance for Smith: " + Smith.getBalance());
//
//        // Withdraw amount for Kathy
//        Kathy.withDrawAmount(3000);
//        System.out.println("Updated balance for Kathy: " + Kathy.getBalance());
//    }
//}

