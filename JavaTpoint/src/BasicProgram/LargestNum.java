package BasicProgram;

public class LargestNum extends Main {
	//Largest number amongst the input
	void LargestNum() {
	System.out.println("Enter first value");
	int a= sc.nextInt();
	System.out.println("Enter second value");
	int b= sc.nextInt();
	System.out.println("Enter third value");
	int c= sc.nextInt();
	int max=a;
	if(b>max) {
		max=b;
	}
	if(c>max) {
		max=c;
	}
	System.out.println("The maximum number out of 3 is : "+max);
}
}