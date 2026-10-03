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
    public static void main(String[] args){
        List<Character> s = new ArrayList<>();
        s.add('h');
        s.add('e');
        s.add('l');
        s.add('l');
        s.add('o');

        reverseString(s);
        System.out.println(palindromeCheck("hannah"));
    }
}