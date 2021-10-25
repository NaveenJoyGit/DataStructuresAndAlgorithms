package LeetcodeProblems;

public class LongestCommonPrefix {
	
	public static String longestCommonPrefix(String[] strs) {
        Integer ref = 0, i = 0, j = 0, max = 0;
        while(i < (strs.length - 1)) {
            if(strs[i].charAt(j) == strs[i + 1].charAt(j)) {
                ref += 1;
                i++;
                if(ref == strs.length - 1) {
                	j++;
                	i=0;
                	max += 1;
                	ref = 0;
                }
            }
            else break;
        }
        if(max == 0) return "";
        String result = strs[0].substring(0, max);
        return result;
    }

	public static void main(String[] args) {
		String[] array = {"flower","flow","flight"};
		String result = longestCommonPrefix(array);
		System.out.println(result);
	}

}
