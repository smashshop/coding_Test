package greedy;

public class MainSolution {

	public static void main(String[] args) {
		Solution sol = new Solution();
		
		int n = 5;
		int[] lost = {1,2,4};
		int[] reserve = {2,3,4,5};
		
		int result = sol.solution(n, lost, reserve);
		System.out.println(result);
	}

}
