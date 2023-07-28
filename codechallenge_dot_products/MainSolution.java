package codechallenge_dot_products;

public class MainSolution {

	public static void main(String[] args) {
		Solution sol = new Solution();
		
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		
		int result = sol.solution(a, b);
		
		System.out.println(result);
	}

}
