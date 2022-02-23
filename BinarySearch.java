import java.util.Scanner;
class BinarySearch{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter how many numbers:	");
		int n=sc.nextInt();
		int i;
		int a[]=new int[n];
		
		//INPUT
		System.out.println("Enter numbers in increasing order");
		for(i=0;i<n;i++){
			System.out.print("Enter element " + (i+1) + ":");
			a[i]=sc.nextInt();	
		}
		
		System.out.print("Enter value to search:	");
		int item=sc.nextInt();
		
		//SEARCHING
		int low=0, high=n-1, mid=0;
		boolean found=false;
		while(low<=high){
			mid=(low+high)/2;
			if(a[mid]==item){
				found=true;
				break;
			}
			
			else if(item>a[mid])
				low=mid+1;
			else
				high=mid-1;
		}
		if(found==true)
			System.out.println("Number is found at pos " + (mid+1));
		else
			System.out.println("Number not found!!");
	}
}		