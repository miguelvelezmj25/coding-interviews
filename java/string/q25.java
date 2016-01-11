// SRM 630 DIV 2 250

public class DoubleLetter {

    public String ableToSolve(String S) {
        boolean possible = true;
        
        while(possible) {
            char current = S.charAt(0);
            
            possible = false;

            for(int i = 1; i < S.length(); i++) {

                if(current == S.charAt(i)) {
                   possible = true;

                   String hold = S.substring(0, i-1);
                   hold += S.substring(i+1); 
                   
                   if(hold.length() == 0) {
                       return "Possible";
                   }
                   else {
                       S = hold;

                       break;
                   }
                } 
                else {
                    current = S.charAt(i);
                }
                
            }
        }

        return "Impossible";
    }
}
