import java.util.Arrays;

class BinarySearchMethod{
	public static void main(String []args){
		int a[]={10,3,5,85,65,25};
		Arrays.sort(a);
		for(int e:a)
			System.out.println(e);
		
		System.out.println(Arrays.binarySearch(a,6));
	}
}