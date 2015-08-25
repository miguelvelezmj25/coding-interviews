// Determine if somebody has won a tic-tac-toe game

public class q2 {
    
	public static void main(String[] args) {
    		int[][] game = { {1,-1,0}, {1,-1,1} ,{1,-1,1} };
		
		System.out.println(whoWon(game));
	}	

	public static int whoWon(int[][] game) {
		for(int i = 0; i < game.length; i++) {
			int rowSum = 0;
			int columnSum = 0;
	
			for(int j = 0; j < game[i].length; j++) {
				rowSum += game[i][j];
				columnSum += game[j][i];				
			}

			if(rowSum == 3 || columnSum == 3) {
				return 1;
			}
			else if(rowSum == -3 || columnSum == -3) {
				return -1;
			}
		}
		
		return 0;
	}
    
}
