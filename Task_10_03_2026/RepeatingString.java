package Task_10_03_2026;

public class RepeatingString {
    static void main() {
        String str ="abc";
        int value = 3;
        System.out.println(createRepeat(str,value));
    }
    static String createRepeat(String str , int value){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < value; i++) {
            result.append(str);
        }
        return result.toString();
    }
}
