package MockTest.String;

public class ToggleCase {
    static void main() {
        String str ="java Programming";
        System.out.println(toggleIndex(str));
    }
    public static String toggleIndex(String str){
        StringBuilder sb = new StringBuilder();
        String[] strArray = str.split(" ");
        for (String s :strArray){
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0) {
                    String st =""+ s.charAt(i);
                    sb.append(st.toUpperCase());
                } else {
                    String st =""+ s.charAt(i);
                    sb.append(st.toLowerCase());
                }
            }
            sb.append(" ");
        }
        return sb.toString();
    }
}
