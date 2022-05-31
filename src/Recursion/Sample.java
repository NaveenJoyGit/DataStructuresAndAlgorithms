package Recursion;

public class Sample {
	
	public static void countDown(Integer num) {
		if(num <= 0) {
			System.out.println("Done");
			return;
		}
		System.out.print(num);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		countDown(num - 1);
	} 
	
	public static int sumRange(int num) {
		if(num == 1) return 1;
		return num + sumRange(num - 1);
	}
	
	public static int fact(int num) {
		if(num == 1) return 1;
		return num * fact(num -1);
	}
	

	public static void main(String[] args) {
		
//		countDown(5);
		
//		System.out.println(sumRange(4));
//		System.out.println(fact(5));
		
		long result = power(2, 5);
		System.out.println(result);
		
	}
	
	public static long power(int base, int exp) {
		if(exp == 1) return base;
		return base * power(base, exp - 1);
	}
	
}
