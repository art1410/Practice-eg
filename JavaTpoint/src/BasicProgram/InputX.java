package BasicProgram;

public class InputX extends Main {
	void InputX() {
		// take input till it is x
		int sum=0;
		while(true) {
			System.out.println("Enter the number : ");
			String input = sc.next();      //taking the input 
			if(input == "x") {
				break;
			}
			try {
				int number = Integer.parseInt(input);
				sum = sum + number;
			}
			catch(NumberFormatException e){
				System.out.println("Invalid input");
			}
		}
	}
	void Day() {
		int day= sc.nextInt();
		switch(day){
			case 1: 
				System.out.println("Monday");
				break;
			case 2 : 
				System.out.println("Tuesday");
				break;
			
			case 3 : 
				System.out.println("Wednesday");
				break;
			case 4 : 
			System.out.println("THursday");
			break;
			case 5 : 
			System.out.println("Friday");
			break;
			case 6 : 
			System.out.println("Saturday");
			break;
			case 7 : 
			System.out.println("Sunday");
			break;
			default : 
				System.out.println("Enter a valid Input");
		}
		
	}
	void empid() {
		int empid = sc.nextInt();
		String Department = sc.next();
		switch(empid) {
		case 1 -> System.out.println("Alex Martin");
		case 2 -> System.out.println("Martin Josh");
		case 3 -> {
			System.out.println("caliber Cross");
			switch(Department) {
			case "IT" -> System.out.println("IT Department");
			case "Law" -> System.out.println("Law Department");
			case "Tax" -> System.out.println("Tax Department");
			default ->  System.out.println("Enter valid input");
			
			
			}
			
		}
		default ->  System.out.println("Enter valid input");
		}
		
		
		}
		

}
