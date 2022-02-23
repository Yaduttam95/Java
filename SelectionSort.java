import java.util.Scanner;
class SelectionSort{
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
		
		//SORT
		for(i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]>a[j]){
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		
		//OUTPUT
		for(int e:a){
			System.out.print(e + "\t");
		}
	}
}