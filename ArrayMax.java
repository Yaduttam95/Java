import java.util.Scanner;
class ArrayMax{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of elements:	");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		//INPUT:-
		for(int i=0;i<n;i++){
			System.out.print("Enter element " + (i+1) + ":	");
			a[i]=sc.nextInt();
		}
		
		//FINDING MAX
		int max=a[0];
		for(int i=1;i<n;i++){
			if(a[i]>max){
				max=a[i];
			}
		}
		
		//OUTPUT
			System.out.println("Max is " + max);
	}
}