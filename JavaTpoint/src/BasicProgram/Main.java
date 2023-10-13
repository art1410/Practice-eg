package BasicProgram;
import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int x =100;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Fibonacci series
		Fibonacci fb = new Fibonacci();
//		fb.fibonacci(12);
		palindrome pd = new palindrome();
//		pd.Palindrome();
//		pd.reversal();
		factorial ft= new factorial();
//		ft.Factorial();

//ATM code 
		ATM atm = new ATM();
		
//		System.out.println("Welcome to ATM : "+"\n Select the option you want to proceed with: \n1.Check Balance\n2.Withdraw\n3.Deposit");
//		int option=sc.nextInt();
//		if(option == 1 ) {
//			atm.checkBalance();
//		}
//		if(option == 2) {
//			atm.Withdraw();
//		}
//		if(option == 3) {
//			atm.Deposit();
//		}
//End of ATM code 
		
// Copy array code
		copyArray cA= new copyArray();
//		cA.Copyarray();
  // typecasting 
		int num= (int)(54.67f);
//		System.out.println(num);
		//Leap Year assignment
	//	leapYear lp=new leapYear();
//		System.out.println(lp);
		//Multiplication Table
//		Multiplication multi = new Multiplication();
//		multi.MultiplicationTable();
// Largest Number out of 3 
		LargestNum lm = new LargestNum();
//		lm.LargestNum();
		// Count of the digit in a given Number
		Numbers nm=new Numbers();
//		nm.Numbers();
// Reverse Number 
		ReverseNumber rvn=new ReverseNumber();
		//rvn.ReverseNumber();
//take input till it is x
		InputX ix = new InputX();
		//ix.InputX();
		//ix.Day();
		//ix.empid();
/*		String name = "AT";
		Changename(name);
		System.out.println(name);
Passing regference		
*/
		
		// PassingValue
/*		int arr[] = {1,2,3,4};
		change(arr);
		System.out.println(Arrays.toString(arr));
*/
		
/*	Shadowing sg=new Shadowing();
	sg.shadowing();
		Prime Pm=new Prime();
		Pm.isPrime();
*/
		//Armstrong number
		//int n = sc.nextInt();
		//System.out.println(isArmstrong(n));
		for(int i=100;i<1000;i++) {
			if(isArmstrong(i)==true) {
				System.out.println(i);
			}
		}
		
	}   // End of Main Method

/*	static void change(int[] nums) {
		// TODO Auto-generated method stub
		nums[2] = 20;
	}
*/	
	
/*	static void Changename(String naam) {
		naam = "AB";
	}
*/
	
	//Print all 3 digits Armstrong number
	static boolean isArmstrong(int n) {
		int original = n;
		int sum = 0;
		while(n>0) {
			int rem=n%10;
			n=n/10;
			sum = sum+rem*rem*rem;
		}
		return sum == original;
		
	}
 

	
	
}