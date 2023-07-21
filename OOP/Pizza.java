
public class Pizza {
	//Overloading Constructors = multiple parameters in constructors
	String Bread;
	String Cheese;
	String toppings;
	Pizza(String Bread){
		this.Bread=Bread;
		
		
		
	}
	Pizza(String Bread,String Cheese){
		this.Bread=Bread;
		this.Cheese=Cheese;
		
		
	}
	Pizza(String Bread,String Cheese,String toppings){
		this.Bread=Bread;
		this.Cheese=Cheese;
		this.toppings=toppings;
		
	}

}
