// Time complexity : O(n)
import java.util.*;
class Solution {
    public int maxVowels(String s, int k) {
        char[] vowelsArray= {'a','e','i','o','u'};
        Set<Character> set= new HashSet<>();
        for(char c : vowelsArray){
            set.add(c);
        }
        //Count vowels in the first window.
        int x=0;
        for(int i=0;i<k;i++){
            if(set.contains(s.charAt(i))) {
                x++;
            }
        }
        int maxVowel=x; // Initialize maxVowels with the count of the first window
        for(int i=k; i<s.length();i++){

            if(set.contains(s.charAt(i-k))){ // Left Character going out of the window
                x--; // Decrement count if the character is a vowel
            }
            if(set.contains(s.charAt(i))){ // Right Character coming into the window
                x++; // Increment x if the character is a vowel
            }
            maxVowel = Math.max(maxVowel,x);  
        }
        return maxVowel;
    }
}

// Approach :
// 1. Use a sliding window of size k to traverse the string.

// 2. Count vowels in the first window.

// 3. Slide the window one character at a time:

//     Subtract the leftmost character if it's a vowel.

//     Add the new rightmost character if it's a vowel.

// 4. Track the maximum number of vowels in any window.