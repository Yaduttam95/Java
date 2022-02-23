import java.util.Scanner;
class LinearSearch{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter how many numbers:	");
		int n=sc.nextInt();
		int i;
		int a[]=new int[n];
		
		//INPUT
		for(i=0;i<n;i++){
			System.out.print("Enter element " + (i+1) + ":");
			a[i]=sc.nextInt();	
		}
		
		System.out.print("Enter value to search:	");
		int item=sc.nextInt();
		
		//SEARCHING
		boolean found=false;
		for(i=0;i<n;i++){
			if(a[i]==item){
				found=true;
				break;
			}
		}
		if(found==true)
			System.out.println("Number is found at pos " + (i+1));
		else
			System.out.println("Number not found!!");
	}
}