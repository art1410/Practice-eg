package BasicProgram;

public class Shadowing extends Main {
	static int x=200;
	public static void shadowing() {
		fun();
		System.out.println(x);
		int x =  10;
		System.out.println(x);
		
	}
static void fun() {
	System.out.println(x);
}
}
