package codechallenge_emptyNumber;

public class Solution {

	public Solution() {}
	
	public int solution(int[] numbers) {
		int answer = 45;
		for(int number : numbers) {
			answer -= number;
		}
		return answer;
	}
}
