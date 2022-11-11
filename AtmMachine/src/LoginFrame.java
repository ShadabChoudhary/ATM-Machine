import java.util.HashMap;
import java.util.Scanner;

public class LoginFrame extends AccountData{
	Scanner sc = new Scanner(System.in);
	HashMap<Integer, Integer> loginInfo = new HashMap<>();
	
	boolean islogedIn;
	int accNum;
	int	accPin;
	
	public LoginFrame(HashMap<Integer, Integer> loginDetails) {
		loginInfo = loginDetails;
		
		getLogin();
	}
	
	public void getLogin() {
		
			System.out.println("Welcome!");
			
			System.out.print("Enter your Account Number: ");
			accNum = sc.nextInt();
			
			System.out.print("Enter your Pin: ");
			accPin = sc.nextInt();
			
			if(loginInfo.containsKey(accNum) && loginInfo.get(accNum).equals(accPin)) {
				System.out.println("LoggedIn");
				getAccountType();
			}else {
				System.out.println("Wrong Account Number or Pin");
			}
		
	}

	private void getAccountType() {
		
		System.out.println("\nSelect the Account you want to access");
		System.out.println("Type 1: Checking Account");
		System.out.println("Type 2: Saving Account");
		System.out.println("Type 3: Exit");
		
		System.out.print("Your Choice: ");
		
		int selectedType = sc.nextInt();
		
		switch(selectedType) {
		case 1: getChecking();
				break;
				
		case 2: getSaving();
				break;
				
		case 3: System.out.println("Thank you for using this ATM");
				System.exit(0);
				break;
				
		default:System.out.println("Invalid Choice");
				System.out.println("Please Enter the given Options");
				getAccountType();
		}
		
	}

	private void getSaving() {
		while(true) {
			System.out.println("\nSaving Account: ");
			System.out.println("Type 1: View Balance");
			System.out.println("Type 2: Withdraw");
			System.out.println("Type 3: Deposit");
			System.out.println("Type 4: back");
			System.out.println("TYpe 5: exit");
			
			System.out.print("Your Choice: ");
			
			int selectedType = sc.nextInt();
			
			switch(selectedType) {
			case 1: System.out.println("\nYour Saving account Balance is: "+getSavingBalance());
					break;
					
			case 2:getSavingWithdraw();
					break;
					
			case 3:getSavingDeposit();
					break;
					
			case 4: getAccountType();
					break;
					
			case 5: System.out.println("Thank you for using this ATM");
					System.exit(0);
					break;
					
			default:System.out.println("Invalid Choice");
					System.out.println("Please Select the given Options");
					break;
			}
		}
	}

	private void getChecking() {
		while(true) {
			System.out.println("\nChecking Account: ");
			System.out.println("Type 1: View Balance");
			System.out.println("Type 2: Withdraw");
			System.out.println("Type 3: Deposit");
			System.out.println("Type 4: back");
			System.out.println("TYpe 5: exit");
			
			System.out.print("Your Choice: ");
			
			int selectedType = sc.nextInt();
			
			switch(selectedType) {
			case 1: System.out.println("\nYour Checking account Balance is: "+ getcheckingkBalance());
					break;
					
			case 2:getCheckingWithdraw();
					break;
					
			case 3:getCheckingDeposit();
					break;
					
			case 4: getAccountType();
					break;
					
			case 5: System.out.println("Thank you for using this ATM");
					System.exit(0);
					break;
					
			default:System.out.println("Invalid Choice");
					System.out.println("Please Select the given Options");
					break;
			}
		}
		
	}
}
