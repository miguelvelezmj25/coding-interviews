/*
	Write a method to replace all spaces in a string with '%20'. You may assume
    that the string has sufficient space at the end of the string to hold the 
    additional characters, and that you are given the "true" length of the string.
    (Note: if iplementing in Java, please use character array so that you can perform
    this operation in place.)
    
    EXAMPLE 
    Input: "Mr John Smith     ", 13
    Output: "Mr%20John%20Smith"
*/

public class question {

	public static void main(String[] args) {
        char[] string = "Mr John Smith     ".toCharArray();
        
        question.replaceSpace(string, 13);
        
        System.out.println(string);
	}
    
    /*
        Replaces the spaces in a string with %20    
    */
    public static void replaceSpace(char[] string, int length){
        String specialChar = "%20";
        char[] specialChars = specialChar.toCharArray();
        
        // Loop through the char array
        for(int i = 0; i < length; i++) {
            // If the current char is a space
            if(string[i] == ' ') {
                // Shift all the chars in front of the current
                // to the right as many time as the length of the
                // special char minus 1 since it already uses a space 
                for(int j = string.length - specialChars.length - 1; j > i; j--) {
                    string[j + specialChars.length - 1] = string[j];    
                }
                
                // Insert the special chars
                for(int j = 0; j < specialChars.length; j++) {
                    string[i + j] = specialChars[j]; 
                }
                
            }
            
        }
        
    }
    
}
	
