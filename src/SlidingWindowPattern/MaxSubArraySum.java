package SlidingWindowPattern;

public class MaxSubArraySum {

	/*
	 * Should find the maximum sum with n no. of elements from the array
	 */
	public static Integer maxSubArraySumSimple(Integer[] a, Integer n) {
		Integer maxSum = 0,sum = 0;
		for(int i = 0; i < a.length; ++i) {
			sum += a[i];
			for(int j = i+1; j < i + n; j++) {
				if(j == a.length) break;
				sum += a[j];
			}
			if(sum > maxSum) {
				System.out.println(sum);
				maxSum = sum;
			}
			sum = 0;
		}
		return maxSum;
	}
	
	public static Integer maxSumUsingSlidingWindow(Integer[] a, Integer n) {
		Integer tempSum = 0, maxSum = 0;
		for(int i = 0; i < n; ++i) {
			tempSum += a[i];
			System.out.println("first iteration sum = " + tempSum);
		}
		for(int i = 1; i <= a.length - n; i++) {
			tempSum = tempSum + a[i + n - 1] - a[i - 1];
			System.out.println(tempSum);
			maxSum = Math.max(tempSum, maxSum);
		}
		return maxSum;
	}
	
	//[1,2,4,7,3,1,4,7] n = 3
	//it should be a subarray
	public static void main(String[] args) {
		Integer[] array = {-3,4,0,-2,6,-1};
		Integer[] ar2 = {4,2,1,6};
		Integer result = maxSubArraySumSimple(array, 2);
		System.out.println("---" + result + "---");
		Integer result2 = maxSumUsingSlidingWindow(array, 2);
		System.out.println("***" + result2 + "***");
	}

}
