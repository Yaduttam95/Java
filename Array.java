import java.util.Scanner;
class Array{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.print("Enter how many numbers:	");
		n=sc.nextInt();
		int a[]=new int[n];
		
		//INPUT
		for(int i=0;i<n;i++){
			System.out.print("Enter element " + (i+1) + ":	");
			a[i]=sc.nextInt();
		}
		
		//OUTPUT
		for(int i=0;i<n;i++){
			System.out.print(a[i] + "\t");
		}
		
		System.out.println();
	}
}