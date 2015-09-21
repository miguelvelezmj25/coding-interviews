// Given a string A, print "Yes" if it is a palindrome, print "No" otherwise. The strings will 
// consist lower case english letters only. The strings will have at most 50 characters.

import java.io.*;
import java.util.*;

public class q8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		
		char[] hold = A.toCharArray();

		StringBuilder holdReverse = new StringBuilder();

		for(int i = hold.length - 1; i >= 0; i--) {
			holdReverse.append(hold[i]);
		}	

		String reverseA = holdReverse.toString();

		for(int i = 0; i < A.length(); i++) {
			if(A.charAt(i) != reverseA.charAt(i)) {
				System.out.println("No");

				return ;
			}
		}	

		System.out.println("Yes");

		return ;
       	}
}

