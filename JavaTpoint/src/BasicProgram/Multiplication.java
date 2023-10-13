package BasicProgram;

public class Multiplication extends Main{
	public void MultiplicationTable(){
		int num;
	System.out.println("Enter the Number for it's Multiplication Table :");
	num=sc.nextInt();
	if(num>0) {
		for(int count=1;count<=10;count++) {
			System.out.println(num*count);
			
		}
	}
	
	}

}
