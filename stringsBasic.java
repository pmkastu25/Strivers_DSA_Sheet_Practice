import java.util.*;

class stringsBasic{
    public static List<Character> reverseString(List<Character> s) {
        List<Character> revS = new ArrayList<>();
        for(int i=s.size()-1; i>=0; i--){
            revS.add(s.get(i));
        }

        return revS;
    }

    public static void main(String[] args){
        List<Character> s = new ArrayList<>();
        s.add('h');
        s.add('e');
        s.add('l');
        s.add('l');
        s.add('o');

        System.out.println(reverseString(s));
    }
}