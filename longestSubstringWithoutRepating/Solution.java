/*Here,
*
* c is character array of first String
* output is Second String
* maxLength is total length of output
* output = output + String.valueOf(c)
* In Below code you can see first array is String value which is given. Second String we are adding one by one character from the first array and calculating *it’s max_length.
*
* Before storing to new array we are checking if value is already there, if yes then, we are removing those strings.
*/

class Solution {
    public int lengthOfLongestSubstring(String str) {
        String output = "";
 
        // Result
        int maxLength = -1;
 
        // Return zero if string is empty
        if (str.isEmpty()) {
            return 0;
        }
        else if (str.length() == 1) {
            // Return one if string length is one
            return 1;
        }

        for (char c : str.toCharArray()) {
            String current = String.valueOf(c);
 
            // If string already contains the character
            // Then substring after repeating character
            if (output.contains(current)) {
                output = output.substring(output.indexOf(current)+ 1);
            }
            output = output + String.valueOf(c);
            maxLength = Math.max(output.length(), maxLength);
        }
 
        return maxLength;
    }
}