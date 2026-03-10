package Task_10_03_2026;

public class MaximumFrequency {
    static void main() {
        String str ="striingg";
        System.out.println(findMaxFrequency(str));
    }
    static char findMaxFrequency(String str){
        int[] charArray = new int[26];
        for (char ch : str.toCharArray()){
            charArray[ch-'a']++;
        }
        int maxCount = charArray[0];
        char c = (char) (0+'a');
        int secondMaxCount = charArray[1];

        for (int i = 1; i < 26; i++) {
            if(charArray[i] >maxCount){
                secondMaxCount = maxCount;
                maxCount= charArray[i];
                c = (char) (i+'a');
            }
            else if (secondMaxCount<charArray[i]) {
                secondMaxCount = charArray[i];
            }
        }
        if(secondMaxCount == maxCount ) return  '0';
        return c ;

    }
}
