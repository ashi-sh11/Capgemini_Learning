package Task_07_03_2026_M1_Practices_Questions;

public class ReplaceCharacters {

    public static void main(String[] args) {

        String str = "apples";
        char ch1 = 'a';
        char ch2 = 'p';

        System.out.println(replace(str,ch1,ch2));
    }
    static String replace(String str,char ch1,char ch2){
        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ch1)
                arr[i]=ch2;

            else if(arr[i]==ch2)
                arr[i]=ch1;
        }
        return new String(arr);
    }
}