package Recursion;

public class RecursiveRange {

	public static Integer recursiveRange(Integer num) {
		if(num == 0) return 0;
		return num + recursiveRange(num - 1);
	}
	
	public static void main(String[] args) {
		Integer result = recursiveRange(10);
		System.out.println(result);
	}

}
