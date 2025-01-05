class Solution {
    public String reverseWords(String s) {
        // Trim the input string to remove leading and trailing spaces
        //s.split("\\s+"): Splits the trimmed string into an array of words using one or more spaces (\\s+) as the delimiter.
        String[] str = s.trim().split("\\s+");

        // Initialize the output string
        String out = "";

        // Iterate through the words in reverse order
        for (int i = str.length - 1; i > 0; i--) {
            // Append the current word and a space to the output
            out += str[i] + " ";
        }

        // Append the first word to the output (without trailing space)
        return out + str[0];
    }
}


// s = s.trim();  // Removes leading and trailing spaces

        // StringBuilder sb=new StringBuilder(s);
        // int i=1;
        // // this loop to eliminate the extra the multiple extra spaces between words
        // while(i<sb.length()){
        //      if((sb.charAt(i-1)==' ' && sb.charAt(i)==' ') ) {
        //         sb.deleteCharAt(i-1);
        //      }
        //      else{
        //         i++;
        //      }
        // }
        // // This Loop to create a table containing the words 
        // List<String>  TableauOfWords= new ArrayList<>();
        // StringBuilder word = new StringBuilder();
        // for(int j=0 ;j<sb.length(); j++){
            
        //     if(sb.charAt(j) == ' '){
        //         TableauOfWords.add(word.toString());
        //         word.setLength(0);
        //     }
        //     else{
        //         word.append(sb.charAt(j));
        //     }
            
        // }
        // if(word.length()>0){
        //     TableauOfWords.add(word.toString());
        // }
        // // reverse Loop to put those words from the table in a string 
        // StringBuilder result = new StringBuilder();
        // for(int j=TableauOfWords.size()-1;j>=0;j--){
        //     System.out.println(TableauOfWords.get(j));
        //     result.append(TableauOfWords.get(j));
        //     if (j > 0) {
        //     result.append(" ");  // Add a space between words
        //     }
        // }
        // return result.toString();