public class Palindrome {
    static boolean isPalindrome(int x) {

        String xStr = String.valueOf(x);
        int length = xStr.length();
        // Двигаемся с обоих концов слова к середине
        for (int i = 0; i < (length / 2); i++) {
            // Сравниваем символы попарно
            if (xStr.charAt(i) != xStr.charAt(length - i - 1)) {
                // Если найдено несоответствие - слово не палиндром
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome(121)); // true
        System.out.println(Palindrome.isPalindrome(-121)); // false
    }
}
