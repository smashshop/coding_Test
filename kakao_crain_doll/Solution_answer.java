package kakao_crain_doll;

import java.util.Stack;

public class Solution_answer {

	public Solution_answer() {}
	
	public int Solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> st = new Stack<>();
		
		for(int move : moves) {
			for(int i = 0; i < board.length; i++) {
				
				if(board[i][move-1] != 0) {
					if(st.empty()) {
						st.push(board[i][move-1]);
					}else if(st.peek() == board[i][move-1]) {
						st.pop();
						answer += 2;
					}else {
						st.push(board[i][move-1]);
					}
					board[i][move-1] = 0;
					break;
				}
				
			}
		}
		
		return answer;
	}
}
