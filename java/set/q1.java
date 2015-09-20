// You are given n pairs of strings. Two pairs (a,b) and (c,d) are identical if a=c and b=d. 
// That also implies (a,b) is not same as (b,a). After taking each pair as input, you need to 
// print number of unique pairs you currently have.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class q1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numberOfTests = scanner.nextInt();
		scanner.nextLine();

		Set<String> names = new HashSet<String>();

		for(int i = 0; i < numberOfTests; i++) {
			String name = scanner.nextLine();

			if(!names.contains(name)) {
				names.add(name);
			}

			System.out.println(names.size());
		}

		
	}
}
