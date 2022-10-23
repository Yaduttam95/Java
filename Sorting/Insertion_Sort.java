// Insertion Sort
import java.util.Scanner;
public class Insertion_Sort {
    public static void sort( int arr[] ) {
        int N = arr.length;
        int i, j, temp;
        for (i = 1; i < N; i++) {
            j = i;
            temp = arr[i];
            while (j > 0 && temp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j = j - 1;
            }
            arr[j] = temp;
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in );
        System.out.println("\n************ Insertion Sort ************");
        int n, i;

        System.out.println("\nEnter number of elements in a array : ");
        n = scan.nextInt();

        int arr[] = new int[ n ];

        System.out.println("Enter "+ n +" elements : ");
        for (i = 0; i < n; i++)
            arr[i] = scan.nextInt();

       sort(arr);

        System.out.println("Elements after sorting -> ");
        for (i = 0; i < n; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}