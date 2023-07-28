package sort_arrays_of_k;

import java.util.Arrays;

public class Solution {
	
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int[] temps = Arrays.copyOfRange(array, 0, array.length);
		for(int i = 0; i < commands.length; i++) {
			array = Arrays.copyOf(temps, temps.length);
			Arrays.sort(array, commands[i][0] - 1, commands[i][1]);
			answer[i] = array[commands[i][0]+commands[i][2]-2];
		}
		System.out.println(Arrays.toString(array));
		return answer;
	}
}
