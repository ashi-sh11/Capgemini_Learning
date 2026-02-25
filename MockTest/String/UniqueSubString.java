package MockTest.String;

import java.util.HashMap;
import java.util.Map;

public class UniqueSubString {
    static void main() {
        String str = "abcabcbb";
        System.out.println(findUnique(str));
    }
    public static int findUnique(String str){
        Map<Character ,Integer> mp = new HashMap<>();
        int right = 0,left =0;
        int maxLen=0;
        while (right<str.length()){
            mp.put(str.charAt(right),mp.getOrDefault(str.charAt(right),0)+1);
            if(right-left+1 >mp.size()){
                mp.put(str.charAt(left),mp.get(str.charAt(left))-1);
                if(mp.get(str.charAt(left))==0){
                    mp.remove(str.charAt(left));
                }
                left++;
            }
            maxLen = Math.max(right-left+1,maxLen);
            right++;
        }
        return maxLen;
    }
}
