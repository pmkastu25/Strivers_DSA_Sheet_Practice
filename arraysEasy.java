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

    public static TreeSet<Integer> hs = new TreeSet<>();

    public static void unionOfTwoSortedArrs(int arr1[], int arr2[]){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
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
    
    public static int CountMaximumConsecutiveOne(int arr[]){
        int maxOnes = Integer.MIN_VALUE;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                count = 0;
            } 
            if (arr[i] == 1){
                count++;
            } 

            maxOnes = Math.max(maxOnes, count);
        }

        return maxOnes;
    }

    public static int missingNumber(int arr[]){
        int n = arr.length;

        Arrays.sort(arr);
        int num = 1;
        for(int i=0; i<n; i++){
            if(arr[i] != num){
                return num;
            }
            num++;
        }

        return -1;
    }
    
    public static int numAppearOnce(int arr[]){
        int maxEl = Integer.MIN_VALUE;

         for(int i=0; i<arr.length; i++){
           maxEl = Math.max(maxEl, arr[i]);
        }

        int freq[] = new int[maxEl+1];

        for(int i=0; i<maxEl; i++){
            freq[arr[i]]++;
        }

        for(int i=0; i<freq.length; i++){
            if(freq[arr[i]] == 1){
                return arr[i];
            }
        }

        return -1; //no such element
    }

    public static void moveZerosToEnd(int arr[]){
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] == 0){
                int j = i;
                while(j < arr.length-1 && arr[j+1] != 0){
                    arr[j] = arr[j+1];
                    j++;
                }
                arr[j] = 0;
            }
        }
    }

    public static ArrayList<Integer> intersectionOfTwoSortedArrs(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
        ArrayList<Integer> newl = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;

        while(p1 < arr1.size() && p2 < arr2.size()){
            if(arr1.get(p1) == arr2.get(p2)){
                newl.add(arr1.get(p1));
                p1++;
                p2++;
            } else if(arr1.get(p1) < arr2.get(p2)){
                p1++;
            } else {
                p2++;
            }
        }

        return newl;
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int arr[] = {1,4,7,8};
        System.out.println(getSecondLargest(arr));

        System.out.println(isSortedArr(arr));

         int arr1[] = {1,4,4,7,8,8};
         System.out.println(removeDuplicates(arr1));

        rotateArrLeft(arr1);
        printArr(arr1);

        System.out.println();

         rotateArrLeftByK(arr1, 2);
       printArr(arr1);

        System.out.println();

        int un1[] = {1,2,2,3,4};
        int un2[] = {3,4,4,5,6};
        unionOfTwoSortedArrs(un1, un2);

        System.out.println(hs);

        int cons[] = {1,0,1,1,1,1,0,1,1};
        System.out.println(CountMaximumConsecutiveOne(cons));

        int findMis[] = {8, 2, 4, 5, 3, 7, 1};
        System.out.println(missingNumber(findMis));

        int arr3[] = {4,1,2,1,2};
        System.out.println(numAppearOnce(arr3) + " is the element that appears once.");

        int arrZ[] = { 1,2,0,1,0,4,0};
        moveZerosToEnd(arrZ);
        printArr(arrZ);

         System.out.println();

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(2);
        l1.add(3);
        l1.add(3);
        l1.add(3);


        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(2);
        l2.add(3);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(7);

        System.out.println(intersectionOfTwoSortedArrs(l1, l2));
    }
}