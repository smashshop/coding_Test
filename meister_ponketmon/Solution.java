package meister_ponketmon;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public int solution(int[] nums) {
		
		int max_select = nums.length/2;
		Set<Integer> set = new HashSet<Integer>();
		for(int num : nums) {
			set.add(num);
		}
		
		int answer = (max_select > set.size())? set.size() : max_select;
		
		return answer;
	}
}
