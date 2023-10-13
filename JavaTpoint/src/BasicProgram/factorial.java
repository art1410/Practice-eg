package BasicProgram;

public class factorial extends Main {
	void Factorial() {
		int i,fact=1;
		System.out.println("enter the number to find the factorial:");
		int num = sc.nextInt();
		for (i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println(" "+fact);
	}

}
