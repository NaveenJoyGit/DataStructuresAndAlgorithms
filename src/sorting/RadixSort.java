package sorting;

public class RadixSort {

	public static Integer digitCount(Integer num) {
		return num.toString().length();
	}

	public static Integer lengthOfLargestNumber(Integer[] array) {
		int max = 0;
		for (Integer i : array) {
			max = digitCount(i) > max ? digitCount(i) : max;
		}
		return max;
	}

	public static Integer getDigit(Integer num, int index) {
		return (int) ((Math.abs(num) / Math.pow(10, index)) % 10);
	}

	public static void addarrayToMatrix(Integer[][] matrx, Integer digit, Integer value) {
		for(int i = 0; i < matrx[digit].length; ++i) {
			if(matrx[digit][i] == null) {
				matrx[digit][i] = value;
				break;
			}
		}
	}

	public static void matrixToArray(Integer[][] matrix, Integer[] array) {
		int index = 0;
		for(int i = 0; i < 10; ++i) {
			for(int j = 0; j < matrix[i].length; ++j) {
				if(matrix[i][j] != null) {
					array[index] = matrix[i][j];
					index++;
				}
			}
		}
	}

	public static Integer[] radixSort(Integer[] arr) {
		Integer length = arr.length;
		Integer k = lengthOfLargestNumber(arr);
		for (int i = 0; i < k; ++i) {
			Integer[][] matrix = new Integer[10][length];
			for (int j = 0; j < length; ++j) {
				int digit = getDigit(arr[j], i);
				addarrayToMatrix(matrix, digit, arr[j]);
			}
			matrixToArray(matrix, arr);
		}
		return arr;
	}

	public static void printArray(Integer[] array) {
		for(Integer i : array) {
			System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
		Integer[] inputArray = {1,2333,4567890,45,2345,98,879,12476,7,23,988,5,13};
		Integer[] result = radixSort(inputArray);
		printArray(result);
	}

}
