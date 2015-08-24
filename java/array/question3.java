/*
	Given two strings, write a method to decide if one is a permutation of the other
*/
import java.util.Arrays;

public class question3 {

	public static void main(String[] args) {
		System.out.println(question3.isPermutation("dog", "god"));
        
		System.out.println(question3.isPermutation("dog ", "god"));
	}
    
    /**
    * Check if one string is a permutation of the other. This method ignores
    * case and counts whitespaces as character
    */
    public static boolean isPermutation(String str1, String str2) {
        // Change the strings to char arrays
        char[] array1 = str1.toLowerCase().toCharArray();
        char[] array2 = str2.toLowerCase().toCharArray();
        
        // Sort the arrays
        Arrays.sort(array1);
        Arrays.sort(array2);
        
        // Create strings from the arrays
        String word1 = new String(array1);
        String word2 = new String(array2);
        
        // Return if the are equal or not
        return word1.equals(word2);
    }

}
	
