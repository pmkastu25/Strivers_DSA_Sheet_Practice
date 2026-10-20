import java.util.ArrayList;

class recursionBasics{
    public static void printNumbers(int num){
        if(num == 0){
            return;
        }
        System.out.print(num+" ");
        printNumbers(num-1);
    }

    public static void printName(int n, String name){
        if(n == 0){
            return;
        }

        System.out.println(name);
        printName(n-1, name);
    }

    public static void printNumbers1toN(int idx, int num){
        if(idx == num){
            return;
        }
        System.out.print(idx+" ");
        printNumbers1toN(idx+1, num);
    }

    public static void printSumOfFirstN(int idx, int num, int sum){
        if(idx == num){
            sum += idx;
            System.out.print("Sum of First N numbers: "+ sum);
            return;
        }

        printSumOfFirstN(idx+1, num, sum+idx);
    }

    public static int fact(int n){
        if(n == 0){
            return 1;
        }

        return n * fact(n-1);
    }

    public static void reverseArray(int arr[], int idx){
        if(idx == 0){
            System.out.print(arr[idx]+" ");
            return;
        }
        System.out.print(arr[idx]+" ");
        reverseArray(arr, idx-1);
    }

    public static boolean isPalindrome(String st, int idx, StringBuilder revSt){
        if(idx == 0){
           revSt.append(st.charAt(idx));
           if(revSt.toString().equals(st)){
            return true;
           }
           return false;
        }
        return isPalindrome(st, idx-1, revSt.append(st.charAt(idx)));
    }

    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        
        return  fib(n-1)+fib(n-2);
    }

     public static int digSum(int num){
        int sum = 0;
        while(num != 0){
            int ld = num % 10;
            sum += ld;
            num /= 10;
        }

        return sum;
    }

    public static int addDigits(int num) {
        //your code goes here
        if(num == 0){
            return 0;
        }

        int n = digSum(num);
        while(n >= 10){
            n = digSum(n);
        }

        return n;
    }

    public static void solve(ArrayList<Character> s, int idx, ArrayList<Character> res){
        if(idx == 0){
            res.add(s.get(idx));
            return;
        }

        res.add(s.get(idx));
        solve(s, idx-1, res);
    }

     public static ArrayList<Character> reverseString(ArrayList<Character> s) {
        //your code goes here
        // int left = 0;
        // int right = s.size()-1;

        // while(left < right){
        //     char temp = s.get(left);
        //     s.set(left, s.get(right));
        //     s.set(right ,temp);

        //     left++;
        //     right--;
        // }

        // return s;
        ArrayList<Character> res = new ArrayList<>();

        solve(s, s.size()-1, res);

        return res;
    }

    public static void main(String[] args){
        System.out.println("\nPrinting numbers N to 1: ");
        printNumbers(10);

        System.out.println("\nPrinting name n times: ");

        printName(5, "name");

        System.out.println("\nPrinting numbers 1 to N: ");

        printNumbers1toN(1, 6);

        System.out.println();

        printSumOfFirstN(1, 6, 0);

        System.out.println("\nFactorial of a number is: "+ fact(5));

        System.out.println("Reverse of the array is: ");

        int arr[] = {1,2,6,7};
        reverseArray(arr, arr.length-1);

        System.out.println();

        String st = "radar";
        String st1 = "soap";
        System.out.println(st+" is Palindrome or not?: "+ isPalindrome(st, st.length()-1, new StringBuilder("")));
        System.out.println(st1+ " is Palindrome or not?: "+ isPalindrome(st1, st1.length()-1, new StringBuilder("")));

        System.out.println("\nFibonacci of number is: "+ fib(5));

        System.out.println("\nSum of Digits of a given number: "+ addDigits(529));

        ArrayList<Character> s = new ArrayList<>();
        s.add('h');
        s.add('e');
        s.add('l');
        s.add('l');
        s.add('o');
        System.out.println(reverseString(s));
    }
}