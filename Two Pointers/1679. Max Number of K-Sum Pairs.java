// Approach
// Sort the array, then use two pointers starting at the ends to find and count pairs that sum to k, moving the pointers inward based on the sum.

import java.util.Arrays;
class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);// Sort the array (complexity O(n log n) )
        int nbPairs=0;
        int i=0; // Left pointer (begining of the array)
        int j= nums.length-1;// Right pointer (the end of the array)
        // I used in this loop the two-pointer technique
        while(i<j){
            int a = nums[i] + nums[j];
            if(a==k){
                nbPairs++;
                i++;
                j--;  
            }else if(a<k){
                i++; //move the left pointer forward to increase the sum
            }
            else j--;// move the right pointer backward to decrease the sum
           
        }
        return nbPairs;
        
    }
}