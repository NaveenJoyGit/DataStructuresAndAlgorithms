package LeetcodeProblems;

public class ReverseInteger {

	public static int reverse(int x) {
		long newNum = 0, q = 0;
		while (x != 0) {
			newNum = (newNum * 10) + (x % 10);
			System.out.println(newNum);
			if (newNum > Integer.MAX_VALUE || newNum < Integer.MIN_VALUE)
				return 0;
			x = x / 10;
		}
		return (int) newNum;
	}

	public static void main(String[] args) {
		System.out.println(reverse(-123));
	}

}
