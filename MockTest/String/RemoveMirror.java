package MockTest.String;

public class RemoveMirror {
    static void main() {
        String str ="abccba";
        System.out.println(remove(str));
        String str1 ="xyyx";
        System.out.println(remove(str1));
    }
    public static String remove(String str){
        String first = str.substring(0,str.length()/2);
        String second = str.substring(str.length()/2);
        StringBuilder sb = new StringBuilder(second).reverse();
        if(sb.toString().equals(first)){
            return first;
        }
        return str;
    }
}
