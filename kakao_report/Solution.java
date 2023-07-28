package kakao_report;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
	
	public String[] distinct(String[] report) {
		List<String> list = Arrays.asList(report);
		Set<String> set = new HashSet<>(list);
		List<String> newlist = new ArrayList<>(set);
		newlist.remove(null);
		String[] tempreport = new String[newlist.size()];
		int i = 0;
		for(String newli : newlist) {
			tempreport[i] = newli;
			i++;
		}
		
		return tempreport;
	}

	public int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];
		report = distinct(report);
		HashMap<String, Integer> reportNum = new HashMap<>();
		HashMap<String, String> mailNum = new HashMap<>();
		String[] temps = null;
		for(String re : report) {
			temps = re.split(" ");
			if(mailNum.containsKey(temps[0])) {
				mailNum.put(temps[0], mailNum.get(temps[0]) + " " + temps[1]);
			}else {
				mailNum.put(temps[0], temps[1]);
			}
			
			if(reportNum.containsKey(temps[1])) {
				reportNum.put(temps[1], reportNum.get(temps[1]) + 1);
			}else {
				reportNum.put(temps[1], 1);
			}
		}
		
		for(String key : mailNum.keySet()) {
			System.out.println(key + ":" + mailNum.get(key));
		}
		
		int cont = 0;
		int tempcont;
		for(String id : id_list) {
			tempcont = 0;
			try {
				temps = mailNum.get(id).split(" ");
				for(String i : temps) {
					if(reportNum.get(i) >= k) {
						tempcont++;
					}
				}
			} catch(NullPointerException e) {
				
			}
			answer[cont] = tempcont;
			cont++;
		}
		
		return answer;
	}
}
