package LeetcodeProblems;

public class GuessNumberHigherOrLower {

    public static int GUESS_NO = 1702766719;

    public static int guess(int n) {
        if(n == GUESS_NO) return 0;
        else if(GUESS_NO < n) return 1;
        else return -1;
    }

    public static int guessNumber(int n) {

        int left = 1;
        int right = n;
        if(left == right) return left;
        int middle = 0;
        while(left <= right) {
            middle = left + Math.abs((right - left)/2);
            if(guess(middle) == 0) return middle;
            else if(guess(middle) == -1) {
                left = middle + 1;
            } else if(guess(middle) == 1) {
                right = middle - 1;
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        System.out.println(guessNumber(2126753390));
    }

    //2126753390
    //1702766719

}
