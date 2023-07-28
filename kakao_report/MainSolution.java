package kakao_report;

import java.util.Arrays;
import java.util.HashMap;

public class MainSolution {

	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		Solution s = new Solution();
//		Solution_failed s = new Solution_failed();
		
//		HashMap<String, Integer> h = new HashMap<>();
//		h.put("상원", 1);
//		System.out.println(h.get("상원"));
		
//		String st1 = "muzz aa";
//		String st2 = st1.substring(st1.indexOf(" ") + 1);
//		System.out.println(st2);
		
//		HashMap<String, Integer> h = new HashMap<>();
//		try{
//			h.put("상원", h.get("상원") + 1);
//		}catch(NullPointerException e) {
//			h.put("상원", 0);
//		}
//		System.out.println(h.get("상원"));
		
		int[] an = s.solution(id_list, report, k);
		
		System.out.println(Arrays.toString(an));
	}

}
