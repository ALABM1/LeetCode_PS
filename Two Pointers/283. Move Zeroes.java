class Solution {
    public void moveZeroes(int[] nums) {
        // Two Pointer Approach ( Time Complexity of  O(n) )        
        //base case
        int n=nums.length;
        if(n<2) return;
        //define Pointers
        int R=1; //Right Side: Contains unprocessed elements (which are later filled with zeros).
        int  L=0; //Left Side: Contains all non-zero elements.
        while(R<n){
            if(nums[L] !=0){
                L++;
                R++;
            }
            else if(nums[L] ==0 && nums[R] ==0){
                R++;
            }
            else{ //if(nums[L]==0 && nums[R] !=0){
                nums[L]=nums[R];
                nums[R]=0;
            }
        }
        
    }
}
/**  Explanation
[0,1,0,3,12]   --> [1,0,0,3,12] --> [1,0,0,3,12]  --> [1,3,0,0,12] --> [1,3,0,0,12] --> [1,3,12,0,0]
    L R               L R              L   R               L R              L   R             
 */
 /**
  Partitioning Algorithm ( Time Complexity O(n) )

  class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;

        // Move all non-zero elements to the front
        for (int num : nums) {
            if (num != 0) {
                nums[nonZeroIndex++] = num;
            }
        }

        // Fill the remaining positions with zeros
        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex++] = 0;
        }
    }
}
 
 
  */
