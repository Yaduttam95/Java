import java.util.Scanner;
class Studentio{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Roll No:	");
		int roll=sc.nextInt();
		System.out.print("Enter Name:	");
		sc.nextLine();		//sc.skip("\r\n")
		String name=sc.nextLine();
		System.out.println("Roll no. is:	"+ roll);
		System.out.println("Name is:	"+ name);
	}
}