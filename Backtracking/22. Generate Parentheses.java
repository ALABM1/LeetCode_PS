import java.util.ArrayList;
import java.util.List;
class Solution {
    //Solution in JAVA : 
    public List<String> generateParenthesis(int n) {
        List<String> output_arr =new ArrayList();
        backtrack(output_arr,"",0,0,n);
        return output_arr;
        
    }
    public void backtrack(List<String> output_arr, String current_string,int open, int close, int max){
        if(current_string.length() == max*2){
            output_arr.add(current_string);
            return;
        }
        if(open<max) backtrack(output_arr, current_string+"(",open+1, close,max);
        if(close<open) backtrack(output_arr,current_string+")",open,close+1, max);
    }
    
    }

//#  Role of  "return;"

// **Prevent Further Execution:**
// The "return;"  statement in the base case prevents any further execution in the current call of the backtrack method. Once a valid combination is found and added to outputarr, we do not want to continue exploring this path further, as it has already fulfilled the condition currentstring.length() == max  2.

// **Backtracking:**
// After the "return;"  statement, the control goes back to the previous call in the call stack. This is essential for backtracking, as it allows the algorithm to undo the last step (either adding ( or )) and try other possible paths.