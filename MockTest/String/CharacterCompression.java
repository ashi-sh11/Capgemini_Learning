package MockTest.String;
public class CharacterCompression {
    static void main() {
        String str = "aaabbcddd";
        System.out.println(Compresed(str));
    }
    public static String Compresed(String str){
        StringBuilder sb = new StringBuilder();
        int count =1;
        char prev = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if(prev==str.charAt(i)) count++;
            else{
                sb.append(prev).append(count);
                prev= str.charAt(i);
                count =1;
            }
        }
        sb.append(prev).append(count);
        return sb.toString();
    }
}
