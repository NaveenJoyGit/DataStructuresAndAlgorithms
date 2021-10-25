package MultiplePointerPattern;

import java.util.ArrayList;
import java.util.List;

public class SumZero {
	
	public static List<Integer> smallestPairWithSumZero(Integer[] array) {
		List<Integer> result = new ArrayList<>();
		Integer i = 0;
		Integer j = array.length - 1;
		
		while(i < j) {
			if(array[i] + array[j] > 0) {
				j--;
			}
			else if(array[i] + array[j] < 0) {
				i++;
			}
			else if(array[i] + array[j] == 0) {
				result.add(array[i]);
				result.add(array[j]);
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Integer[] array = {-4, -3, -2, 1, 2, 5};
		List<Integer> result = smallestPairWithSumZero(array);
		System.out.println(result);
	}

}
