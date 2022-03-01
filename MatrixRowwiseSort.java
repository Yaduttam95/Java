import java.util.Scanner;
class MatrixRowwiseSort{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows:	");
		int r=sc.nextInt();
		System.out.print("Enter no. of cols:	");
		int c=sc.nextInt();
		
		int m[][]=new int [r][c];
		//INPUT
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print("Enter Element " + (i+1) + " " + (j+1) + ":	");
				m[i][j]=sc.nextInt();
			}
		}
		
		//SORTING
		for(int k=0;k<r;k++){
			for(int i=0;i<c-1;i++){
				for(int j=i+1;j<c;j++){
					if(m[k][i]>m[k][j]){
						int t=m[k][i];
						m[k][i]=m[k][j];
						m[k][j]=t;
					}
				}
			}
		}
		
		//NORMAL OUTPUT
		for(int []x:m){
			for(int y:x){
				System.out.print(y + "\t");
			}
			System.out.println();
		}
	}
}