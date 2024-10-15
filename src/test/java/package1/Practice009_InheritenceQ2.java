package package1;

class SavingsAccount extends Account{
	
	
	private final double minbalance = 500;
 
	public double getMinbalance() {
		return minbalance;
	}
 
 
	public SavingsAccount(long accNumber, double balance, Person accHolder) {
		super(accNumber, balance, accHolder);
		// TODO Auto-generated constructor stub
		
		System.out.println("In class Savings account");
	}
 
	
	public void withDrawAmount(double amount) {
		
		double getBalance = super.getBalance();
		// TODO Auto-generated method stub
		if(getBalance - amount > minbalance) {
			
			getBalance -= amount;
			
			super.setBalance(getBalance);
			
			System.out.println("Account balance After withdrawel is : " + super.getBalance());
			
		}
		else {
			
			System.out.println("Account has insufficient balance");
		}
	}
	
}

class CurrentAccount extends Account{
	
	private final long overdraftLimit = 100000;
 
	public CurrentAccount(long accNumber, double balance, Person accHolder) {
		super(accNumber, balance, accHolder);
		// TODO Auto-generated constructor stub
	}
 
	public long getOverdraftLimit() {
		return overdraftLimit;
	}
 
	@Override
	public void withDrawAmount(double amount) {
		// TODO Auto-generated method stub
		super.withDrawAmount(amount);
	}
	
	
	
	public boolean withDrawAmount1(double amount) {
		
		double balance = super.getBalance();
		if(balance>=overdraftLimit) {
			
			return false;
		}
		
		else {
			withDrawAmount(amount);
			return true;
		}
	}
}
public class Practice009_InheritenceQ2 {
	public static void main(String args[])
	{
		SavingsAccount accForSmith = new SavingsAccount(Account.generateAccNumber(),
				2000, new Person("Smith", 23));
		
		CurrentAccount accForSmith2 = new CurrentAccount(Account.generateAccNumber(),
				2000, new Person("Smith", 23));
		
		accForSmith.withDrawAmount(2500);
		accForSmith2.withDrawAmount1(2500);
		
		System.out.println(accForSmith.toString());
		
		
		System.out.println();
		
		SavingsAccount accForkathy = new SavingsAccount(Account.generateAccNumber(), 3000,
				new Person("Kathy", 30));
		
		CurrentAccount accForkathy2 = new CurrentAccount(Account.generateAccNumber(), 4000,
				new Person("Kathy",30));
		
		accForkathy.withDrawAmount(1000);
		accForkathy2.withDrawAmount1(3000);
		
		System.out.println(accForkathy.toString());
		System.out.println(accForkathy2.toString());
		
	}

}



//package package1;
//
//// Person class remains the same
//class Person {
//    private String name;
//    private float age;
//
//    public Person(String name, float age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public float getAge() {
//        return age;
//    }
//}
//
//// Account class remains the same
//class Account extends Person {
//    private long accNum;
//    private double balance;
//
//    public Account(String name, float age, long accNum, double balance) {
//        super(name, age); // Call Person constructor
//        this.accNum = accNum;
//        this.balance = balance;
//    }
//
//    public long getAccNum() {
//        return accNum;
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
//    // Deposit amount method
//    public void depositAmount(double amount) {
//        balance += amount;
//        System.out.println("Amount deposited. Current balance: " + balance);
//    }
//
//    // Withdraw method to be overridden by subclasses
//    public void withDrawAmount(double amount) {
//        System.out.println("Withdrawal method in Account class");
//    }
//}
//
//// SavingsAccount class
//class SavingsAccount extends Account {
//    final int minimum_balance = 500;
//
//    public SavingsAccount(String name, float age, long accNum, double balance) {
//        super(name, age, accNum, balance); // Call the Account constructor
//    }
//
//    // Override the withdraw method to check for minimum balance
//    @Override
//    public void withDrawAmount(double amount) {
//        if (getBalance() - amount >= minimum_balance) {
//            setBalance(getBalance() - amount);
//            System.out.println("Withdraw successful! New balance: " + getBalance());
//        } else {
//            System.out.println("Insufficient balance. Cannot withdraw below the minimum balance of " + minimum_balance);
//        }
//    }
//}
//
//// CurrentAccount class
//class CurrentAccount extends Account {
//    private double overdraft_limit;
//
//    public CurrentAccount(String name, float age, long accNum, double balance, double overdraft_limit) {
//        super(name, age, accNum, balance); // Call the Account constructor
//        this.overdraft_limit = overdraft_limit;
//    }
//
//    // Override the withdraw method to check overdraft limit
//    @Override
//    public void withDrawAmount(double amount) {
//        if (getBalance() - amount >= -overdraft_limit) {
//            setBalance(getBalance() - amount);
//            System.out.println("Withdraw successful! New balance: " + getBalance());
//        } else {
//            System.out.println("Overdraft limit exceeded. Cannot withdraw.");
//        }
//    }
//}
//
//// Main class for testing
//public class Practice009_InheritenceQ2 {
//    public static void main(String args[]) {
//        // Test SavingsAccount
//        SavingsAccount savings = new SavingsAccount("John", 30, 123456789L, 5000);
//        savings.withDrawAmount(4600); // This should succeed
//        savings.withDrawAmount(100);  // This should fail (below minimum balance)
//
//        // Test CurrentAccount
//        CurrentAccount current = new CurrentAccount("Jane", 35, 987654321L, 2000, 1000);
//        current.withDrawAmount(2500); // This should succeed (within overdraft limit)
//        current.withDrawAmount(1000); // This should fail (overdraft limit exceeded)
//    }
//}
//
