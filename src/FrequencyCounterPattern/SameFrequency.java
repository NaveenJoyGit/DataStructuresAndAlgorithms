package FrequencyCounterPattern;

import java.util.HashMap;
import java.util.Map;

public class SameFrequency {
	
	public static Boolean isSameFrequency(Integer[] a, int x, int y) {
		Map<Integer, Integer> frequencyCounter = new HashMap<>();
		for(Integer i : a) {
			if(frequencyCounter.containsKey(i)) {
				frequencyCounter.replace(i, frequencyCounter.get(i) + 1);
			}
			else frequencyCounter.put(i, 1);
		}
		System.out.println(frequencyCounter);
		if(frequencyCounter.get(x) != frequencyCounter.get(y)) return false;
		return true;
	}

	public static void main(String[] args) {

		Integer[] array = {1,2,5,2,8,1,5};
		System.out.println(isSameFrequency(array, 2, 5) ? "PASS" : "FAIL");
		
	}

}
