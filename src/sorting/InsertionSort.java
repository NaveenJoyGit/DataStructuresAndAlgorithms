package sorting;

public class InsertionSort {

	public static Integer[] insertionSortCustom(Integer[] a) {
		int swapIndex;
		for(int i = 0; i < a.length - 1; ++i) {
			swapIndex = i + 1;
			for(int j = i + 1; j >= 0 && j < a.length; --j) {
				if(a[swapIndex] < a[j]) {
					int temp = a[swapIndex];
					a[swapIndex] = a[j];
					a[j] = temp;
					swapIndex = j;					
				}
			}
		}
		return a;
	}
	
	public static Integer[] insertionSort(Integer[] a) {
		int currentVal;
		int j;
		for(int i = 1; i < a.length; ++i) {
			currentVal = a[i];
			System.out.println(currentVal);
			for(j = i - 1; j >=0 && a[j] > currentVal; --j) {
				a[j + 1] = a[j];
				print(a);
			}
			System.out.println("+++++++++++++");
			a[j + 1] = currentVal;
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
		Integer[] input = {15,5,38,44,19,2};
		print(input);
		System.out.println("****************");
//		Integer[] result = insertionSortCustom(input);
		Integer[] result = insertionSort(input);
		System.out.println("OUTPUT");
		System.out.println("------");
		print(result);
		
	}
	
}
