package Task_10_03_2026;

public class PalindromeCount {
    public static void main(String[] args) {
        String str = "this is level 71";
        int n = str.length();

        System.out.println(countPalindrome(str, n));
    }
    static int countPalindrome(String str, int n){
        String[] words = str.split(" ");
        int count = 0;
        for(String word : words){
            if(isPalindrome(word)){
                count++;
            }
        }
        return count;
    }
    static boolean isPalindrome(String word){
        int left = 0;
        int right = word.length() - 1;
        while(left < right){
            if(word.charAt(left) != word.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}