package kakao_int_string;

public class Solution {
	public Solution() {
		
	}
	
	public int Solution(String s) {
		String[] strArrays = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String[] intArrays = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		
		for(int i = 0; i < strArrays.length; i += 1) {
			s = s.replace(strArrays[i], intArrays[i]);
		}
		
		int answer = Integer.parseInt(s);
		return answer;
	}
}
