package Recursion;

public class Fibonacci {
	//1 2 3 4 5 6 7
	//1 1 2 3 5 8 13
	public static Integer fib(Integer num) {
		if(num <= 2) return 1;
		return fib(num - 1) + fib(num - 2);
	}

	public static void main(String[] args) {
		Integer result = fib(4);
		System.out.println("nth fib no. = " + result);
	}

}
