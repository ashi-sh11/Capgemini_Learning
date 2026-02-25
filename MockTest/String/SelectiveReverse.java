package MockTest.String;

public class SelectiveReverse {
    static void main() {
        String str = "I love Java Programming very much";
        System.out.println(reverse(str).trim());
    }
    public static String reverse(String str){
        StringBuilder sb =  new StringBuilder();
        String[] strArray = str.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            if(i%2!=0){
                StringBuilder temp =  new StringBuilder();
                temp.append(strArray[i]);
                sb.append(temp.reverse()).append(" ");
            }else {
                sb.append(strArray[i]).append(" ");
            }
        }
        return sb.toString();
    }
}
