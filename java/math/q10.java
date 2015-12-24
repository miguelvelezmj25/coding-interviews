// SRM 629 DIV 2 250

public class RectangleCoveringEasy {
    
    public int solve(int holeH, int holeW, int boardH, int boardW) {
        
        if(boardH >= holeH && boardW > holeW) {
            return 1;
        }

        if(boardH > holeW && boardW > holeH) {
            return 1;
        }

        return -1;
    }
}
