import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb= new StringBuilder(s); // I modify the type to stringBuilder because the string is immutable(not iterable by character)

        List<Character>  s1= new ArrayList<>();
        List<Integer>  s2= new ArrayList<>();
        for(int i=0 ;i<s.length();i++){
            char c= s.charAt(i);
            if( Arrays.asList('I', 'E', 'O', 'A', 'U').contains(Character.toUpperCase(c))  ) {
                s1.add(c);
                s2.add(i);
            }
        }
        int j=0;
        for(int i=s.length()-1; i>=0; i--){ // iterate in reverse (from (n-1) to 0)
            char c= s.charAt(i);
            if( Arrays.asList('I', 'E', 'O', 'A', 'U').contains(Character.toUpperCase(c))  ){
                char v=s1.get(j);
                sb.setCharAt(i,v);
                j++;
            }
        
        }
        s=sb.toString(); //  I converted StringBuilder to String
        return s;
    }
}   