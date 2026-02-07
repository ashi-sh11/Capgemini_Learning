package Task_06_02_2026.Regex.StringCheck;

public class StringUtils {

    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public boolean isPalindrome(String str) {
        return str.equals(reverse(str));
    }

    public String toUpperCase(String str) {
        return str.toUpperCase();
    }
}
