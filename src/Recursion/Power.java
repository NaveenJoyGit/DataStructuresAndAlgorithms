package Recursion;

public class Power {
	
	public static Integer power(Integer base, Integer power) {
		if(power == 1) return base;
		return base * power(base, power - 1);
	}

	public static void main(String[] args) {
		Integer result = power(8, 2);
		System.out.println(result);
	}

}
