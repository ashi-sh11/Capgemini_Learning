package MockTest.String;

public class InterleavedMerge {
    static void main() {
        String str = "abcd";
        String str1="XYZ";
        System.out.println(merge(str,str1));
    }
    public static String merge(String str ,String str1){
        int i =0,j=0;
        StringBuilder sb = new StringBuilder();
        while(i<str.length() && j<str1.length()){
            sb.append(str.charAt(i));
            sb.append(str1.charAt(j));
            i++;
            j++;
        }
        if(i<str.length()){
            sb.append(str.substring(i));
        }
        else{
            sb.append(str1.substring(j));
        }
        return sb.toString();
    }
}
