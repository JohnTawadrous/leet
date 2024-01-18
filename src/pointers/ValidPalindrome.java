package pointers;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {

        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        char[] arr = s.toCharArray();

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }
        return true;
    }
}
