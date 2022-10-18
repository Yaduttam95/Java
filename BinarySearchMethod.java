import java.util.Arrays;
// Main method start here
class BinarySearchMethod{
	// Main method
	public static void main(String []args){
		// Array initialization
		int a[]={10,3,5,85,65,25};
		// Sorting of array
		Arrays.sort(a);
		// For loop
		for(int e:a)
			System.out.println(e);
		// Printing of the binary search
		System.out.println(Arrays.binarySearch(a,6));
	}
}
