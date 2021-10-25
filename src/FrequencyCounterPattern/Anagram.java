package FrequencyCounterPattern;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
	
	public static void countFrequency(Character c, Map<Character, Integer> fCounter) {
		int newCount;
		if(fCounter.containsKey(c)) {
			newCount = fCounter.get(c) + 1;
			fCounter.replace(c, newCount);
		}
		else fCounter.put(c, 1);
	}

	
	public static Boolean checkIfAnagram(String s1, String s2) {
		Map<Character, Integer> fCounter1 = new HashMap<>();
		Map<Character, Integer> fCounter2 = new HashMap<>();
		s1.chars().forEach(item -> countFrequency((char) item, fCounter1));
		s2.chars().forEach(item -> countFrequency((char) item, fCounter2));
		System.out.println(fCounter1);
		System.out.println(fCounter2);
		if(fCounter1.keySet().size() != fCounter2.keySet().size()) return false;
		for(char c : fCounter1.keySet()) {
			if(!fCounter2.containsKey(c)) return false;
			if(fCounter2.get(c) != fCounter1.get(c)) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String s1 = "santa";
		String s2 = "satan";
		String result = checkIfAnagram(s1, s2) ? "PASS" : "FAIL";
		System.out.println(result);
	}

}
