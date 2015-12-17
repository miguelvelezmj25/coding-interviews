// SRM 627 DIV 2

public class ManySquares {
    
    public int howManySquares(int[] sticks) {
        int squares = 0;

        if(sticks.length < 4) {
            return squares;
        }

        for(int i = 1; i < sticks.length; i++) {
            int j = i;
            int value = sticks[i];

            while(j > 0 && value < sticks[j - 1]) {
                sticks[j] = sticks[j - 1];
                j--;
            }

            sticks[j] = value;
        }

        int count = 1;
        int length = sticks[0];

        for(int i = 1; i < sticks.length; i++) {
            
            if(sticks[i] == length) {
                count++;

                if(count == 4) {
                    squares++;

                    count = 0;
                }
            }
            else {
                count = 1;
                length = sticks[i];
            }
        }

        return squares;

    }

}
