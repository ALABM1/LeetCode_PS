//Time Complexity: O(n + m)
//Space Complexity: O(n + m)
import java.util.*;
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> listOfLists = new ArrayList<>(); 
        // Convert arrays to sets to remove duplicates
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int n:nums1) set1.add(n);
        for(int n:nums2) set2.add(n);

        // Create copies of the sets to avoid modifying the original sets
        Set<Integer> copySet1 = new HashSet<>(set1);
        Set<Integer> copySet2 = new HashSet<>(set2);
        
        // remove all elements of copySet2 that exist in set1
        set1.removeAll(copySet2);
        // remove all elements of copySet2 that exist in set1
        set2.removeAll(copySet1);       

        // Convert the sets to lists and add them to the result
        listOfLists.add(new ArrayList(set1));
        listOfLists.add(new ArrayList(set2));
        return listOfLists;
        
    }
}