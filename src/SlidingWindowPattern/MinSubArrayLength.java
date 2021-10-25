package SlidingWindowPattern;

import java.util.Arrays;
import java.util.List;

public class MinSubArrayLength {

	/*
	 * [2,3,1,2,3,4] -> 7 = [4,3] => 2
	 */
	public static Integer minSubArrayLenth(Integer[] a, Integer sum) {
		int total = 0, start = 0, end = 0, minLength = Integer.MAX_VALUE;
		while(start < a.length) {
			if(total < sum && end < a.length) {
				total += a[end];
				end++;
			}
			
			else if(total >= sum) {
				minLength = Math.min(minLength, end - start);
				total -= a[start];
				start++;
			}
			else
				break;
		}
		return minLength == Integer.MAX_VALUE ? 0 : minLength;
	}

	public static void main(String[] args) {
		
		Integer[] array = {2,3,1,2,4,3};
		System.out.println(minSubArrayLenth(array, 7));
		
	}

}