package MultiplePointerPattern;

public class CountUniqueValues {
	
	//array should be sorted
	//The function basically accumulates all unique values to the left of the array
	public static Integer countUniqueValues(Integer[] a) {
		Integer i = 0, j = 1, count = 0;
		while(j < a.length) {
			if(a[i] != a[j]) {
				count++;
				i++;
				a[i] = a[j];
				j++;
			}
			else j++;
		}
		return count + 1;
	}

	
	/*[1, 3, 5, 5, 5, 4, 3, 1]
	 * [3, 5, 4, 5, 5, 4, 3, 1]
	 *       
	 * 
	 * c = 2
	*/
	public static void main(String[] args) {
		Integer[] ar = {1,2,3,4,4,4,7,7,12,12,13};
		Integer result = countUniqueValues(ar);
		System.out.println(result);
	}
	
}
