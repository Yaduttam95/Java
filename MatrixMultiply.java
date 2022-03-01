import java.util.Scanner;
class MatrixMultiply{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows in Matrix 1:	");
		int r1=sc.nextInt();
		System.out.print("Enter no. of coloumns in Matrix 1:	");
		int c1=sc.nextInt();
		
		System.out.print("Enter no. of rows in Matrix 2:	");
		int r2=sc.nextInt();
		System.out.print("Enter no. of coloumns in Matrix 2:	");
		int c2=sc.nextInt();
		
		if(c1!=r2){
			System.out.print("Invalid dimensions so can't multiply!!");
			System.exit(1);
		}
		
		int m1[][]=new int[r1][c1];
		int m2[][]=new int[r2][c2];
		int m3[][]=new int[r1][c2];
		
		//INPUT MATRIX 1
		System.out.println("MATRIX 1 INPUT:");	
		for(int i=0;i<r1;i++){
			for(int j=0;j<c1;j++){
				System.out.print("Enter element " + (i+1) + " " + (j+1) + ":	");
				m1[i][j]=sc.nextInt();
			}
		}
		System.out.println();
		System.out.println();System.out.println();
		//INPUT MATRIX 2
		System.out.println("MATRIX 2 INPUT:");
		for(int i=0;i<r2;i++){
			for(int j=0;j<c2;j++){
				System.out.print("Enter element " + (i+1) + " " + (j+1) + ":	");
				m2[i][j]=sc.nextInt();
			}
		}
		
		//MULTIPLY
		for(int i=0;i<r1;i++){
			for(int j=0;j<c2;j++){
				for(int k=0;k<c1;k++){
					m3[i][j]+=m1[i][k]*m2[k][j];
				}
			}
		}
		
		//OUTPUT MATRIX 3
		for(int []x:m3){
			for(int y:x){
				System.out.print(y + "\t");
			}
			System.out.println();
		}
	}
}