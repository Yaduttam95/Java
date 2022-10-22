import java.util.*;
public class Sparse_Matrix {
    public static void main(String[] args) {
        int rows, cols, size, count = 0;

        int m, n, c, d;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of matrix :");
        m = scan.nextInt();
        n = scan.nextInt();

        int matrix[][] = new int[m][n];
        System.out.println("Enter the elements of matrix :");
        for (c = 0; c < m; c++)
        {
            for (d = 0; d < n; d++)
            {
                matrix[c][d] = scan.nextInt();
            }
        }

        //Calculates number of rows and columns present in given matrix    
        rows = matrix.length;
        cols = matrix[0].length;

        //Calculates the size of array    
        size = rows * cols;

        //Count all zero element present in matrix    
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(matrix[i][j] == 0)
                    count++;
            }
        }

        if(count > (size/2))
        {
            System.out.println("Given matrix is a sparse matrix");
        }
        else
        {
            System.out.println("Given matrix is not a sparse matrix");
        }
    }
}