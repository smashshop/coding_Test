package sort_arrays_of_k;

import java.util.Arrays;

public class MainSolution {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		
		int[] result = sol.solution(array, commands);
		System.out.println(Arrays.toString(result));
	}

}
