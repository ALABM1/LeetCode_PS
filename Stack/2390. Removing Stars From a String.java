//this solution using Stack aproach (Time Complexity O(n))
import java.util.Stack;
class Solution {
    public String removeStars(String s) {
        Stack <Character> stack =new Stack<>();
        // Iterate through the string
        for(char c: s.toCharArray()){
            if(c=='*'){
                // Remove the closest non-star character to the left
                if(!stack.isEmpty()){
                    stack.pop(); // delete the last added character from the stack
                }
            }
            else{
                stack.push(c);// Push non-star characters to the stack
            }
        }
        StringBuilder sb= new StringBuilder();
        for(char c:stack){
            sb.append(c);
        }
        return sb.toString();
       
    }
}
// This version without using stack
// class Solution {
//     public String removeStars(String s) {
//         StringBuilder sb= new StringBuilder(s);
//         int i=0;
//         while(i<sb.length()){
//             if(sb.charAt(i)=='*'){
//                 sb.deleteCharAt(i);
//                 sb.deleteCharAt(i-1);
//                 i=i-1;
//             }
//             else{
//                 i++;
//             }
//         }
//         return sb.toString();
       
//     }
// }