package Recursion;

import java.util.ArrayList;
import java.util.List;

public class ProductOfArray {

	public static Integer prodOfArray(List<Integer> array) {
		if(array.size() == 1) return array.get(0);
		Integer num = array.get(0);
		array.remove(0);
		return num * prodOfArray(array);
	}
	
	public static void main(String[] args) {
		List<Integer> array = new ArrayList<>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(10);
		Integer result = prodOfArray(array);
		System.out.println(result);
	}

}
