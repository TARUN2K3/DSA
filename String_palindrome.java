public class String_palindrome {
    public static void main(String[] args) {
        String str = "abcdcba";
        char[] charArray = str.toCharArray();
        boolean result = palindrome(charArray);
        System.out.println("Is palindrome: " + result);
    }

    static boolean palindrome(char[] array) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        while (firstIndex < lastIndex) {
            if (!check(array[firstIndex], array[lastIndex])) {
                return false;
            }
            firstIndex++;
            lastIndex--;
        }
        return true;
    }

    static boolean check(char firstElement, char lastElement) {
        return firstElement == lastElement;
    }
}
