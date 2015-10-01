// SRM 595 DIV 2 250

public class LittleElephantAndBallsAgain {
	
	public static int getNumber(String S) {
            if(S.length() == 1) {
                return 0;
            }   

            final int R = 0;
            final int G = 1;
            final int B = 2;

            int[] count = new int[3];
            char[] chars = { 'R', 'G', 'B' };
            int operations = 0;
            boolean singleLetter = false;

            while(!singleLetter) {
                count = new int[3];
                
                for(int i = 0; i < S.length(); i++) {
                    if(S.charAt(i) == chars[R]) {
                        count[R] += 1;
                    }
                    else if(S.charAt(i) == chars[G]) {
                        count[G] += 1;
                    }
                    else if(S.charAt(i) == chars[B]) {
                        count[B] += 1;
                    }
                }

                int max = 0;

                for(int i = 1; i < count.length; i++) {
                    if(count[i] > count[0]) {
                        max = i;
                    }   
                }

                if(count[max] == S.length()) {
                    singleLetter = true;
                }
                else {
                    int minValue = Integer.MAX_VALUE;
                    int min = -1;

                    for(int i = 0; i < count.length; i++) {
                        if(count[i] < minValue && count[i] !=0 ) {
                            min = i;
                            minValue = count[i];
                        }
                    }
                    
                    if(S.charAt(0) == chars[min]) {
                        S = S.substring(1);
                    }
                    else if(S.charAt(S.length()-1) == chars[min]) {
                        S = S.substring(0, S.length() - 1);
                    }
                    else {
                        S = S.substring(1);
                    }
                    
                    operations++;
                }
            }
        
            return operations;  
	}
}

