package Recursion;

import java.util.ArrayList;
import java.util.List;

public class FindOddNumbers {

	public static void main(String[] args) {
		List<Integer> result = new ArrayList<>();
		List<Integer> array = new ArrayList<>();
		array.add(2);
		array.add(1);
		array.add(3);
		array.add(4);
		array.add(5);
		array.add(10);
		array.add(8);
//		findOdd(array, result);
		System.out.println(result);
		List<Integer> res = findOddPureRecursive(array);
		System.out.println(res);
  	}

	public static void findOdd(List<Integer> a, List<Integer> list) {
		if (a.size() == 0)
			return;
		if (a.get(0) % 2 != 0) {
			list.add(a.get(0));
		}
		a.remove(0);
		findOdd(a, list);
	}
	
	public static List<Integer> findOddPureRecursive(List<Integer> a) {
		List<Integer> list = new ArrayList<>();
		if(a.size() == 0) return list;
		if(a.get(0) % 2 != 0) list.add(a.get(0));
		a.remove(0);
		Boolean isIt = list.addAll(findOddPureRecursive(a));
		System.out.println(isIt);
		return list;
	}

}
