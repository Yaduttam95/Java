class MergeSort{
    public static void printArray(int arr[], int n){
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    public static void mergeArrays(int arr[], int si, int ei){
        int mid = (si + ei)/2;

        int temp[] = new int[ei-si+1];
        int i = si, j = mid+1;
        for(int k = 0; k <= ei-si; k++){
            if(i > mid){
                temp[k] = arr[j];
                j++;
            }else if(j > ei){
                temp[k] = arr[i];
                i++;
            }else {
                if(arr[i] > arr[j]){
                    temp[k] = arr[i];
                    i++;
                }else {
                    temp[k] = arr[j];
                    j++;
                }
            }
        }

        i = si;
        for(int k = 0; k <= ei-si; k++){
            arr[i] = temp[k];
            i++;
        }
    }

    public static void mergeSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }

        int mid = (si + ei)/2;

        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);

        mergeArrays(arr, si, ei);
    }

    public static void main(String args[]){
        int arr[] = new int[]{14, 5, 99, 12, 36, 76, 10, 1, 82, 50};

        System.out.println("Original Array: ");
        printArray(arr, 10);

        mergeSort(arr, 0, 9);

        System.out.println("Sorted Array: ");
        printArray(arr, 10);
    }
}