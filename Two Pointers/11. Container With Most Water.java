class Solution {
    public int maxArea(int[] height) {
        int i=0; // left pointer starting begining of the array
        int j=height.length-1; // Right pointer 
        int x=0; // initialize the area
        while(i !=j){ // the pointers must not intersect 
            int MinHeight= Math.min(height[i], height[j]);
            int a =  MinHeight* (j-i);
            if(a>x ){
                    x=a;
            }
            // Here we will choose the move the pointer of the shorter line
            // The idea is to look for a taller line to potentially increase the area
            if(height[i]< height[j]){
                i++; // Move the left pointer forward
            }
            else {
                j--; // Move the right pointer backward
            }
        }
        return x;
        
    }
}