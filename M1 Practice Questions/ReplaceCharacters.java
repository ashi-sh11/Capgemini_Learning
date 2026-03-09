package Task_09_03_2026;

public class ReplaceCharacters {
    static void main() {
        char ch1 = 'a';
        char ch2 = 'p';
        String str = "apples";
        System.out.println(replace(str,ch1,ch2));
    }
    static String replace(String str , char ch1, char ch2){
        if(str.isEmpty() || ch1 == ch2 )return str;
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()){
            if(c == ch1) sb.append(ch2);
            else if(c == ch2) sb.append(ch1);
            else sb.append(c);
        }
        return sb.toString();
    }
}
