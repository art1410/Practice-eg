package BasicProgram;

public class Numbers {
	void Numbers() {
		 int n = 33423412;
		int count=0;
		while(n>0) {
			int rem=n%10;
			if(rem == 4) {
				count++;
			}n=n/10;
		}System.out.println(count);
	}

}
