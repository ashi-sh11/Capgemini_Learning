package Task_15_01_26.Level2;

public class PalindromeChecker {

    private String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String original = text.toLowerCase();
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        return original.equals(reversed);
    }

    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("The text \"" + text + "\" is a Palindrome.");
        } else {
            System.out.println("The text \"" + text + "\" is NOT a Palindrome.");
        }
    }
}
