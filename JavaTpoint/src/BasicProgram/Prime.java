package BasicProgram;

public class Prime extends Main {
	int n=sc.nextInt();
	 void isPrime() {
		if(n<=0) {
			System.out.println("not valid");
			
		}
		int c=2;
		while(c*c<=n) {
			if(n%c == 0) {
				System.out.println("Prime number");
				
			}
			c++;
		}
	}

}
