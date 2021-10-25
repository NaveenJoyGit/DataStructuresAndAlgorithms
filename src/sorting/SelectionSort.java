package sorting;

public class SelectionSort {

	public static Integer[] selectionSort(Integer[] a) {
		int l = a.length;
		int minIndex;
		int i, j;
		for(i = 0; i < l; ++i) {
			minIndex = i;
			for(j = i + 1; j < l; ++j) {
				if(a[j] < a[minIndex]) {
					minIndex = j;
				}
			}
			if(minIndex != i) {
				int temp = a[i];
				a[i] = a[minIndex];
				a[minIndex] = temp;				
			}
		}
		return a;
	}
	
	public static void print(Integer[] array) {
		for(Integer i : array) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		Integer[] input = {15,5,38,44,19,47};
		print(input);
		Integer[] result = selectionSort(input);
		print(result);
		
	}
	
}
