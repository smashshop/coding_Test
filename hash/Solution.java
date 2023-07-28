package hash;

import java.util.HashMap;

public class Solution {
	
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> hash = new HashMap<>();
		for(String part : participant) {
			if(hash.containsKey(part)) {
				hash.put(part, hash.get(part) +1);
			}else {
				hash.put(part, 1);
			}
		}
		
		for(String comp : completion) {
			if(hash.get(comp) == 1) {
				hash.remove(comp);
			} else {
				hash.put(comp, hash.get(comp) - 1);
			}
		}
		answer = hash.keySet().toString();
		answer = answer.substring(1, answer.length()-1);
		return answer;
	}
}
