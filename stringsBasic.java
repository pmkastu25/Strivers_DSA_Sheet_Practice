import java.math.BigInteger;
import java.util.*;

class stringsBasic{
    public static void reverseString(List<Character> s) {
        for(int i=s.size()-1; i>=0; i--){
            s.add(s.get(i));
            s.remove(s.get(i));
        }

        System.out.println(s);
    }

    public static boolean palindromeCheck(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left <= right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        } 
        
        return true;
    }

    public static String largeOddNum(String s) {
        int right = s.length() - 1;

    while (right >= 0 && (s.charAt(right) - '0') % 2 == 0) {
        right--;
    }

    if (right < 0) {
        return "";
    }

    int left = 0;

    while (left <= right && s.charAt(left) == '0') {
        left++;
    }

    return s.substring(left, right + 1);

    }
    public static void main(String[] args){
        List<Character> s = new ArrayList<>();
        s.add('h');
        s.add('e');
        s.add('l');
        s.add('l');
        s.add('o');

        reverseString(s);
        System.out.println(palindromeCheck("hannah"));

        System.out.println(largeOddNum("00023450000000000000001"));
    }
}