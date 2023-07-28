package perpect_search;

import java.util.Arrays;

public class MainSolution {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] answers = {1, 2, 3, 4, 5, 2, 3, 4, 2, 1, 2, 2};
		
		int[] result = sol.solution(answers);
		System.out.println(Arrays.toString(result));
	}

}
