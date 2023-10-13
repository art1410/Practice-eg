package arys;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {23,43,45,65,21};
		System.out.println(max(a));
		System.out.println(maxRange(a,0,2));

	}

	 static int max(int[] a ) {
		// TODO Auto-generated method stub
		int max = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}
	 static int maxRange(int[] a, int start, int end ) {
			// TODO Auto-generated method stub
			int max = a[start];
			for(int i=start;i< end;i++) {
				if(a[i]>max) {
					max=a[i];
				}
			}
			return max;
		}

}
