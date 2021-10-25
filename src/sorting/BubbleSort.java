package sorting;

public class BubbleSort {

	public static Integer[] bubbleSortAlgo(Integer[] a) {
		Integer[] res = null;
		res = a;
		int length = a.length;
		for(int i = length; i > 0; --i) {
			for(int j = 0; j < i - 1; ++j) {
				if(res[j] >= res[j + 1]) {
					int temp = res[j];
					res[j] = res[j + 1];
					res[j + 1] = temp;
				}
			}
		}
		return res;
	}
	
	public static Integer[] bubbleSortAlgoOptimized(Integer[] a) {
		Integer[] res = null;
		res = a;
		int length = a.length;
		Boolean noSwaps;
		for(int i = length; i > 0; --i) {
			noSwaps = true;
			for(int j = 0; j < i - 1; ++j) {
				if(res[j] >= res[j + 1]) {
					int temp = res[j];
					res[j] = res[j + 1];
					res[j + 1] = temp;
					noSwaps = false;
				}
			}
			if(noSwaps) break;
		}
		return res;
	}
	
	
	public static void main(String[] args) {
		Integer[] input = {37,49,25,8};
		for(Integer i : input) {
			System.out.print(i);
		}
		Integer[] result = bubbleSortAlgoOptimized(input);
		System.out.println("*****output******");
		for(Integer i : result) {
			System.out.print(i + " ");
		}
	}
	
}
