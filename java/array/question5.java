/*
    Implement a method to perform basic string compression using the counts of repeated characters.
    For example, the string aabcccccaaa would become a2b1c5a3. If the "compressed" string would not
    become smaller than the original string, your method should return the original string. You can
    assume the string has only upper and lower case letters (a-z).
*/
public class question5 {
    
    public static void main(String[] args) {
        System.out.println(question5.compressString("aabcccccaaa"));
        System.out.println(question5.compressString("abc"));
    }

    public static String compressString(String str) {
        StringBuilder result = new StringBuilder();

        // Make the string a character
        char[] characters = str.toCharArray();

        // Get the first char
        char currentChar = characters[0];

        // Initialize the count
        int counter = 1;

        // Loop through the array
        for(int i = 1; i < characters.length; i++) {
            if(currentChar == characters[i]) {
                // If same character, increase counter
                counter++;
            }
            else {
                // Append the char and counter for the current char
                result.append(currentChar + "" + counter + "");

                // Set the new character
                currentChar = characters[i];

                // Reset counter
                counter = 1;            
            }

        }

        // Append the last count 
        result.append(currentChar + "" + counter + "");

        // If the result of the new string is shorter, return it
        if(result.length() < str.length()) {
            return result.toString();   
        }

        // If the new string is equal or longer, return the original string
        return str;
    }
    
}