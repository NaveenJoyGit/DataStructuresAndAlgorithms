package LeetcodeProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
	
	public static Boolean isValid(String s) {
		Stack<Character> parStack = new Stack<>();
		Map<Character, Character> parMap = new HashMap<>();
		parMap.put('(', ')');
		parMap.put('[', ']');
		parMap.put('{', '}');
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		Integer count = 0;
		for(int i = 0; i < s.length(); ++i) {
			Character c = s.charAt(i);
			if(map.containsKey(c)) {
				count = map.get(c);
				map.put(c, count + 1);
			}
			else map.put(c, 1);
		}
		Integer c1, c2, c3;
		c1 = map.get('(');
		c2 = map.get('[');
		c3 = map.get('{');
		
		Integer i = 0, j = 1, count1 = 0;
		
		while(i < s.length() && s.length() > 1) {
			Character c = s.charAt(i);
			if((c == ')' || c == ']' || c == '}') && i > 0) {
				System.out.println("jaba");
				Character char2 = s.charAt(i - j);
				if(parMap.containsKey(char2)) {
					if(parMap.get(char2) == s.charAt(i)) {
						j += 2;
						count1 += 1;
					}					
				}
				else return false;
			}
			else if((c == ')' || c == ']' || c == '}') && i == 0) return false;
			else j = 1;
			i++;
		}
		
		Integer count2 = c1 + c2 + c3;
		if(count1 == count2 && s.length() > 1) return true;
	
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isValid("(){}}{") ? "PASS" : "FAIL");
	}

}
