package LeetcodeProblems;

public class StringToInteger {
	
	public static int myAtoi(String s) {
		String newS = s.strip();
        double lRes = 0;
        int num = 0;
        Integer sign = 1;
        System.out.println(newS);
        if(newS.length() < 1) return 0;
        if(newS.charAt(0) == '-') 
        	sign = -1;
        else if(newS.charAt(0) == '+') 
        	sign = 1;
        for(int i = 0; i < newS.length(); ++i) {
        	char c = newS.charAt(i);
            if((c == '-' || c == '+') && i == 0) continue;
        	num = Character.getNumericValue(c);
        	if((c >= 'a' && c <= 'z') || num == -1) break;
            else {
            	lRes = (lRes * 10) + num;
            }
        }
        lRes = sign * lRes;
        System.out.println(lRes);
        if(lRes >= (Integer.MAX_VALUE - 1)) 
        	return Integer.MAX_VALUE - 1;
        else if(lRes < Integer.MIN_VALUE) 
        	return Integer.MIN_VALUE;
        return (int)lRes;
    }
	
	public static void main(String[] args) {
		String s = "9223372036854775808";
		System.out.println(myAtoi(s));
		
		System.out.println("*****max value*******");
		System.out.println(Integer.MAX_VALUE);
	}

}
