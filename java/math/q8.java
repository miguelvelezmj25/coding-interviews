// SRM 626 DIV 2 250

public class SumOfPower {

    public int findSum(int[] array) {
        int sum = 0;
        
        for(int size = 1; size <= array.length; size++) {
            
            for(int index = 0; index + size <= array.length; index++) {
               
               for(int walk = 0; walk < size; walk++) {
                    sum += array[index + walk];
               } 
            }
        }

        return sum;
    }
}
