import java.util.*;

class arraysEasy{
    public static int getSecondLargest(int arr[]){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
           if(arr[i] > max1){
            max2 = max1;
            max1 = arr[i];
           } else if(arr[i] > max2 && arr[i] != max1){
            max2 = arr[i];
           }
        }
        return max2;
    }

    public static boolean isSortedArr(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }

        return true;
    }

     public static HashSet<Integer> removeDuplicates(int arr[]){
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<arr.length; i++){
            hs.add(arr[i]);
        }

        return hs;
    }

    public static void rotateArrLeft(int arr[]){
       int temp = arr[0];
        for(int i=0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
    }

    public static void rotateArrLeftByK(int arr[], int k){
    for(int j=0; j<k; j++){
       int temp = arr[0];
        for(int i=0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
      }
    }

    public static void moveAllZerosToEnd(int arr[]){
        int end = arr.length;
        while(end >= 0){
            while(end == 0){
                end--;
            }
        }
    }

    public static HashSet<Integer> hs = new HashSet<>();

    public static void unionOfTwoSortedArrs(int arr1[], int arr2[]){
        int i = 0;
        int j = 0;
        while(i < arr1.length && j < arr2.length-1){
            if(i != arr1.length-1){
                hs.add(arr1[i]);
                i++;
            }
            if(j != arr2.length-1){
                hs.add(arr2[i]);
                j++;
            }
        }
    }
    
    public static void main(String[] args){
        int arr[] = {1,4,7,8};
        System.out.println(getSecondLargest(arr));

        System.out.println(isSortedArr(arr));

         int arr1[] = {1,4,4,7,8,8};
         System.out.println(removeDuplicates(arr1));

        rotateArrLeft(arr1);
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

         rotateArrLeftByK(arr1, 2);
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }

        System.out.println();
        
        int un1[] = {1,2,2,3,4};
        int un2[] = {3,4,4,5,6};
        unionOfTwoSortedArrs(un1, un2);

        System.out.println(hs);
    }
}