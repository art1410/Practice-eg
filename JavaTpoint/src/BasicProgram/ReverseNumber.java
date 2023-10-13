package BasicProgram;

public class ReverseNumber {
	void ReverseNumber() {
		int n= 1234;
		int ans=0;
		while(n>0) {
			int rem=n%10;
			n=n/10;
			ans = ans*10+rem;
		}System.out.println(ans);
	}

}
