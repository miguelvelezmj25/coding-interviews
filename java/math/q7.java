// SRM 625 DIV 2

public class AddMultiply {

    public int[] makeExpression(int y) {
        int[] result = new int[3];

        for(int i = 2; i <= 1000; i++) {
            int x = y - (i * i);

            if(x >= -1000 && x <= 1000 && x != 0 && x != 1) { 
                result[0] = i;
                result[1] = i;
                result[2] = x;
            }
        }

        return result;
    }
}
