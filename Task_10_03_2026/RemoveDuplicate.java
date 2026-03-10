package Task_10_03_2026;

import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "sharpstarZ";
        Set<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(!set.contains(ch)){

                set.add(ch);
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}