package arys;

public class ColNoFixed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {
				{1,2,3,4},
				{5,6},
				{4,5,6,7}
				
		}; 
		for (int row=0;row<arr.length;row++) {
			for (int col=0;col<arr[row].length;col++) {
				System.out.print(arr[row][col]+ " ");
			}
			System.out.println();
		}

	}

}
