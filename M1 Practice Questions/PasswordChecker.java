package Task_09_03_2026;
import  java.util.*;
public class PasswordChecker {
    static void main() {
        String  regex = "^(?=.*[0-9])(?=.*[A-Z])[^0-9 /][^ /]{4,}$";
        String str = "aA1_67";
        String str1 = "aA1";

        String str2 = "a987 abc012";
        System.out.println(isValid(str1,regex));
    }

    private static int isValid(String str,String regex ) {
        if(str.matches(regex)) return  1;
        return 0;
    }
}
