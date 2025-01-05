class Solution {
    public String mergeAlternately(String word1, String word2) {
       StringBuilder s = new StringBuilder();
       // in Java, String is immutable, and it does not have an append method. This is why you get a compilation error.
       //If you want to use append, you need to use a StringBuilder, which is a mutable class designed for efficient string manipulation.
       int i=0;
       while(i<word1.length() || i<word2.length()){
        if(i<word1.length()){
            s.append(word1.charAt(i));
        }
        if(i<word2.length()){
            s.append(word2.charAt(i));
        }
        i++;
       }
        return s.toString();
        
    }
}

// Another solution
// class Solution {
//     public String mergeAlternately(String word1, String word2) {
//         int len=Math.min(word1.length(), word2.length());
//         int max=Math.max(word1.length(), word2.length());
//         String s="";
//         for(int i=0; i<len; i++){
//                 s+= word1.charAt(i);
//                 s+= word2.charAt(i);
//         }
//         if(word1.length()>len){
//             for(int i=len; i<max; i++){
//                 s+= word1.charAt(i);
//             }
//         }
//         else{
//             for(int i=len; i<max; i++){
//                 s+= word2.charAt(i);
//             }
//         }
//         return s;
        
//     }
// }