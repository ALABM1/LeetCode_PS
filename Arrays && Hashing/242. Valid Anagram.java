import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()) {
            return false; // chack if they have same number of characters
        }
        char[] charArray1 = s.toCharArray(); //convert s to a Char Array
        Arrays.sort(charArray1); //sort the Char Array
        char[] charArray2 = t.toCharArray();
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1,charArray2); //compare Arrays

        // You can also Convert the sorted character array back to a string
        //   String sortedS=new String(charArray1);
        //   String sortedT=new String(charArray2);

        // return sortedS.equals(sortedT);        
    }
}