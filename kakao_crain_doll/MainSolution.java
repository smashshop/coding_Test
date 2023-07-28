package kakao_crain_doll;

public class MainSolution {

	public static void main(String[] args) {
		
		Solution sol = new Solution();
		
		int[][] board = {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		
		int result = sol.solution(board, moves);
		
		System.out.println(result);
	}

}
