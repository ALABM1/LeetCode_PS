// Time Complexity : O(n)
import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder s1 = new StringBuilder(s);
        Set subSet= new HashSet<>();
        int L=0;
        int maxLength=0;
        for(int R=0;R<s.length();R++){
            while(subSet.contains(s.charAt(R))){
                subSet.remove(s.charAt(L));
                L++;
            }
            //System.out.println(s.charAt(R));
            subSet.add(s.charAt(R));
            maxLength=Math.max(maxLength,subSet.size());
            //System.out.println(subSet.size());
        }
        return maxLength;
       

        
    }
}