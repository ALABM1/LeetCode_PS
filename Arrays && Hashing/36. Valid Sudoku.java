import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        //create hashSet because it did not accept duplicates
        Set<String> set= new HashSet<>();

        for(int i =0; i < board.length;i++){
            for(int j=0; j<board[0].length;j++){
                char cur = board[i][j];
                if(cur !='.'){
                      // Construct unique identifiers for the row, column, and 3x3 sub-box
                       String rowIdentifier = "row" + i + cur;   // E.g., "row0-5" for digit '5' in row 0
                       String colIdentifier = "col" + j + cur;   // E.g., "col0-5" for digit '5' in column 0
                       String boxIdentifier = "box" + (i / 3) + (j / 3) + cur;  // E.g., "box00-5" for digit '5' in the top-left 3x3 box
                    // now we Check if any of the identifiers are already in the set
                    if(!set.add(rowIdentifier)   || !set.add(colIdentifier)  || !set.add(boxIdentifier)  
                    ){
                        return false; // if an identifier already  exist in the set return false 
                    }
                }
            }
        }
        return true;    
    }
}