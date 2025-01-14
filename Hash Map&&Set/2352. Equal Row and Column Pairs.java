// Time complexity O(n3)
import java.util.Arrays;
class Solution {
    public int equalPairs(int[][] grid) {
      // get grid size
       int n= grid.length;
       //create transposed grid
       int [][] transpose_grid = new int[n][n];
       for(int i=0; i<n;i++){
            for(int j=0; j<n;j++){
                transpose_grid[j][i]=grid[i][j];
            }
        }
        // initilize count 
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                // Compare i-th row of grid with j-th row of transposed grid
                if (Arrays.equals(grid[i],transpose_grid[j])){ // takes Time complexity O(n)
                    count++;
                }
            }
        }
        return count;
   
    }
}
