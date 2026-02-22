package easy;

class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) { return false; };
        if (x % 10 == 0 && x != 0) {return false;}
        int revertedNumber = 0;
        while (x > revertedNumber) {
            int lastDigit = x % 10;
            revertedNumber = revertedNumber * 10 + lastDigit;
            x = x / 10;
        }
        return x == revertedNumber || x == revertedNumber / 10;

    }

    static void main() {
        System.out.println(isPalindrome(1001));
    }
}
