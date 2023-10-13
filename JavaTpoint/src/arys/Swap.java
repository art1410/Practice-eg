package arys;

import java.util.Arrays;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1 , 2 , 3 , 4};
		reverse(arr);
		System.out.println(Arrays.toString(arr));

	}
	//reversing an array
	static void reverse(int[] arr) {
		int start= 0;
		int end = arr.length-1;
		while(start<end) {
			swap(arr,start,end);
			start++;
			end--;
		}
		
	}

	private static void swap(int[] arr, int index1, int index2) {
		// TODO Auto-generated method stub
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		
	}
	
	

	

}
