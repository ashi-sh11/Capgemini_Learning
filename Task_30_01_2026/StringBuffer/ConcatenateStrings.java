package Task_30_01_2026.StringBuffer;

public class ConcatenateStrings {

    public static String concatenate(String[] arr) {
        StringBuffer buffer = new StringBuffer();

        for (String ele : arr){
            buffer.append(ele);
        }
        return buffer.toString();
    }
    public static void main(String[] args) {
        String[] words = {"Java", " ", "is", " ", "powerful"};
        String result = concatenate(words);
        System.out.println("Concatenated String: " + result);
    }
}
