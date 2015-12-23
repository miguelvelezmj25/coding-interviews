// SRM 628 DIV 2 250

public class BishopMove {
    
    public int howManyMoves(int r1, int c1, int r2, int c2) {
        
        if(r1 == r2 && c1 == c2) {
            return 0;
        }

        if((r1 + c1) % 2 != (r2 + c2) % 2) {
            return -1;
        }
        
        if(Math.abs(r2 - r1) == Math.abs(c2 - c1)) {
            return 1;
        }

        return 2;
    }

}
