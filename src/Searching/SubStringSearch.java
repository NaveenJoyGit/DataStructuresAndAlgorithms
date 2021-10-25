package Searching;

public class SubStringSearch {
	
	public static Integer isSubString(String s1, String s2) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Integer j = 0, finalCount = 0;
		for(int i = 0; i < c1.length; ++i) {
			if(c2[j] == c1[i]) {
				j++;
				if(j == c2.length) {
					finalCount += 1;
					j = 0;
				}
			}
			else j = 0;				
		}
		return finalCount;
	}

	public static void main(String[] args) {
		Integer result = isSubString("mowgmjhmgowghjio", "owg");
		System.out.println(result);
	}

}
