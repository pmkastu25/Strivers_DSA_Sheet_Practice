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

    public static boolean anagramStrings(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int freq[] = new int[26];

        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }

        for(int i=0; i<t.length(); i++){
            freq[t.charAt(i) - 'a']--;
        }

        for(int i=0; i<freq.length; i++){
            if(freq[i] != 0){
                return false;
            }
        }

        return true;
    }
    public static boolean rotateString(String s, String goal) {
        //your code goes here
        StringBuilder newSt = new StringBuilder(s);
        int len = newSt.length()-1;
        while(len-- >= 0){
            char lastChar = newSt.toString().charAt(newSt.length()-1);
            if(newSt.toString().equals(goal)){
                return true;
            }
            newSt.deleteCharAt(newSt.length()-1);
            newSt.insert(0, lastChar);
        }

        return false;

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

        System.out.println(anagramStrings("anagram", "nagaram"));

        System.out.println(rotateString("abcde", "cdeab"));
    }
}