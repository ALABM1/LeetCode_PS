class Solution {
    public boolean isSubsequence(String s, String t) {
        int j=0;
        int i=0;
        int result=0;
        while(j<t.length() && i<s.length()){
            if(t.charAt(j)==s.charAt(i)){
                j++;
                i++;
                result++;
            }
            else{
                j++;
            }
        }
        return result==s.length();
        
    }
}
// The algorithm I implemented is a Two-Pointer Technique:

// I use two pointers, i and j, to traverse the strings s and t, respectively.

// If the characters at the current positions of i and j match, I move both pointers forward and increment the result counter.

// If they don't match, I only move the pointer j forward in t.

// At the end, I check if the result (number of matched characters) equals the length of s. If it does, I conclude that s is a subsequence of t.