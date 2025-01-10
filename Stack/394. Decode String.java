// Time Complexity O(n)
import java.util.Stack;
class Solution {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        String result="";
        // Traverse the input string
        for( int i=0;i<s.length();i++){
            // Push all characters except ']' to the stack
            if(s.charAt(i) !=']'){
                stack.push(s.charAt(i));
            }else{

                // Step 1: Build the substring inside the brackets
                String substr="";
                while( stack.peek()!='['){
                    substr=stack.pop()+substr; // Prepend characters to form the substring 
                }
                stack.pop(); // Remove the '[' from the stack
                System.out.println(substr);

                 // Step 2: Build the number (k)
                String k="";
                while( !stack.isEmpty() && Character.isDigit(stack.peek())){
                        k=stack.pop()+k; // Prepend digits to form the number (this in case the number have more than 1 digit)
                }

                // Step 3: Repeat the substring k times and push back onto the stack
                for(int j=0; j<Integer.parseInt(k);j++){
                    for(char c : substr.toCharArray()){
                        stack.push(c); // Push each character of the substring onto the stack
                    }
                }
               
            }

        }
        // Step 4: Build the final result from the stack
        while (!stack.isEmpty()) {
            result = stack.pop() + result; 
        }
        return result;
    }
}