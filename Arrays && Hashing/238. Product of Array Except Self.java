class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int prefix[]= new int [n]; //Prefix Table: Contains the product of all elements to the left of each index.
        int postfix []= new int [n]; //Suffix Table: Contains the product of all elements to the right of each index.

        prefix[0]=1; // No elements to the left of the first element
        for(int i=1; i<n; i++ ){
            prefix[i]= prefix[i-1] * nums[i-1];
        }
        
        postfix[n-1]=1; // // No elements to the right of the last element
        for(int i=n-2;i>=0;i--){
            postfix[i] = postfix[i+1] * nums[i+1]; 
        }
        int ans[]= new int[n];
        for(int i=0; i<n;i++){
            ans[i]=prefix[i]*postfix[i]; //  The result at index i is the product of prefix[i] and postfix[i]

        }
        return ans;
        
        
    }
}

// Intuition
// Approach
// 1/Initialize prefix and postfix arrays
// 2/Compute the prefix products
// 3/Compute the postfix products
// 4/Compute the result array : result[ i ] = prefix[ i ] * postfix[ i ]

// Complexity
// Time complexity: O(n)
// Space complexity: O(n)