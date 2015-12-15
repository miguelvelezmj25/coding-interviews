// SRM 624 DIV 2

public class CostOfDancing {
    
    public int minimum(int K, int[] danceCost) {
        int result = 0;
       
        if(K == danceCost.length) {
            
            for(int i = 0; i < K; i++) {
                result += danceCost[i];    
            }        

            return result;
        }

        for(int i = 1; i < danceCost.length; i++) {
            int j = i;
            int min = danceCost[j];

            while(j > 0 && min < danceCost[j - 1]) {
               danceCost[j] = danceCost[j - 1]; 
               j--;
            }

            danceCost[j] = min;
        }         

        for(int i = 0; i < K; i++) {
            result += danceCost[i];
        }

        return result;

    }
}
