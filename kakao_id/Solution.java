package kakao_id;

public class Solution {
	

	public Solution() {
		
	}

	public static String step01(String s){
		return s.toLowerCase();
	}
	
	public static String step02(String s) {
		return s.replaceAll("[^\\-_.\\d\\w]*", "");
	}
	
	public static String step03(String s) {
		return s.replaceAll("\\.{2,}", ".");
	}

	public static String step04(String s) {
		return s.replaceAll("^\\.|\\.$", "");
	}
	
	public static String step05(String s) {
		if(s == null || s.equals("")) {
			return "a";
		}
		return s;
	}
	
	public static String step06(String s) {
		if(s.length() > 15) {
			return s.substring(0, 15).replaceAll("\\.$", "");
		}
		return s;
	}
	
	public static String step07(String s) {
		while(3 - s.length() > 0) {
			s += s.charAt(s.length() - 1);
		}
		return s;
	}
	
	public String Solution(String new_id) {
		String answer= new_id;
		answer = step01(answer);
		System.out.println(answer);
		answer = step02(answer);
		System.out.println(answer);
		answer = step03(answer);
		System.out.println(answer);
		answer = step04(answer);
		System.out.println(answer);
		answer = step05(answer);
		System.out.println(answer);
		answer = step06(answer);
		System.out.println(answer);
		answer = step07(answer);
		return answer;
	}
}
