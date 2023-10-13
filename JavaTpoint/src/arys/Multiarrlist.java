package arys;
import java.util.ArrayList;
import java.util.Scanner;
public class Multiarrlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		//Initialize
		for(int i = 0;i<2;i++) {
			list.add(new ArrayList<Integer>());
		}
		//add elements
		for(int row=0;row<2;row++) {
			for(int col=0;col<2;col++) {
				list.get(row).add(sc.nextInt());
			}
		}
		//output
		System.out.println(list);

	}

}
