import java.util.Scanner;
class SumOfEvenAndOddNumbers{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of elements:	");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		//INPUT
		for(int i=0;i<n;i++){
			System.out.print("Enter element " + (i+1) + ":	");
			a[i]=sc.nextInt();
		}
		
		//SUM CALCULATOR
		int sume=0,sumo=0;
		for(int i=0;i<n;i++){
			if(a[i]%2==0){
				sume+=a[i];
			}
			else{
				sumo+=a[i];
			}
		}
		
		//OUTPUT
		System.out.println("Sum of Even Numbers:	" + sume);
		System.out.println("Sum of Odd Numbers:	" + sumo);
	}
}