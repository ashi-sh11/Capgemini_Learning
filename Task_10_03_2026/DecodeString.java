package Task_10_03_2026;

public class DecodeString {
    static void main() {
        String str = "1011011101";
        System.out.println(decode(str));
    }
    static String decode(String  str){
        int count =-1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='1') count++;
            else {
                sb.append((char) (count+'A'));
                count=-1;
            }
        }
        if(count!=-1){
            sb.append((char) (count+'A'));
        }
        return sb.toString();
    }
}
