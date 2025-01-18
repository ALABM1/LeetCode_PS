// Time complexity :O(n)
class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxOnes=0;
        int num_zeros=0; // Counts the number of zeros in the current window
        int n_ones=0;   // Stores the size of the current window
        int L=0;        // Left pointer of the sliding window

        // Iterate through the array using the right pointer R
        for(int R=0;R<nums.length;R++){
            if(nums[R]==0){
                num_zeros++;
            }
            // If the number of zeros exceeds k, shrink the window from the left
            while(num_zeros>k){
                if(nums[L]==0){
                    num_zeros--;
                }
                L++; // Move the left pointer to the right
            }
            n_ones=R-L+1; // Calculate the size of the current window
            //System.out.println(n_ones);
            maxOnes=Math.max(maxOnes, n_ones);
        }
        return maxOnes;
    }
}



// Why Isn’t It  O (n2)?
// The while loop is not independent of the for loop. Instead, it works in tandem with the for loop:

// The right pointer moves forward n times.

// The left pointer moves forward at most n times.

// Each element is processed by either the right pointer or the left pointer, but not both simultaneously.

// This results in a total of 2n operations, which simplifies to O(n).



//  Time complexity :O(n2)
// class Solution {
//     public int longestOnes(int[] nums, int k) {
//         int i=0,x=0;
//         int k1=k;
//         while(k1>=0 && i<nums.length){
//             if(nums[i]==1 ){
//                 x++;
//             }else{
//                 if(k1>0){
//                     x++;
//                     k1--;
//                 }else{
//                     break;
//                 }
                
//             }
//                i++;
//         }
//         System.out.println(x);
        
//         int maxOnes=x;
//         for(int y=1;y<nums.length;y++){
//             int j=y;
//             x=0;
//             int k2=k;
//             while(k2>=0 && j<nums.length){
//                 if(nums[j]==1){
//                     x++;
//                 }else{
//                     if(k2>0){
//                         x++;
//                         k2--;
//                     }
//                     else{
//                         break;
//                     }
//                 }
//                 j++;
//             }
//             maxOnes= Math.max(maxOnes,x);
//             System.out.println(x);
//         }
//         return maxOnes;
//     }
// }