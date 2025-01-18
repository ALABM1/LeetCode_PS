// Time complexity O(n)
class Solution {
    public int longestSubarray(int[] nums) {
        int n_zeros=0;
        int n_ones=0;
        int maxOnes=0;
        int L=0;
        int last_zero_index=0;
        for(int R=0;R<nums.length;R++){ // R is the right pointer of the window
            if(nums[R]==1) n_ones++;
            if(nums[R]==0){
                n_zeros++;
                if(n_zeros==1) last_zero_index=R; // Track the index of the first zero
            }
            if(n_zeros>1){ // If there are more than one zero in the window
                L=last_zero_index+1; // Move L to the right of the first zero
                last_zero_index=R;  // Update the index of the most recent zero
                n_zeros--;          // Decrement zero count since we removed the first zero
            }
            n_ones=R-L;  // Calculate the length of the current window
            System.out.println(n_ones);
            maxOnes = Math.max(maxOnes,n_ones); // Update the maximum window length
            
        }
        return maxOnes;
    }
}