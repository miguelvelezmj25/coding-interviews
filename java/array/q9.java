// You are given n lines. In each line there are zero or more integers. You need to answer a few 
// queries where you need to tell the number located in yth position of xth line. 

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class q9 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<Integer>[] lines = new List[scanner.nextInt()];

		scanner.nextLine();

		for(int i = 0; i < lines.length; i++) {
			lines[i] = new ArrayList<Integer>();
		}

		for(int i = 0; i < lines.length; i++) {
			String tmp = scanner.nextLine();
			String[] numbers = tmp.split("\\s");

			for(int j = 0; j < numbers.length; j++) {
				lines[i].add(Integer.valueOf(numbers[j]));
			}
		}

		int numberOfTests = scanner.nextInt();
		scanner.nextLine();

		for(int i = 0; i < numberOfTests; i++) {
			String tmp = scanner.nextLine();
			String[] query = tmp.split("\\s");
			
			if(lines[Integer.valueOf(query[0])-1].size() > 
					(Integer.valueOf(query[1]))) {
				System.out.println(lines[Integer.valueOf(query[0]-1)].get(
							Integer.valueOf(query[1])));
			}
			else {
				System.out.println("ERROR!");
			}
		}
	}
}
