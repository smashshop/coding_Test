package kakao_report;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution_failed {

	public Solution_failed() {
		
	}
	
	public static String[] distinct(String[] report) {
		List<String> list = Arrays.asList(report);
		
		Set<String> set = new HashSet<String>(list);
		
		List<String> newList = new ArrayList<String>(set);
		
		
		String[] tempreport = new String[newList.size()];
		
		for(int i = 0; i < newList.size(); i += 1) {
			tempreport[i] = newList.get(i);
		}
		
		return tempreport;
	}
	
	public int[] Solution(String[] id_list, String[] report, int k) {
		report = distinct(report);
		
		HashMap<String, Integer> mailNum = new HashMap<>();
		HashMap<String, Integer> reportNum = new HashMap<>();
		String temp = null;
		
		for(String i : id_list) {
			if(i == null || i == "") {
				continue;
			}
			mailNum.put(i, 0);
			for(String j : report) {
				if(i == null || i == "") {
					continue;
				}
				if(j.indexOf(i) == 0) {
					temp = j.substring(j.indexOf(" ") + 1);
					if(reportNum.containsKey(temp)) {
						reportNum.put(temp, reportNum.get(temp) + 1);
					}else{
						reportNum.put(temp, 1);
					}
				}
				
			}
		}
		
		int[] answer = new int[mailNum.size()];
		int count = 0;
		for(String id : id_list) {
			for(String j : report) {
				if(j.indexOf(id) == 0) {
					temp = j.substring(j.indexOf(" ") + 1);
					if(reportNum.get(temp) >= k) {
						mailNum.put(id, mailNum.get(id) + 1);
					}
				}
			}
			answer[count] = mailNum.get(id);
			count += 1;
		}
		
		return answer;
	}
}
