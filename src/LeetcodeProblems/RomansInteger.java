package LeetcodeProblems;

import java.util.HashMap;

public class RomansInteger {
	
	public static Integer romanToInr(String s) {
		Integer result = 0;
		HashMap<Character, Integer> romans = new HashMap<>();
		romans.put('I', 1);
		romans.put('V', 5);
		romans.put('X', 10);
		romans.put('L', 100);
		romans.put('C', 100);
		romans.put('D', 500);
		romans.put('M', 1000);
		for(int i = 0; i < s.length(); i++) {
			result += romans.get(s.charAt(i));
			if(i > 0) {
				if((s.charAt(i) == 'V' || s.charAt(i) == 'X') && s.charAt(i - 1) == 'I') result -= 2;
				if((s.charAt(i) == 'L' || s.charAt(i) == 'C') && s.charAt(i - 1) == 'X') result -= 20;
				if((s.charAt(i) == 'D' || s.charAt(i) == 'M') && s.charAt(i - 1) == 'C') result -= 200;				
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Integer result = romanToInr("IVI");
		System.out.println(result);
		String s = "Naveen";
		String newS = s.substring(0, 3);
		System.out.println(newS);
	}
	
}
