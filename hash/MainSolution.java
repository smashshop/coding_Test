package hash;

public class MainSolution {

	public static void main(String[] args) {
		Solution sol = new Solution();
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		String result = sol.solution(participant, completion);
		System.out.println(result);
	}

}
