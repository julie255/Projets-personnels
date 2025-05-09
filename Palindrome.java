public class Palindrome{

    public static boolean estPalindrome(int n) {
        int inverse = 0;
        int original = n;
        while (n > 0) {
            inverse = (inverse * 10) +( n % 10);
            n= n/10;
        }
        return original == inverse;
    }

    public static int palindrome() {
        int max = 0;
        for (int i = 999; i >= 100; i--) {
            for (int j = i; j >= 100; j--) {
                int mult = i * j;
                if (estPalindrome(mult) && mult > max) {
                    max = mult;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(palindrome());
    }
}