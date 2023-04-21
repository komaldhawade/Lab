package abstraction;

import java.util.Scanner;


abstract class BankAccount
{
	int acc_number, balance;
	
	public BankAccount(int acc_number, int balance)
	{
		this.acc_number = acc_number;
		this.balance = balance;
	}
	abstract void deposit(int amount);
	abstract void withdraw(int amount);
}

class CheckingAccount extends BankAccount
{

	public CheckingAccount(int acc_number, int balance) {
		super(acc_number, balance);
	}

	@Override
	void deposit(int deposit_amount) {
		System.out.println("Balance after deposit: "+(balance+deposit_amount));
	}

	@Override
	void withdraw(int withdraw_amount) {
		if (withdraw_amount<=balance)
		{
			System.out.println("Withdraw successfully!!");
			System.out.println("Current balance : "+(balance-withdraw_amount));
		}
		else
		{
			System.out.println("Insufficient balance");
		}
	}
	
}
public class abstraction2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CheckingAccount ca = new CheckingAccount(123465, 10000);
		do {
			System.out.println("1)Deposit 2)Withdraw  3)Exit");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the amount you want to deposit: ");
				int deposit_amount = sc.nextInt();
				ca.deposit(deposit_amount);
				break;
				
			case 2:
				System.out.println("Enter the amount you want to Withdraw: ");
				int withdraw_amount = sc.nextInt();
				ca.withdraw(withdraw_amount);
				break;
				
			case 3:
				System.out.println("Thank you for visiting !");
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid choice!!");
				break;
			}
		}while(true);

	}

}
