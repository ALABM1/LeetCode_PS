import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0; // If the array is empty, return 0
        Arrays.sort(nums); //sort the nums Array
        int longestStreak=1;
        int currentStreak=1;
        for(int i =1; i<nums.length; i++){         // Iterate the sorted array starting from the second element
            if(nums[i]!=nums[i-1]){  // Skip duplicates
                if(nums[i]== nums[i-1]+1){         // If the current number is exactly one more than theprevious number
                    currentStreak++;
                }else{
                    if(currentStreak>longestStreak){
                         longestStreak= currentStreak; // Update the longest streak
                    }
                    //if not 
                    currentStreak=1;  // Reset current streak
                    
                }
            }
        }
         
        if( currentStreak> longestStreak ) return currentStreak; // look to this exemple he will explain it [0,3,7,2,5,8,4,6,0,1]
        return longestStreak;
        // or   return Math.max(longestStreak, currentStreak);

    }
}