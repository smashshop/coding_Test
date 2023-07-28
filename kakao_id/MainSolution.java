package kakao_id;

public class MainSolution {

	public static void main(String[] args) {
		String new_id = "...!@BaT#*..y.abcdefghijklm.";
		Solution s = new Solution();
		System.out.println(new_id);
		System.out.println(s.Solution(new_id));
		System.out.println();
		
		new_id = "z-+.^.";
		System.out.println(new_id);
		System.out.println(s.Solution(new_id));
		System.out.println();
		
		new_id = "=.=";
		System.out.println(new_id);
		System.out.println(s.Solution(new_id));
		System.out.println();
		
		new_id = "123_.def";
		System.out.println(new_id);
		System.out.println(s.Solution(new_id));
		System.out.println();
		
		new_id = "abcdefghijklmn.p";
		System.out.println(new_id);
		System.out.println(s.Solution(new_id));
		System.out.println();
	}

}
