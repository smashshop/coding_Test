package codechallenge_minus_plus;

public class MainSolution {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] absolutes = {4,7,12};
		boolean[] signs = {true,false,true};
		
		int result = sol.solution(absolutes, signs);
		System.out.println(result);
	}

}
