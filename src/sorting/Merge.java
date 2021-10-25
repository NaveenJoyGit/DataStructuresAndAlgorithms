package sorting;

public class Merge {

	public static Integer[] mergeSort(Integer[] arr) {
		if(arr.length == 1) return arr;
		Integer mid = Math.floorDiv(arr.length, 2);
		Integer end = arr.length;
		Integer[] leftArray = new Integer[mid];
		Integer[] rightArray = new Integer[end - mid];
		for(int i = 0; i < mid; ++i) {
			leftArray[i] = arr[i];
		}
		for(int i = mid; i < end; ++i) {
			rightArray[i - mid] = arr[i];
		}
		
		Integer[] left = mergeSort(leftArray);
		Integer[] right = mergeSort(rightArray);
		return merge(arr, left, right);
	}
	
	public static Integer[] merge(Integer[] res, Integer[] arr1, Integer[] arr2) {
		int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length) {
			if(arr2[j] < arr1[i]) {
				res[k++] = arr2[j++];
			}
			else {
				res[k++] = arr1[i++];
			}
		}
		while(i < arr1.length) {
			res[k++] = arr1[i++];
		}
		while(j < arr2.length) {
			res[k++] = arr2[j++];
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println("Hello world");
		Integer[] input = {2,14,99,100,1,56,23,300,32,98,3,4,25,7,990};
		Integer[] result = mergeSort(input);
		for(Integer res : result) {
			System.out.print(res + " ");
		}
	}

}
