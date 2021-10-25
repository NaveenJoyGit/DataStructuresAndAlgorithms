package FrequencyCounterPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	/*
	 * Frequency of elements should be same
	 * elements can be of any order
	 */
	public static Boolean isSame(List<Integer> ar1, List<Integer> ar2) {
		if(ar1.size() == ar2.size()) {
			Integer count = 0;
			for(int i = 0; i < ar1.size(); i++) {
				for(int j = 0; j < ar2.size(); j++) {
					if(Math.pow(ar1.get(i), 2) == ar2.get(j)) {
						System.out.println(ar2.get(j) + ":" + ar1.get(i));
						ar2.remove(j);
						count++;
						break;
					}
				}
			}
			System.out.println(ar1);
			System.out.println(ar2);
			if(count == ar1.size()) return true;
			else return false;
		}
		return false;
	}
	
	public static Boolean isSameWithMap(List<Integer> ar1, List<Integer> ar2) {
		Map<Integer, Integer> frequenctCounter1 = new HashMap<>();
		Map<Integer, Integer> frequenctCounter2 = new HashMap<>();
		Integer count;
		Integer newCount;
		
		// Frequency counter algorithm
		for(Integer i : ar1) {
			if(frequenctCounter1.containsKey(i)) {
				count = frequenctCounter1.get(i);
				newCount = count + 1;
				frequenctCounter1.replace(i, count, newCount);
			}
			else frequenctCounter1.put(i, 1);
		}
		for(Integer i : ar2) {
			if(frequenctCounter2.containsKey(i)) {
				count = frequenctCounter2.get(i);
				newCount = count + 1;
				frequenctCounter2.replace(i, count, newCount);
			}
			else frequenctCounter2.put(i, 1);
		}
		
		for(Integer i : frequenctCounter1.keySet()) {
			Integer squaredKey = (int) Math.pow(i, 2);
			if(!frequenctCounter2.containsKey(squaredKey)) return false;
			if(frequenctCounter2.get(squaredKey) != frequenctCounter1.get(i)) return false;
		}
		return true;
	}

	public static void main(String[] args) {

		Integer[] ary1 = {1, 2, 3};
		Integer[] ary2 = {1, 4, 9};
		List<Integer> ar1 = new ArrayList<>();
		for(Integer i : ary1) ar1.add(i);
		List<Integer> ar2 = new ArrayList<>();
		for(Integer i : ary2) ar2.add(i);
		System.out.println(ar1);
		System.out.println(ar2);
/*		
		String result = isSame(ar1, ar2) ? "They pass!!!" : "FAIL!!!";
		System.out.println(result);
*/		

		String result = isSameWithMap(ar1, ar2) ? "PASS!!!" : "FAIL!!!";
		System.out.println(result);
		
	}

}
