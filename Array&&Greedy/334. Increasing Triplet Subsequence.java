// it's not as simple as it looks

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int Min1= Integer.MAX_VALUE;
        int Min2= Integer.MAX_VALUE;

        for(int num : nums){
            if(num<=Min1) Min1=num;
            else if(num<=Min2) Min2=num;
            else return true;
        }
        return false;
    }
}