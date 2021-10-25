package Searching;

public class BinarySearch {
	
	public static Integer binarySearch(Integer[] a, Integer value) {
		int left = 0;
		int right = a.length - 1;
		int middle = 0;
		while(left <= right) {
			middle = left + Math.abs((right-left)/2);
			if(value == a[middle]) {
				return middle;
			}
			else if(value < a[middle]) {
				right = middle - 1;
			}
			else if(value > a[middle]) {
				left = middle + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Integer[] array = {1,3,5,7,8,10,11};
		System.out.println(binarySearch(array, 10));
	}

}
