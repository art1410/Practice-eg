package arys;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		ArrayList<Integer> list = new  ArrayList<>();
//		list.add(10);
//		list.add(2342);
//		System.out.println(list);
//		System.out.println(list.contains(10));
//		list.set(1, 12);
//		System.out.println("Updated list :"+list);
		for(int i=0;i<4;i++) {
			list.add(sc.nextInt());
		}
		System.out.println(list);
		System.out.println(list.get(1));
	}

}
