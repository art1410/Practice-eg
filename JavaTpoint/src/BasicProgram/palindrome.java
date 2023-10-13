package BasicProgram;

public class palindrome extends Main{
	public void Palindrome() {
	int r,sum=0,temp,num;
	System.out.println("Enter a number to check if it's Palindrome or not : ");
	num=sc.nextInt();
	temp=num;
	while(num>0) {
		r=num%10;//Get the last digit
		sum=(sum*10)+r;//build the reverse no
		num=num/10;//remove the last digit
		
	}
	if(num==sum) {
		System.out.println("it's palindrome");
		
	}
	else {
		System.out.println("not a palindrome!!");
	}
	}
	public void reversal() {
		System.out.println("Enter a series of number without space to find the reversed version of the same : ");
		int number=sc.nextInt();
		int reverse = 0,remainder;
		while(number != 0) {
			remainder=number%10;
			reverse = reverse*10+remainder;
			number = number/10;
			
		}
		System.out.println("reverse of the number is : "+reverse);
		
	}
}
