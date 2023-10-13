package BasicProgram;

public class ATM extends Main {
	double Balance=20000;
	void checkBalance() {
		System.out.println("Yur current Balance is : "+Balance);
	}
	void Withdraw() {
		
		System.out.println("Enter the amount you want to withdraw :");
		double withdraw=sc.nextDouble();
		if(withdraw<=Balance) {
			System.out.println("You have succesfully withdrawm the amount ."+withdraw);
			Balance=Balance-withdraw;
		}
		else {
			System.out.println("You don't have enough Balance!!");
		}
	}
	void Deposit() {
		double deposit;
		System.out.println("Enter the amount to Deposit : ");
		deposit=sc.nextDouble();
		if(deposit>0) {
			Balance=Balance+deposit;
			System.out.println("Updated Balance of your Account is : "+Balance);
		}
		else{
			System.out.println("Invalid Amount");
		}
	}

}
