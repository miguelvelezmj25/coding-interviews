// Reverse a string

public class q6 {
	
	public static void main(String[] args) {
		String source = "java";

		System.out.println(reverse(source));
	}	

	public static String reverse(String source) {
		StringBuilder result = new StringBuilder();

		for(int i = source.length() - 1; i >= 0 ; i--) {
			result.append(source.charAt(i));
		}

		return result.toString();
	}
}
