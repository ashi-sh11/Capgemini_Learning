package MockTest.Array;

public class RotationPalindrome {
    static void main() {
        String str= "aab";
        System.out.println(findPalindrome(str));
    }
    static boolean findPalindrome(String str){
        for (int i = 1; i <= str.length(); i++) {
            String st = str.substring(i)+str.substring(0,i);
            if(isPalindrome(st)){
                return true;
            }
        }
        return false;
    }

    public static boolean isPalindrome (String st ){
        int s =0,e =st.length()-1;
        while (s<e){
            if (st.charAt(s)!=st.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}
