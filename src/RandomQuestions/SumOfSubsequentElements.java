package RandomQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfSubsequentElements {
	
	public static List<Integer> sumOfSubsequentElementArray(List<Integer> input) {
		List<Integer> result = new ArrayList<>();
		Integer sum = 0;
		for(int i = 1; i < input.size(); ++i) {
			sum += input.get(i);
		}
		result.add(sum);
		for(int i = 1; i < input.size() - 1; ++i) {
			sum -= input.get(i);
			result.add(sum);
		}
		return result;
	}

	public static void main(String[] args) {
		Integer[] input = {10, 20, 30, 40, 50};
		List<Integer> listInput = Arrays.asList(input);
		List<Integer> res = sumOfSubsequentElementArray(listInput);
		System.out.println(res);
	}

}
