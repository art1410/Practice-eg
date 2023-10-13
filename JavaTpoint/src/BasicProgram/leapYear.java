package BasicProgram;
import java.util.Scanner;
public class leapYear extends Main{
	leapYear() {
	
	int year;
	System.out.println("Enter an year : ");
	year=sc.nextInt();
	if(year%4==0) {
		System.out.println("Year"+year+" is a leap year ");
		}
	else {
		System.out.println("Year"+year+" is not a leap year ");
	}
	}
}
