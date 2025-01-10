//Time complexity: O(n)
import java.util.Stack;
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
            Stack<Integer> stack = new Stack<>();
            // Iterate the asteroids array
            for(int a : asteroids){
                // If the stack is not empty and the asteroids<0 and Top of the stack >0
                while(!stack.isEmpty() && a<0 &&  stack.peek()>0){
                    int diff= stack.peek()+a;
                    if(diff <0){
                        stack.pop();// The Top of the stack  is deleted
                    }
                    else if(diff>0){
                        a=0; // Current asteroid is set to 0
                    }
                    else{
                        stack.pop();
                        a=0;
                    }
                }
                if(a !=0){ // to avoid that we add 0 to the array of asteroids
                    stack.push(a); // Push the asteroid in the stack
                }
                  
            } 
            // Convert the stack to an int[]
            int[] result = new int [stack.size()];
            for(int i=0; i<result.length;i++){
                
                    result[i]=stack.get(i);
                
            }
        return result;
    }
}