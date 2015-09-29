// SRM 590 DIV 2

public class FoxAndGomoku {
	
	public String win(String[] board) {
		char token = 'o';
		int count = 0;

		for(int i = 0; i < board.length; i++) {
			count = 0;

			for(int j = 0; j < board.length; j++) {
				if(board[i].charAt(j) == token) {
					count++;
				}	
				else {
					count = 0;
				}

				if(count == 5) {
					return "found";
				}
			}
		}

		for(int i = 0; i < board.length; i++) {
			count = 0;

			for(int j = 0; j < board.length; j++) {
				if(board[j].charAt(i) == token) {
					count++;
				}
				else {
					count = 0;
				}

				if(count == 5) {
					return "found";
				}
			}
		}	

		for(int i = 0; i < board.length; i++) {
			count = 0;
			int offset = 0;

			for(int j = 0; j < board.length; j++) {
				if((i+offset) < board.length && board[i+offset].charAt(j) == 
						token) {
					count++;
					offset++;	
				}	
				else {
					count = 0;
					offset = 0;
				}

				if(count == 5) {
					return "found";
				}
			}
		}

		for(int i = board.length - 1; i >= 0; i--) {
			count = 0;
			int offset = 0;

			for(int j = 0; j < board.length; j++) {
				if((i-offset) >= 0 && board[i-offset].charAt(j) == 
						token) {
					count++;
					offset++;	
				}	
				else {
					count = 0;
					offset = 0;
				}

				if(count == 5) {
					return "found";
				}
			}
		}

		return "not found";
	}
}
