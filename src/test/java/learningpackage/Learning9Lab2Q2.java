package learningpackage;

import java.util.Scanner;

class SavingsAccountsk extends Account{
	private final int minimumBalance=500;
	public SavingsAccountsk(String name, int age, long accNum, double balance) {
		super(name, age, accNum, balance);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void withdrawAmount(int z)
	{
		if(getBalance()-z>=minimumBalance)
		{
			System.out.println("Withdraw can happen");
			//return super.withdrawAmount(z);
		}
		else
		{
			System.out.println("Sorry As your balance is so low you cannot withdraw amount");
			//return getBalance();
		}
	}
	
	
}


class CurrentAccountsk extends Account{
	int overdraftLimit=500000;
	public boolean withdrawAmount(int z)
	{
		return true;
	}
	
}

public class Learning9Lab2Q2 {
	public static void main(String args[])
	{
		Scanner sk=new Scanner(System.in);
		System.out.println("Enter minimum balance: ");
		int z=sk.nextInt();
	}

}
