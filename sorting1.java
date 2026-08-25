public class sorting1 {
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void bubbleSort(int arr[]){
        int n = arr.length;

        for(int i=0; i<n; i++){
            int didSwap = 0;
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                    didSwap = 1;
                }
            }
            if(didSwap == 0){
                break;
            }
        }
    }
    public static void selectionSort(int arr[]){
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            int minIdx = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }

                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            }
        }
    }

    public static void insertionSort(int arr[]){
        int n = arr.length;

        for(int i=0; i<n; i++){
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
               int temp = arr[j-1];
               arr[j-1] = arr[j];
               arr[j] = temp;
               
               j--;
            }
        }
    }

    public static void main(String[] args){
        int arr[] = {2,7,5,6};
        bubbleSort(arr);
        printArr(arr);

        System.out.println();

        int arr1[] = {3,1,7,4};
        selectionSort(arr1);
        printArr(arr1);

         System.out.println();

        int arr2[] = {5, 4, 3, 2, 1};
        insertionSort(arr2);
        printArr(arr2);
    }
}
