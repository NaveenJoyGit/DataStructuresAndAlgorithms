package SlidingWindowPattern;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

	/*
	 * 'thisisawesome'
	 * t - 0 start
	 * h - 1
	 * i - 4
	 * s - 3
	 * 
	 */
	public static Integer longestSubstring(String s) {
		Map<Character, Integer> charIndexes = new HashMap<>();
		int start = 0, longest = 0;
		for(int i = 0; i < s.length(); i++) {
			if(charIndexes.containsKey(s.charAt(i))) {
//				longest = Math.max(longest, i - start);
//				System.out.println(longest);
//				start++;
				System.out.println("start = " + start + " \'" + charIndexes.get(s.charAt(i)) + "\'" + " : " + s.charAt(i));
				start = Math.max(start, charIndexes.get(s.charAt(i)));
			}
			longest = Math.max(longest, i - start + 1);
			System.out.println("i = " + i + " longest = " + longest + " \'" + (i - start + 1) + "\'");
			charIndexes.put(s.charAt(i), i + 1);
		}
		System.out.println("map = " + charIndexes);
		return longest;
	}
	
	public static void main(String[] args) {
		String str = "thecatinthehat";
		System.out.println(longestSubstring(str));
	}
	
}
