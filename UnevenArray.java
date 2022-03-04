/*WAP to input subject marks of N students and display them in a tabular form. Number of subjects may vary from student to student so use Uneven Array*/
import java.util.Scanner;
class UnevenArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of students:	");
		int r1=sc.nextInt();
		int m1[][]=new int[r1][];
		
		//INPUT
		for(int i=0;i<r1;i++){
			System.out.print("Enter number of subjects cleared by the student:	");
			int c1=sc.nextInt();
			m1[i]=new int[c1];
			for(int j=0;j<c1;j++){
				System.out.print("Enter marks of Subject " + (j+1) + ":	");
				m1[i][j]=sc.nextInt();
			}
		}
		
		//OUTPUT
		for(int x[]:m1){
			for(int y: x)
				System.out.print(y + "\t");
			System.out.println();
		}
	}
}