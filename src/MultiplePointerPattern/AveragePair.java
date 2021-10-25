package MultiplePointerPattern;

public class AveragePair {

	/*
	 * [1,2,3] 2.5
	 */
	
	public static Boolean averagePair(Integer[] a, Double avg) {
		Integer i = 0, j = a.length - 1;
		Double average;
		while(i < j) {
			average = ((double)a[i] + (double)a[j])/2d;
			System.out.println(average);
			if(average < avg) i++;
			else if(average > avg) j--;
			else {
				System.out.println(a[i] + " + " + a[j] + " = " + average);
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {

		Integer[] a = {1,3,3,5,6,7,10,12,19};
		System.out.println(averagePair(a, 8d)?"PASS":"FAIL");
		
	}

}
