package kakao_crain_doll;

public class Solution {
	
	public Solution() {
		
	}
	
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		int cont = 0;
		int tempin;
		int[] tempArrays = new int[moves.length + 1];
		for(int i = 0; i < moves.length; i += 1) {
			tempin = moves[i] - 1;
			for(int j = 0; j < board.length; j ++) {
				if(board[j][tempin] != 0) {
					tempArrays[cont] = board[j][tempin];
					board[j][tempin] = 0;
					break;
				}
			}
			cont++;
			
		}
		
		for(int i = 1; i < tempArrays.length-1; i++) {
			if(tempArrays[i-1] == tempArrays[i] && tempArrays[i] != 0) {
				for(int j = i; j < tempArrays.length-1; j++) {
//					for(int ta : tempArrays) {
//						System.out.print(ta + " ");
//					}
					tempArrays[j-1] = tempArrays[j+1];
//					System.out.println();
					
				}
				i = (i - 2 < 0)? 0 : (i - 2);
				answer += 2;
			}
			
		}
		
//		for(int ta : tempArrays) {
//			System.out.print(ta + " ");
//		}
//		System.out.println(answer);
        return answer;
    }
}
