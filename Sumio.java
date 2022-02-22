import java.util.Scanner;
class Sumio{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st Integer:	");
		int a=sc.nextInt();
		System.out.print("Enter 2nd Integer:	");
		int b=sc.nextInt();
		int sum=a+b;
		System.out.println("Sum is:	"+ sum);
	}
}