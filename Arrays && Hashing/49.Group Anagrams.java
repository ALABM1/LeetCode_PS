import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0) return new  ArrayList<>();
        // if(strs.length==1) return new  ArrayList<>(strs);
        HashMap<String, List<String>> res = new HashMap<>();
        for (String s : strs){
            int[] count  = new int[26];
            for(char c: s.toCharArray()){
                count[c-'a'] += 1;
            }
            String Key =  Arrays.toString(count);
            res.putIfAbsent(Key,new ArrayList<>());  //we need to check if the key is present, and if not, 
                                                     //create  a new list and put it in the map.
            res.get(Key).add(s);
        }
        return new ArrayList<>(res.values());
        
    }
    
}