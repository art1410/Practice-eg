package BasicProgram;

public class copyArray {
	public void Copyarray() {
	int arr1[]= {1,2,3,4};
	int arr2[]= new int[arr1.length];{
	
	for (int i=0;i<arr1.length;i++) {
	arr2[i]=arr1[i];	
	}
	System.out.println("Array 1 is : ");
	for(int i=0;i<arr2.length;i++) {
		System.out.println(""+arr1[i]);
	}
	System.out.println();
	System.out.println("Array 2 is : ");
	for(int i=0;i<arr2.length;i++) {
		System.out.println(""+arr2[i]);
	}

}}}
