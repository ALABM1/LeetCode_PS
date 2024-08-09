import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // sort nums

        for(int i =0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue ; // skip duplicates
            int j=i+1;          // j starts just after i
            int k=nums.length-1; // k starts at the end
            while(j<k){
                int sum= nums[i]+nums[j]+nums[k];
                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[j],nums[k])); // add the list to th result List
                    j++; // increment j
                    k--; // decrement k
                    while(j<k && nums[j]==nums[j-1]) j++;  // skip duplicates
                    while(j<k && nums[k]==nums[k+1]) k--;  // skip duplicates
                }else if(sum>0){ //If sum > 0: The sum is too large, so you should decrment k to decrease the sum.
                    k--; // Move k to the left to decrease the sum
                }
                else {  //If sum < 0: The sum is too small, so you should increment j to increase the sum.
                    j++; // Move j to the right to increase the sum
                }
            }
        }
        
        return result;
        
    }
}
//Approach:

// 1/Sort the Array: First, sort the array to enable efficient use of the two-pointer technique.
// 2/Iterate with a Fixed Element: Start iterating through the array with a variable i that will fix the first element of the triplet.
// 3/Two-Pointer Technique: For each fixed element nums[i], use two pointers, j and k, initialized to i + 1 and nums.length - 1, respectively.
    // Calculate the Sum: Calculate the sum of nums[i], nums[j], and nums[k].
    // Check the Sum:
        // If the sum is zero, you've found a valid triplet. Add it to the result list.
        // If the sum is less than zero, increment the j pointer to increase the sum.
        // If the sum is greater than zero, decrement the k pointer to decrease the sum.
    // Skip Duplicates: After finding a valid triplet, ensure to skip any duplicate values for j and k to avoid duplicate triplets in the result.
// 4/Avoid Duplicates for i: Skip duplicates for the fixed element i to ensure all triplets are unique.
// 5/Return the Result: After the loop ends, return the list of triplets.