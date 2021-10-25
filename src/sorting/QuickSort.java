package sorting;

public class QuickSort {

	public static void swap(Integer[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static Integer pivotHelper(Integer[] arr, int startIndex, int endIndex) {
		Integer pivotIndex = startIndex;
		for (int i = startIndex + 1; i <= endIndex; ++i) {
			if (arr[i] < arr[startIndex]) {
				pivotIndex++;
				swap(arr, i, pivotIndex);
			}
		}
		swap(arr, pivotIndex, startIndex);
		return pivotIndex;
	}
	
	public static Integer[] quickSort(Integer[] arr, int leftIndex, int rightIndex) {
		if(leftIndex < rightIndex) {
			Integer pivotPoint = pivotHelper(arr, leftIndex, rightIndex);
			quickSort(arr, leftIndex, pivotPoint - 1);
			quickSort(arr, pivotPoint + 1, rightIndex);			
		}
		return arr;
	}

	public static void main(String[] args) {
		Integer[] input = {5,2,1,8,4,7,6,3,23,11,56,66,21};
		Integer[] result = quickSort(input, 0, input.length - 1);
		for(Integer i : result) {
			System.out.print(i + " ");
		}
	}

}
