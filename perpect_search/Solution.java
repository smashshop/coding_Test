package perpect_search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

	public int[] solution(int[] answers) {
		int[][] supoja = {{1, 2, 3, 4, 5}, 
						  {2, 1, 2, 3, 2, 4, 2, 5}, 
						  {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
		Map<Integer, Integer> tempMap = new HashMap<Integer, Integer>();
		
		int scount;
		int score = 0;
		int maxScore = 0;
		for(int i = 0; i < supoja.length; i++) {
			scount = 0;
			score = 0;
			for(int j = 0; j < answers.length; j++) {
				score = (supoja[i][scount] == answers[j])? ++score : score;
				System.out.print(score);
				scount = (scount < supoja[i].length - 1)? ++scount : 0;
			}
			tempMap.put(i + 1, score);
			maxScore = (maxScore < score)? score : maxScore;
			System.out.println();
		}
		
		List<Integer> maxSupoja = new ArrayList<Integer>();
		for(int key : tempMap.keySet()) {
			if(tempMap.get(key) == maxScore) {
				maxSupoja.add(key);
			}
		}
		int[] answer = maxSupoja.stream().mapToInt(i -> i).toArray();
		return answer;
	}

}
