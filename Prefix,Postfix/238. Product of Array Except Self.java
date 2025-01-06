class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int prefix []= new int [n];
        int postfix []= new int [n];

        prefix[0]=1;
        for(int i =1 ; i<n ;i++){
            prefix[i]= nums[i-1] * prefix[i-1];
        }
        postfix[n-1]=1;
        for(int i=n-2; i>=0;i-- ){
            postfix[i]=nums[i+1]*postfix[i+1];
        }
        int result[]= new int [n];
        for(int i=0; i<n; i++){
            result[i]= prefix[i]*postfix[i];
        }
        return result;
    }
}
// int n= nums.length;
//         int prefix[]= new int [n]; //Prefix Table: Contains the product of all elements to the left of each index.
//         int postfix []= new int [n]; //Suffix Table: Contains the product of all elements to the right of each index.

//         prefix[0]=1; // No elements to the left of the first element
//         for(int i=1; i<n; i++ ){
//             prefix[i]= prefix[i-1] * nums[i-1];
//         }
        
//         postfix[n-1]=1; // // No elements to the right of the last element
//         for(int i=n-2;i>=0;i--){
//             postfix[i] = postfix[i+1] * nums[i+1]; 
//         }
//         int ans[]= new int[n];
//         for(int i=0; i<n;i++){
//             ans[i]=prefix[i]*postfix[i]; //  The result at index i is the product of prefix[i] and postfix[i]

//         }
//         return ans;