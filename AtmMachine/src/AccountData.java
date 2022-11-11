import java.util.HashMap;
import java.util.Scanner;

public class AccountData {
	
	Scanner sc = new Scanner(System.in);
	HashMap<Integer, Integer> loginData = new HashMap<>();

	double checkingAccountBal; 
	double savingAccountBal; 
	
	AccountData(){
		loginData.put(123456, 123);
	}
	
	protected HashMap<Integer, Integer> getLoginDetails() {
		return loginData;
	}
	
	public double getcheckingkBalance() {
		return checkingAccountBal;
	}
	
	public double getSavingBalance() {
		return savingAccountBal;
	}
	
	public void getCheckingWithdraw() {
		System.out.print("\nEnter your Amount: ");
		double input = sc.nextDouble();
		
		if(input <= checkingAccountBal) {
			checkingAccountBal -= input;
			System.out.println("Please collect your cash: "+input);
			System.out.println("Your current Checking Account balance is Rs"+checkingAccountBal);
		}else {
			System.out.println("You have insufficient Balance");
			System.out.println("Your checking Account current balance is Rs"+checkingAccountBal);
		}
	}
	
	public void getSavingWithdraw() {
		System.out.print("\nEnter your Amount: ");
		double input = sc.nextDouble();
		
		if(input <= savingAccountBal) {
			savingAccountBal -= input;
			System.out.println("Please collect your cash: "+input);
			System.out.println("Your current Account balance is Rs"+savingAccountBal);
		}else {
			System.out.println("You have insufficient Balance");
			System.out.println("Your current Account balance is Rs"+savingAccountBal);
		}
	}
	
	public void getCheckingDeposit() {
		System.out.println("\nYour Checking account Balance is: Rs"+checkingAccountBal);
		System.out.print("Enter your Amount: ");
		
		
		double input = sc.nextDouble();
		if(input >= 0) {
			checkingAccountBal += input;
			System.out.println("New Checking account Balance is: Rs"+checkingAccountBal);
		}else {
			System.out.println("Wrong Input\nAmount cannot be Negative");
		}

	}
	
	public void getSavingDeposit() {
		System.out.println("\nYour Saving account Balance is: Rs"+savingAccountBal);
		System.out.print("Enter your Amount: ");
		
		
		double input = sc.nextDouble();
		if(input >= 0) {
			savingAccountBal += input;
			System.out.println("New Saving account Balance is: Rs"+savingAccountBal);
		}else {
			System.out.println("Wrong Input\nAmount cannot be Negative");
		}

	}
}
