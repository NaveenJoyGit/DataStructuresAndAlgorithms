package MultiplePointerPattern;

public class Subsequence {

	public static Boolean isSubSequence(String s1, String s2) {
		int i = 0;
		int j = 0;
		while(j < s2.length()) {
			if(s2.charAt(j) == (s1.charAt(i))) {
				i++;
			}
			if(i == s1.length()) {
				return true;
			}
			j++;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println("----OUTPUT----");
		Boolean pass = isSubSequence("abc", "acb");
		if(pass) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
	}

}
