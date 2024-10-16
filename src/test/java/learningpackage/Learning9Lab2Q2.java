package learningpackage;

import java.util.Scanner;

class SavingsAccountsk extends Account{
	private final int minimumBalance=500;
	public SavingsAccountsk(String name, int age, long accNum, double balance) {
		super(name, age, accNum, balance);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double withdrawAmount(int z)
	{
		if(getBalance()-z>=minimumBalance)
		{
			System.out.println("Withdraw can happen");
			return super.withdrawAmount(z);
		}
		else
		{
			System.out.println("Sorry As your balance is so low you cannot withdraw amount");
			return getBalance();
		}
	}
	
	
}


class CurrentAccountsk extends Account {
    private final int overdraftLimit = 50000;

    public CurrentAccountsk(String name, int age, long accNum, double balance) {
        super(name, age, accNum, balance);
    }

    @Override
    public double withdrawAmount(int z) {
        if (getBalance() - z >= -overdraftLimit) {
            System.out.println("Withdrawal allowed. Processing...");
            return super.withdrawAmount(z); 
        } else {
            System.out.println("Withdrawal denied. Overdraft limit exceeded.");
            return getBalance();
        }
    }

    public boolean canWithdraw(int z) {
        if (getBalance() - z >= overdraftLimit) {
            withdrawAmount(z);  
            return true; 
        } else {
            System.out.println("Withdrawal denied. Overdraft limit exceeded.");
            return false;  
        }
    }
}


public class Learning9Lab2Q2 {
	public static void main(String args[])
	{
		Scanner sk=new Scanner(System.in);
		CurrentAccountsk currentAccount = new CurrentAccountsk("Krishnan", 30, Account.generateAccNumber(), 10000);
		
		
		currentAccount.withdrawAmount(600);
        System.out.println("Current Account Initial Balance: " + currentAccount.getBalance());
        
        System.out.println("Enter the Amount You Want to Withdraw in considering the overdraft limit:")
        boolean result = currentAccount.canWithdraw(sk.nextInt());  // This checks with boolean logic
        System.out.println("Withdrawal successful? " + result);

        System.out.println("Current Account Final Balance: " + currentAccount.getBalance());
		
	}

}
