package LeetcodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxLengthOfCocatinatedString {

	public static List<String> maxLength(List<String> arr) {
		List<String> resultArray = new ArrayList<>();
		int count = 0;
		for (int i = 0; i < arr.size(); ++i) {
			count = 0;
			for (int j = 0; j < arr.get(i).length() - 1; ++j) {
				if (arr.get(i).charAt(j) != arr.get(i).charAt(j + 1)) {
					count += 1;
					if (count == (arr.get(i).length() - 1)) {
						resultArray.add(arr.get(i));
					}
				}
			}
		}
		return resultArray;
	}

	public static void main(String[] args) {
		String[] str = {"un","iq","ue"};
		List<String> input = Arrays.asList(str);
		System.out.println(input);
		List<String> result = maxLength(input);
		System.out.println(result);
	}

}
