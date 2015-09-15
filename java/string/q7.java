// Suppose you have a string S which has length N and is indexed from 0 to N−1. String R is the 
// reverse of the string S. The string S is funny if the condition |Si−Si−1|=|Ri−Ri−1| is true for
// every i from 1 to N−1.

// (Note: Given a string str, stri denotes the ascii value of the ith character (0-indexed) of 
// str. |x| denotes the absolute value of an integer x)

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int testCases = Integer.valueOf(scanner.nextLine());

		for(int i = 0; i < testCases; i++) {
			String source = scanner.nextLine();

			char[] sourceArray = source.toCharArray();
			char[] reverseSource = new char[sourceArray.length];

			for(int j = 0; j < reverseSource.length; j++) {
				reverseSource[j] = sourceArray[sourceArray.length - 1 - j];
			}
	
			boolean funny = true;

			for(int j = 0; j < reverseSource.length-1 && funny; j++) {
				int difference = Math.abs(sourceArray[j+1] - sourceArray[j]);
				int differenceReverse = Math.abs(reverseSource[j+1] - 
						reverseSource[j]);

				if(difference != differenceReverse) {
					funny = false;	
				}
			}

			if(funny) {
				System.out.println("Funny");
			}
			else {
				System.out.println("Not Funny");
			}

		}	
	}
}
