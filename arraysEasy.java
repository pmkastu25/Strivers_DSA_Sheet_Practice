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

    public static void main(String[] args){
        int arr[] = {1,4,7,8};
        System.out.println(getSecondLargest(arr));

        System.out.println(isSortedArr(arr));
    }
}