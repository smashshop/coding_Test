package codechallenge_emptyNumber;

public class MainSolution {

	public static void main(String[] args) {
		Solution sol = new Solution();
		
		int[] numbers = {1,2,3,4,6,7,8,0};
		
		int result = sol.solution(numbers);
		System.out.println(result);
	}

}
