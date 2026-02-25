package MockTest.String;

import java.util.Arrays;

public class FindFirst {
    static void main() {
        String[] str = {"happ","java","python","c++","java","c","python"};
        findFist(str);
    }
    public static void findFist(String[] str){
        int minIdx = 100;
        String orgString ="";
        for (int i = 0; i < str.length; i++) {
            if(orgString.contains(str[i])){
                System.out.println(str[i]);
                break;
            }
            orgString +=str[i];
        }
    }
}
