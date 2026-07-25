import java.util.*;

public class basicMaths {
    public static int countDigitsofNum(int num){
        int count = 0;
        while(num != 0){
            count++;
            num /= 10;
        }

        return count;
    }

    public static int reverseNumber(int num){
        int revNum = 0;
        while(num != 0){
            int ld = num % 10;
            revNum = revNum * 10 + ld;
            num /= 10;
        }

        return revNum;
    }

     public static boolean isPalindromeNumber(int num){
        int origNum = num;
        int revNum = 0;
        while(num != 0){
            int ld = num % 10;
            revNum = revNum * 10 + ld;
            num /= 10;
        }

        if(origNum != revNum){
            return false;
        }

        return true;
    }

    public static boolean isArmstrongNumber(int num){
        int orgNum = num;
        int armNum = 0;
        int numDigits = countDigitsofNum(num);
        while(num != 0){
            int ld = num % 10;
            int newNum = (int)Math.pow(ld, numDigits);
            armNum += newNum;
            num /= 10;
        }

        return ((armNum == orgNum) ? true : false);
    }

    public static void printAllDivisors(int num){
        //Brute force 
        for(int i=1; i<=num; i++){
            if(num % i == 0){
                System.out.print(i+" ");
            }
        }

        System.out.println();

        //improved Time complexity O(sqrt(N)) + O(no.of.factors * (log(no.of.factors)))
        ArrayList<Integer> li = new ArrayList<>();
         for(int i=1; i*i<=num; i++){
            if(num % i == 0){
                li.add(i);
                if((num/i) != i){
                    li.add(num/i);
                }
            }
        }

        Collections.sort(li);

        System.out.println(li);

    }

    public static boolean isPrime(int num){
        int cnt = 0;
        for(int i=1; i*i <= num; i++){
            if(num % i == 0){
                cnt++;
                if((num/i) != i){
                    cnt++;
                }
            }
        }

        if(cnt == 2){
            return true;
        }

        return false;
    }

    public static int GreatestCommonDivisor(int a, int b){
        //Using Eucledian Algorithm

        while(a>0 && b>0){
            if(a>b){
                a = a % b;
            } else {
                b = b % a;
            }
        }

        if(a == 0){
            return b;
        } else {
            return a;
        }
    }
    public static void main(String[] args){
        System.out.println("Count the Digits of the Number: "+countDigitsofNum(125467));

        System.out.println("Reverse of a Number: "+reverseNumber(125467));

        System.out.println("Number is a Palindrome?: "+isPalindromeNumber(4554));
        System.out.println("Number is a Palindrome?: "+isPalindromeNumber(7785));

        System.out.println("Number is an Armstrong Num?: "+isArmstrongNumber(153));
        System.out.println("Number is an Armstrong Num?: "+isArmstrongNumber(421));

        System.out.println("Printing all the Divisors: ");
        printAllDivisors(36);

        System.out.println("\nPrime or not?: "+ isPrime(3));
        System.out.println("\nGreatest Common Divisor of the given no.s is: "+GreatestCommonDivisor(22, 4));
    }
}
