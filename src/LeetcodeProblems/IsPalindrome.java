package LeetcodeProblems;

public class IsPalindrome {

	public static boolean isPalindrome(int x) {
		int q = 0, newNum = 0;
		int y = x;
		while (y != 0) {
			q = y % 10;
			newNum = (newNum * 10) + q;
			y = y/10;
		}
		System.out.println(x);
		System.out.println(newNum);
		if (newNum == x)
			return true;
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(-121) ? "PASS" : "FAIL");
		
		
		String sample1 = "ABC06";
		StringBuffer newString = new StringBuffer(sample1);
		newString.deleteCharAt(3);
		System.out.println(newString.toString());
	}

}
