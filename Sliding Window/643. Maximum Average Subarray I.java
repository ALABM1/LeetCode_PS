// Time comlpexity O(n)
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // if the array has only one element, return that element (Edge case)
        if(nums.length==1) return (double) nums[0];
        
        int current=0;
        int sum=0;
        // Calculate the sum of the first 'k' elements
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        current = sum;
        int best =current;
        // Slide the window through the array

        for(int i=k;i<nums.length;i++){
            // Subtract and add the elements that is no longer in the window 
            current= current+ nums[i]- nums[i-k];
            // Update the best sum if the current sum is greater
            best = Math.max(best,current);   
        }
        System.out.println(best);
        // Calculate and return the maximum average
        double result=(double) best/k;
        return result;
    }
}