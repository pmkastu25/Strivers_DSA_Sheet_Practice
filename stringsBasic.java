import java.util.*;

class stringsBasic{
    public static void reverseString(List<Character> s) {
        for(int i=s.size()-1; i>=0; i--){
            s.add(s.get(i));
            s.remove(s.get(i));
        }

        System.out.println(s);
    }

    public static void main(String[] args){
        List<Character> s = new ArrayList<>();
        s.add('h');
        s.add('e');
        s.add('l');
        s.add('l');
        s.add('o');

        reverseString(s);
    }
}