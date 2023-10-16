package linearSearch;

public class ElementSearch {
//If the entered element is equal to the target then return the index if not then return -1
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,2,20,12,32};
		int ans=linearSearch(a, 11);
		int ans2= linearSearch2(a, 11);
		int ans3= linearSearch2(a, 20);
		System.out.println(ans3);
//		look(a);

	}
	
	//Best Case O(1)
	static int linearSearch(int a[],int target) {
		if (a.length==0) {
			return -1;
		}
		for(int i=0;i<a.length;i++) {
			int element=a[i];
			if(element == target) {
				return i;
			}
			
		}
		return -1;
		
	}
		//Worst case
	 static void look(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++){
			if(a[i] == 20) {
				System.out.println(a[i]);
			}
			else{
				System.out.println("foff");
			}
		}
	}
	 
	 // Search the target and return the element itself.
	 static int linearSearch2(int a[],int target) {
			if (a.length==0) {
				return -1;
			}
			for(int i=0;i<a.length;i++) {
				int element=a[i];
				if(element == target) {
					return element;
				}
				
			}
			return Integer.MAX_VALUE;
			
		}
	 static boolean linearSearc3(int[] arr, int target) {
		 if(arr.length == 0) {
			 return false;
		 }
		 //run for loop 
		 for (int element : arr) {
			 if (element == target) {
				 return true;
			 }
		 }
		 return false;
	 }
	 

}
