package BasicProgram;



public class Fibonacci extends Main{
	int n1=0,n2=1,n3;
	public void fibonacci(int count) {
	if(count>0) {
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.println(" "+n3);
		fibonacci(count-1);
	}
		count=sc.nextInt();
		System.out.println(n1+" "+n2);
		fibonacci(count-2);
	
}
}
